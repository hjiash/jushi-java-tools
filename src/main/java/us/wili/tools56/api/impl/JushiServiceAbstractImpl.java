package us.wili.tools56.api.impl;

import com.alibaba.fastjson.JSON;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.wili.tools56.api.*;
import us.wili.tools56.config.JushiProperties;
import us.wili.tools56.exception.JushiErrorCode;
import us.wili.tools56.exception.JushiErrorException;
import us.wili.tools56.model.req.BaseReq;
import us.wili.tools56.model.resp.BaseResp;
import us.wili.tools56.util.crypto.CryptoUtil;
import us.wili.tools56.util.crypto.SignUtil;
import us.wili.tools56.util.http.RequestExecutor;
import us.wili.tools56.util.http.RequestHttp;
import us.wili.tools56.util.http.SimpleGetRequestExecutor;
import us.wili.tools56.util.http.SimplePostRequestExecutor;
import us.wili.tools56.util.http.apache.ApacheHttpClientBuilder;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by JasonY on 18/3/20.
 */
public abstract class JushiServiceAbstractImpl<H, P> implements JushiService, RequestHttp<H, P> {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private JushiProperties properties;
    private AccountService accountService = new AccountServiceImpl(this);
    private AssetsService assetsService = new AssetsServiceImpl(this);
    private BankrollService bankrollService = new BankrollServiceImpl(this);
    private MarketingService marketingService = new MarketingServiceImpl(this);
    private QueryService queryService = new QueryServiceImpl(this);
    private TransactionService transactionService = new TransactionServiceImpl(this);
    private EnterpriseService enterpriseService = new EnterpriseServiceImpl(this);
    private BatchService batchService = new BatchServiceImpl(this);

    /**
     * http client builder
     *
     * @return ApacheHttpClientBuilder
     */
    private ApacheHttpClientBuilder apacheHttpClientBuilder;

    private SignUtil signUtil;
    private CryptoUtil cryptoUtil;

    public JushiServiceAbstractImpl() {}

    public JushiServiceAbstractImpl(JushiProperties properties) {
        this.properties = properties;
        init();
    }

    protected void init() {
        this.signUtil = new SignUtil(properties.getKey(), properties.getSecret());
        this.cryptoUtil = new CryptoUtil(properties.getPublicKey(), properties.getPrivateKey());

        initHttp();
    }

    @Override
    public <T extends BaseResp> T get(BaseReq req, Class<T> clazz) throws JushiErrorException {
        return null;
    }

    @Override
    public <T extends BaseResp> T post(BaseReq req, Class<T> clazz) throws JushiErrorException {
        // 设置头部和请求报文主体，发送请求
        Header[] headers = createHeaders();

        String body = execute(SimplePostRequestExecutor.create(this), properties.getApiUrl(), headers, signAndEncrypt(req));
        return decode(body, clazz);
    }

    protected Header[] createHeaders() {
        // 设置头部和请求报文主体，发送请求
        Header[] headers = new Header[4];
        headers[0] = new BasicHeader("rft-key", properties.getKey());
        headers[1] = new BasicHeader("rft-org", properties.getOrg());
        headers[2] = new BasicHeader("Content-Encoding", "UTF-8");
        headers[3] = new BasicHeader("Content-Type", "application/json");

        return headers;
    }

    @Override
    public String get(String uri, Header[] headers) {
        return execute(SimpleGetRequestExecutor.create(this), uri, headers, null);
    }

    @Override
    public String post(String uri, Header[] headers, String data) {
        return execute(SimplePostRequestExecutor.create(this), uri, headers, data);
    }

    /**
     * 发送请求
     */
    @Override
    public <T, E> T execute(RequestExecutor<T, E> executor, String uri, Header[] headers, E data) {
        try {
            T result = executor.execute(uri, headers, data);

            if (logger.isDebugEnabled()) {
                logger.debug("\n[请求地址]: {}\n[请求参数]：{}\n[响应数据]：{}", uri, data, result);
            }

            return result;
        } catch (IOException e) {
            logger.error("\n【请求地址】: {}\n【请求参数】：{}\n【异常信息】：{}", uri, data, e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public String sign(BaseResp resp) {
        return signUtil.sign(resp.toMap());
    }

    @Override
    public String sign(BaseReq req) {
        return signUtil.sign(req.toMap());
    }

    @Override
    public String encrypt(String plain) {
        return cryptoUtil.encode(plain);
    }

    @Override
    public String decrypt(String cipher) {
        return cryptoUtil.decode(cipher);
    }

    @Override
    public <T extends BaseResp> T decode(String body, Class<T> clazz) {
        String plain = cryptoUtil.decode(body);
        if (logger.isDebugEnabled()) {
            logger.debug("[返回明文]：{}", plain);
        }

        T baseResp = JSON.parseObject(plain, clazz);

        if (!JushiErrorCode.SUCCESS.getCode().equals(baseResp.getCode())) {
            throw new JushiErrorException(baseResp.getCode(), baseResp.getMsg());
        }

        /**
         * 返回结果中，有些可选值可能为空字符串或者为null
         * 为null的值需要从校验map中去除，避免被当作空字符串处理
         * 导致和钜石返回的签名不一致
         */
        Map<String, Object> respMap = baseResp.toMap();
        Map<String, Object> formatRespMap = new HashMap<>();
        for (String key : respMap.keySet()) {
            if (respMap.get(key) != null) {
                formatRespMap.put(key, respMap.get(key));
            }
        }
        String sign = signUtil.sign(formatRespMap);

        if (!sign.equals(baseResp.getSign())) {
            throw new JushiErrorException(JushiErrorCode.CUSTOM_SING_INVALID);
        }

        return baseResp;
    }

    protected String signAndEncrypt(BaseReq req) {
        Map<String, Object> reqMap = req.toMap();
        String sign = signUtil.sign(req.toMap());
        reqMap.put("sign", sign);

        String jsonStr = JSON.toJSONString(reqMap);
        String encryptJsonStr = cryptoUtil.encode(jsonStr);

        return encryptJsonStr;
    }

    public JushiProperties getProperties() {
        return properties;
    }

    public void setProperties(JushiProperties properties) {
        this.properties = properties;
        init();
    }

    public SignUtil getSignUtil() {
        return signUtil;
    }

    public CryptoUtil getCryptoUtil() {
        return cryptoUtil;
    }

    public ApacheHttpClientBuilder getApacheHttpClientBuilder() {
        return apacheHttpClientBuilder;
    }

    public void setApacheHttpClientBuilder(ApacheHttpClientBuilder apacheHttpClientBuilder) {
        this.apacheHttpClientBuilder = apacheHttpClientBuilder;
    }

    @Override
    public RequestHttp getRequestHttp() {
        return this;
    }

    @Override
    public AccountService getAccountService() {
        return this.accountService;
    }

    @Override
    public void setAccountService(AccountService service) {
        this.accountService = service;
    }

    @Override
    public AssetsService getAssetsService() {
        return this.assetsService;
    }

    @Override
    public void setAssetsService(AssetsService service) {
        this.assetsService = service;
    }

    @Override
    public BankrollService getBankrollService() {
        return this.bankrollService;
    }

    @Override
    public void setBankrollService(BankrollService service) {
        this.bankrollService = service;
    }

    @Override
    public MarketingService getMarketingService() {
        return this.marketingService;
    }

    @Override
    public void setMarketingService(MarketingService service) {
        this.marketingService = service;
    }

    @Override
    public QueryService getQueryService() {
        return this.queryService;
    }

    @Override
    public void setQueryService(QueryService service) {
        this.queryService = service;
    }

    @Override
    public TransactionService getTransactionService() {
        return this.transactionService;
    }

    @Override
    public void setTransactionService(TransactionService service) {
        this.transactionService = service;
    }

    @Override
    public EnterpriseService getEnterpriseService() {
        return enterpriseService;
    }

    @Override
    public void setEnterpriseService(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @Override
    public BatchService getBatchService() {
        return batchService;
    }

    @Override
    public void setBatchService(BatchService batchService) {
        this.batchService = batchService;
    }
}
