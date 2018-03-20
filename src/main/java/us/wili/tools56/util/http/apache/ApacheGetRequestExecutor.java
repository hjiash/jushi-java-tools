package us.wili.tools56.util.http.apache;

import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;
import us.wili.tools56.exception.JushiErrorException;
import us.wili.tools56.util.http.RequestHttp;
import us.wili.tools56.util.http.SimpleGetRequestExecutor;

import java.io.IOException;

/**
 * Created by JasonY on 18/3/20.
 */
public class ApacheGetRequestExecutor extends SimpleGetRequestExecutor<CloseableHttpClient, HttpHost> {

    public ApacheGetRequestExecutor(RequestHttp requestHttp) {
        super(requestHttp);
    }

    @Override
    public String execute(String uri, String data) throws JushiErrorException, IOException {
        return null;
    }
}
