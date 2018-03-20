package us.wili.tools56.util.http.apache;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by JasonY on 18/3/20.
 */
public class Utf8ResponseHandler implements ResponseHandler<String> {
    public static final ResponseHandler<String> INSTANCE = new Utf8ResponseHandler();

    @Override
    public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
        final StatusLine statusLine = response.getStatusLine();
        final HttpEntity entity = response.getEntity();

        if (statusLine.getStatusCode() >= 300) {
            EntityUtils.consume(entity);
            throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
        }

        return entity == null ? null : EntityUtils.toString(entity, Consts.UTF_8);
    }
}
