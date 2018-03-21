package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum InterestTypeEnum {
    EQUAL_AMOUNT_OF_INTEREST("1", "等额本息"),
    MONTHLY_INTEREST_RATE_MATURITY_REPAYMENT("2", "每月付息，到期还本"),
    EQUAL_AMOUNT_OF_PRINCIPAL("3", "等额本金"),
    EQUAL_PROPORTION_PROGRESSIVE("4", "等比累进"),
    EQUAL_VOLUME_PROGRESSION("5", "等额累进"),
    COMBINED_REPAYMENT("6", "组合还款"),
    OTHER("7", "其他")
    ;

    private String code;
    private String desc;

    private InterestTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static InterestTypeEnum get(String code) {
        for (InterestTypeEnum interestTypeEnum : InterestTypeEnum.values()){
            if (interestTypeEnum.getCode().equals(code)){
                return interestTypeEnum;
            }
        }

        return OTHER;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
