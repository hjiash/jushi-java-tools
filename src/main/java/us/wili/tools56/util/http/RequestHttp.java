package us.wili.tools56.util.http;

/**
 * Created by JasonY on 18/3/20.
 */
public interface RequestHttp<H, P> {

    /**
     * 返回httpClient
     *
     */
    H getRequestHttpClient();

    /**
     * 返回代理httpProxy
     *
     */
    P getRequestHttpProxy();

    HttpType getRequestType();

}
