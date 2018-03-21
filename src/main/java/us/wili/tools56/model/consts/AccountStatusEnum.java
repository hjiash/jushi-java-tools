package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum AccountStatusEnum {
    NORMAL("0", "正常"),
    FROZEN("1", "冻结"),
    CANCELLATION("2", "注销")
    ;

    private String code;
    private String desc;

    private AccountStatusEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static AccountStatusEnum get(String code) {
        for (AccountStatusEnum accountStatusEnum : AccountStatusEnum.values()){
            if (accountStatusEnum.getCode().equals(code)){
                return accountStatusEnum;
            }
        }

        return NORMAL;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
