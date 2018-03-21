package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum FrozenFlagEnum {
    UN_FROZEN("0", "不冻结"),
    FROZEN("1", "冻结")
    ;

    private String code;
    private String desc;

    private FrozenFlagEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static FrozenFlagEnum get(String code) {
        for (FrozenFlagEnum frozenFlagEnum : FrozenFlagEnum.values()){
            if (frozenFlagEnum.getCode().equals(code)){
                return frozenFlagEnum;
            }
        }

        return UN_FROZEN;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
