package us.wili.tools56.util.http.apache;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.apache.http.Consts;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import us.wili.tools56.exception.JushiErrorCode;
import us.wili.tools56.exception.JushiErrorException;
import us.wili.tools56.model.resp.BaseResp;
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
    public String execute(String uri, String data) throws JushiErrorException, IOException {
        HttpPost httpPost = new HttpPost(uri);
        if (requestHttp.getRequestHttpProxy() != null) {
            RequestConfig config = RequestConfig.custom().setProxy(requestHttp.getRequestHttpProxy()).build();
            httpPost.setConfig(config);
        }

        if (data != null) {
            StringEntity entity = new StringEntity(data, Consts.UTF_8);
            httpPost.setEntity(entity);
        }

        try (CloseableHttpResponse response = requestHttp.getRequestHttpClient().execute(httpPost)) {
            String responseContent = Utf8ResponseHandler.INSTANCE.handleResponse(response);
            if (responseContent.isEmpty()) {
                throw new JushiErrorException(JushiErrorCode.REQUEST_ERROR);
            }

            BaseResp baseResp = BaseResp.fromJson(responseContent);
            if (baseResp.getCode() == null || !baseResp.getCode().equals(JushiErrorCode.SUCCESS.getCode())) {
                throw new JushiErrorException(baseResp.getCode(), baseResp.getMsg());
            }

            return responseContent;
        } finally {
            httpPost.releaseConnection();
        }
    }
}
