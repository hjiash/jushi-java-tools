package us.wili.tools56.exception;

/**
 * Created by JasonY on 18/3/20.
 */
public class JushiErrorException extends Exception {

    private String errCode;

    public JushiErrorException() {
    }

    public JushiErrorException(String errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public JushiErrorException(JushiErrorCode error) {
        super(error.getMessage());
        this.errCode = error.getCode();
    }

    public JushiErrorException(String errCode, String message, Throwable cause) {
        super(message, cause);
        this.errCode = errCode;
    }

    public JushiErrorException(JushiErrorCode error, Throwable cause, String errCode) {
        super(error.getMessage(), cause);
        this.errCode = error.getCode();
    }

    public JushiErrorException(Throwable cause) {
        super(cause);

        if (cause instanceof JushiErrorException) {
            this.errCode = ((JushiErrorException) cause).getErrCode();
        }
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
}
