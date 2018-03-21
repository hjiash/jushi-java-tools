package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum OrderByEnum {
    POSITIVE_SEQUENCE("1", "正序"),
    REVERSE("2", "倒序")
    ;

    private String code;
    private String desc;

    private OrderByEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static OrderByEnum get(String code) {
        for (OrderByEnum signFlagEnum : OrderByEnum.values()){
            if (signFlagEnum.getCode().equals(code)){
                return signFlagEnum;
            }
        }

        return POSITIVE_SEQUENCE;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
