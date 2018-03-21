package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum AuthFlagEnum {
    FIRST_RECHARGE("Y", "首次充值上送"),
    AFTER_RECHARGE("N", "之后充值上送")
    ;

    private String code;
    private String desc;

    private AuthFlagEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static AuthFlagEnum get(String code) {
        for (AuthFlagEnum authFlagEnum : AuthFlagEnum.values()){
            if (authFlagEnum.getCode().equals(code)){
                return authFlagEnum;
            }
        }

        return AFTER_RECHARGE;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
