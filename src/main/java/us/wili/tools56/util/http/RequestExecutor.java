package us.wili.tools56.util.http;

import org.apache.http.Header;
import us.wili.tools56.exception.JushiErrorException;

import java.io.IOException;

/**
 * Created by JasonY on 18/3/20.
 */
public interface RequestExecutor<T, E> {

    /**
     * @param uri  uri
     * @param data 数据
     * @throws JushiErrorException
     * @throws IOException
     */
    T execute(String uri, Header[] headers, E data) throws JushiErrorException, IOException;

}
