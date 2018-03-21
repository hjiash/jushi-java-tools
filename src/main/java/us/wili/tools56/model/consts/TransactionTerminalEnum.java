package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/21.
 */
public enum  TransactionTerminalEnum {
    PHONE_APP("000001", "手机APP"),
    PC("000002", "网页"),
    WECHAT("000003", "微信"),
    CABINET_SURFACE("000004", "柜面")
    ;

    private String code;
    private String desc;

    private TransactionTerminalEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static TransactionTerminalEnum get(String code) {
        for (TransactionTerminalEnum terminalEnum : TransactionTerminalEnum.values()){
            if (terminalEnum.getCode().equals(code)){
                return terminalEnum;
            }
        }

        return PC;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
