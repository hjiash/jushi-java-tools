package us.wili.tools56.exception;

/**
 * Created by JasonY on 18/3/20.
 */
public enum JushiToolsErrorCode {

    ;

    private String message;
    private String code;

    JushiToolsErrorCode(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
