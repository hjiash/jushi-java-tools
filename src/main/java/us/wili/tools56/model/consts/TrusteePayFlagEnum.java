package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum TrusteePayFlagEnum {
    ORDINARY("1", "普通"),
    FIDUCIARY_PAYMENT("2", "受托支付")
    ;

    private String code;
    private String desc;

    private TrusteePayFlagEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static TrusteePayFlagEnum get(String code) {
        for (TrusteePayFlagEnum trusteePayFlagEnum : TrusteePayFlagEnum.values()){
            if (trusteePayFlagEnum.getCode().equals(code)){
                return trusteePayFlagEnum;
            }
        }

        return ORDINARY;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
