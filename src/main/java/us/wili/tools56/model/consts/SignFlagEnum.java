package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum SignFlagEnum {
    SIGNED("0", "已签约", "having"),
    UN_SIGN("1", "未签约", "revoking")
    ;

    private String code;
    private String desc;
    private String action;

    private SignFlagEnum(String code, String desc, String action){
        this.code = code;
        this.desc = desc;
        this.action = action;
    }

    public static SignFlagEnum get(String code) {
        for (SignFlagEnum signFlagEnum : SignFlagEnum.values()){
            if (signFlagEnum.getCode().equals(code)){
                return signFlagEnum;
            }
        }

        return UN_SIGN;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getAction(){ return action;}
}
