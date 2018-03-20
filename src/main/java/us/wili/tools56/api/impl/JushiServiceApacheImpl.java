package us.wili.tools56.api.impl;

import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;
import us.wili.tools56.config.JushiProperties;
import us.wili.tools56.util.http.HttpType;
import us.wili.tools56.util.http.apache.ApacheHttpClientBuilder;
import us.wili.tools56.util.http.apache.DefaultApacheHttpClientBuilder;

/**
 * Created by JasonY on 18/3/20.
 */
public class JushiServiceApacheImpl extends JushiServiceAbstractImpl<CloseableHttpClient, HttpHost> {

    private CloseableHttpClient httpClient;
    private HttpHost httpProxy;

    @Override
    public CloseableHttpClient getRequestHttpClient() {
        return httpClient;
    }

    @Override
    public HttpHost getRequestHttpProxy() {
        return httpProxy;
    }

    @Override
    public HttpType getRequestType() {
        return HttpType.APACHE_HTTP;
    }

    @Override
    public void initHttp() {
        JushiProperties properties = this.getProperties();

        ApacheHttpClientBuilder apacheHttpClientBuilder = DefaultApacheHttpClientBuilder.get();

        apacheHttpClientBuilder.httpProxyHost(properties.getHttpProxyHost())
                .httpProxyPort(properties.getHttpProxyPort())
                .httpProxyUsername(properties.getHttpProxyUsername())
                .httpProxyPassword(properties.getHttpProxyPassword());

        if (properties.getHttpProxyHost() != null && properties.getHttpProxyPort() > 0) {
            this.httpProxy = new HttpHost(properties.getHttpProxyHost(), properties.getHttpProxyPort());
        }

        this.httpClient = apacheHttpClientBuilder.build();
    }
}
