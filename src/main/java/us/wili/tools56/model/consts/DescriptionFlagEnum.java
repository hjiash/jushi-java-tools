package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum DescriptionFlagEnum {
    UN_USE("0", "不使用"),
    USE("1", "使用")
    ;

    private String code;
    private String desc;

    private DescriptionFlagEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static DescriptionFlagEnum get(String code) {
        for (DescriptionFlagEnum descriptionFlagEnum : DescriptionFlagEnum.values()){
            if (descriptionFlagEnum.getCode().equals(code)){
                return descriptionFlagEnum;
            }
        }

        return UN_USE;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
