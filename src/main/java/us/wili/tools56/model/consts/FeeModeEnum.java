package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum FeeModeEnum {
    SPECIFIED_AMOUNT("Y", "指定金额")
    ;

    private String code;
    private String desc;

    private FeeModeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static FeeModeEnum get(String code) {
        for (FeeModeEnum feeModeEnum : FeeModeEnum.values()){
            if (feeModeEnum.getCode().equals(code)){
                return feeModeEnum;
            }
        }

        return SPECIFIED_AMOUNT;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
