package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum UseBonusEnum {
    UN_USE_BONUS("0", "不使用红包"),
    USE_BONUS("1", "使用红包")
    ;

    private String code;
    private String desc;

    private UseBonusEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static UseBonusEnum get(String code) {
        for (UseBonusEnum useBonusEnum : UseBonusEnum.values()){
            if (useBonusEnum.getCode().equals(code)){
                return useBonusEnum;
            }
        }

        return UN_USE_BONUS;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
