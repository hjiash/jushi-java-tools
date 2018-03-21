package us.wili.tools56.api.impl;

import com.alibaba.fastjson.JSON;
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
    }

    @Override
    public <T extends BaseResp> T getUseApi(BaseReq req, Class<T> clazz) throws JushiErrorException {
        return null;
    }

    @Override
    public <T extends BaseResp> T getUsePage(BaseReq req, Class<T> clazz) throws JushiErrorException {
        return null;
    }

    @Override
    public <T extends BaseResp> T postUseApi(BaseReq req, Class<T> clazz) throws JushiErrorException {
        String body = execute(SimplePostRequestExecutor.create(this), properties.getApiUrl(), signAndEncrypt(req));
        return decode(body, clazz);
    }

    @Override
    public <T extends BaseResp> T postUsePage(BaseReq req, Class<T> clazz) throws JushiErrorException {
        String body = execute(SimplePostRequestExecutor.create(this), properties.getPageUrl(), signAndEncrypt(req));
        return decode(body, clazz);
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

        T baseResp = JSON.parseObject(plain, clazz);
        String sign = signUtil.sign(baseResp.toMap());
        if (!sign.equals(baseResp.getSign())) {
            throw new JushiErrorException(JushiErrorCode.REQUEST_ERROR);
        }

        return baseResp;
    }

    protected String signAndEncrypt(BaseReq req) {
        String sign = signUtil.sign(req.toMap());
        req.setSign(sign);

        String jsonStr = JSON.toJSONString(req);
        String encryptJsonStr = cryptoUtil.encode(jsonStr);

        return encryptJsonStr;
    }


    /**
     * 向微信端发送请求，在这里执行的策略是当发生access_token过期时才去刷新，然后重新执行请求，而不是全局定时请求
     */
    public <T, E> T execute(RequestExecutor<T, E> executor, String uri, E data) throws JushiErrorException {
        try {
            T result = executor.execute(uri, data);

            if (logger.isDebugEnabled()) {
                logger.debug("\n【请求地址】: {}\n【请求参数】：{}\n【响应数据】：{}", uri, data, result);
            }

            return result;
        } catch (IOException e) {
            logger.error("\n【请求地址】: {}\n【请求参数】：{}\n【异常信息】：{}", uri, data, e.getMessage());
            throw new RuntimeException(e);
        }
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
