package us.wili.tools56.util.http;

import us.wili.tools56.util.http.apache.ApacheGetRequestExecutor;
import us.wili.tools56.util.http.apache.ApachePostRequestExecutor;

/**
 * Created by JasonY on 18/3/20.
 */
public abstract class SimpleGetRequestExecutor<H, P> implements RequestExecutor<String, String> {

    protected RequestHttp<H, P> requestHttp;

    public SimpleGetRequestExecutor(RequestHttp requestHttp) {
        this.requestHttp = requestHttp;
    }

    public static RequestExecutor<String, String> create(RequestHttp requestHttp) {
        switch (requestHttp.getRequestType()) {
            case APACHE_HTTP:
                return new ApacheGetRequestExecutor(requestHttp);
            default:
                throw new IllegalArgumentException("非法请求参数");
        }
    }
}
