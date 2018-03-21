package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum InvestmentStatusEnum {
    ALL("0", "查询所有状态"),
    BIDDING("1", "投标中"),
    LOANING("2", "放款中"),
    INTERESTING_RATE("3", "计息中"),
    PRINCIPAL_AND_INTEREST_RETURNED("4", "本息已返回还")
    ;

    private String code;
    private String desc;

    private InvestmentStatusEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static InvestmentStatusEnum get(String code) {
        for (InvestmentStatusEnum investmentStatusEnum : InvestmentStatusEnum.values()){
            if (investmentStatusEnum.getCode().equals(code)){
                return investmentStatusEnum;
            }
        }

        return ALL;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
