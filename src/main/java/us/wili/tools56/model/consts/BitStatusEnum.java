package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum BitStatusEnum {
    EMPTY_BID("0", "空标"),
    BID("1", "投标"),
    LOSS_BIT("2", "流标"),
    FULL_BIT("3", "满标"),
    REVOKE("4", "已撤销")
    ;

    private String code;
    private String desc;

    private BitStatusEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static BitStatusEnum get(String code) {
        for (BitStatusEnum bitStatusEnum : BitStatusEnum.values()){
            if (bitStatusEnum.getCode().equals(code)){
                return bitStatusEnum;
            }
        }

        return REVOKE;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
