package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum BankTypeEnum {
    PRIVATE_BANK("PRIVATE", "个人银行卡"),
    PUBLIC_BANK("PUBLIC", "企业银行卡")
    ;

    private String code;
    private String desc;

    private BankTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static BankTypeEnum get(String code) {
        for (BankTypeEnum bankTypeEnum : BankTypeEnum.values()){
            if (bankTypeEnum.getCode().equals(code)){
                return bankTypeEnum;
            }
        }

        return PUBLIC_BANK;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
