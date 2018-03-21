package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum BatchTypeEnum {
    LOAN("001", "放款"),
    EXPIRY_REPAYMENT("002", "到期还款"),
    PLATFORM_OVERDUE_COMPENSATION("003", "平台逾期代偿/担保公司代偿")
    ;

    private String code;
    private String desc;

    private BatchTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static BatchTypeEnum get(String code) {
        for (BatchTypeEnum batchTypeEnum : BatchTypeEnum.values()){
            if (batchTypeEnum.getCode().equals(code)){
                return batchTypeEnum;
            }
        }

        return LOAN;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
