package us.wili.tools56.api;

import us.wili.tools56.config.JushiProperties;
import us.wili.tools56.exception.JushiErrorException;
import us.wili.tools56.model.BaseModel;
import us.wili.tools56.model.req.BaseReq;
import us.wili.tools56.model.resp.BaseResp;
import us.wili.tools56.util.crypto.CryptoUtil;
import us.wili.tools56.util.crypto.SignUtil;
import us.wili.tools56.util.http.HttpType;
import us.wili.tools56.util.http.RequestExecutor;
import us.wili.tools56.util.http.RequestHttp;

/**
 * Created by JasonY on 18/3/20.
 */
public interface JushiService {

    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有API中的GET请求
     */
    <T extends BaseResp> T getUseApi(BaseReq req, Class<T> clazz) throws JushiErrorException;

    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有API中的GET请求
     */
    <T extends BaseResp> T postUseApi(BaseReq req, Class<T> clazz) throws JushiErrorException;

    /**
     * 当本Service没有实现某个页面API的时候，可以用这个，针对所有页面API中的GET请求
     */
    <T extends BaseResp> T getUsePage(BaseReq req, Class<T> clazz) throws JushiErrorException;

    /**
     * 当本Service没有实现某个页面API的时候，可以用这个，针对所有页面API中的GET请求
     */
    <T extends BaseResp> T postUsePage(BaseReq req, Class<T> clazz) throws JushiErrorException;

    <T, E> T execute(RequestExecutor<T, E> executor, String uri, E data);

    SignUtil getSignUtil();
    CryptoUtil getCryptoUtil();

    String sign(BaseResp resp);
    String sign(BaseReq req);

    String encrypt(String plain);
    String decrypt(String cipher);

    <T extends BaseResp> T decode(String body, Class<T> clazz);

    /**
     * 初始化http请求对象
     */
    void initHttp();

    /**
     * @return RequestHttp对象
     */
    RequestHttp getRequestHttp();

    JushiProperties getProperties();
    void setProperties(JushiProperties properties);

    AccountService getAccountService();
    void setAccountService(AccountService service);

    AssetsService getAssetsService();
    void setAssetsService(AssetsService service);

    BankrollService getBankrollService();
    void setBankrollService(BankrollService service);

    MarketingService getMarketingService();
    void setMarketingService(MarketingService service);

    QueryService getQueryService();
    void setQueryService(QueryService service);

    TransactionService getTransactionService();
    void setTransactionService(TransactionService service);

    EnterpriseService getEnterpriseService();
    void setEnterpriseService(EnterpriseService service);

    BatchService getBatchService();
    void setBatchService(BatchService service);
}
