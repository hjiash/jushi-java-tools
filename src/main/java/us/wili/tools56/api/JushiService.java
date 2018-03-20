package us.wili.tools56.api;

import us.wili.tools56.config.JushiProperties;
import us.wili.tools56.exception.JushiErrorException;
import us.wili.tools56.model.BaseModel;
import us.wili.tools56.model.req.BaseReq;
import us.wili.tools56.util.http.HttpType;
import us.wili.tools56.util.http.RequestHttp;

/**
 * Created by JasonY on 18/3/20.
 */
public interface JushiService {

    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有API中的GET请求
     */
    <T> T getUseApi(BaseReq req) throws JushiErrorException;

    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有API中的GET请求
     */
    <T> T postUseApi(BaseReq req) throws JushiErrorException;

    /**
     * 当本Service没有实现某个页面API的时候，可以用这个，针对所有页面API中的GET请求
     */
    <T> T getUsePage(BaseReq req) throws JushiErrorException;

    /**
     * 当本Service没有实现某个页面API的时候，可以用这个，针对所有页面API中的GET请求
     */
    <T> T postUsePage(BaseReq req) throws JushiErrorException;

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
}
