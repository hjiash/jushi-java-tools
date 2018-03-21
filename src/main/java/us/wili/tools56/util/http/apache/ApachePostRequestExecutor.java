package us.wili.tools56.util.http.apache;

import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import us.wili.tools56.util.http.RequestHttp;
import us.wili.tools56.util.http.SimplePostRequestExecutor;

import java.io.IOException;

/**
 * Created by JasonY on 18/3/20.
 */
public class ApachePostRequestExecutor extends SimplePostRequestExecutor<CloseableHttpClient, HttpHost> {

    public ApachePostRequestExecutor(RequestHttp requestHttp) {
        super(requestHttp);
    }

    @Override
    public String execute(String uri, Header[] headers, String data) throws IOException {
        HttpPost httpPost = new HttpPost(uri);
        if (requestHttp.getRequestHttpProxy() != null) {
            RequestConfig config = RequestConfig.custom().setProxy(requestHttp.getRequestHttpProxy()).build();
            httpPost.setConfig(config);
        }

        if (headers.length > 0) {
            httpPost.setHeaders(headers);
        }

        if (data != null) {
            StringEntity entity = new StringEntity(data, Consts.UTF_8);
            httpPost.setEntity(entity);
        }

        CloseableHttpResponse response = requestHttp.getRequestHttpClient().execute(httpPost);
        try {
            return Utf8ResponseHandler.INSTANCE.handleResponse(response);
        } finally {
            httpPost.releaseConnection();
        }
    }
}
