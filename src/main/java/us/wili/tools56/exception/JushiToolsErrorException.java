package us.wili.tools56.exception;

/**
 * Created by JasonY on 18/3/20.
 */
public class JushiToolsErrorException extends RuntimeException {
    public JushiToolsErrorException() {
    }

    public JushiToolsErrorException(String message) {
        super(message);
    }

    public JushiToolsErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public JushiToolsErrorException(Throwable cause) {
        super(cause);
    }

    public JushiToolsErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
