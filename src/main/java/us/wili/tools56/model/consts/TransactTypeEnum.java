package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum TransactTypeEnum {
    FINANCIAL_FLOW("B", "金融流水"),
    UN_FINANCIAL_FLOW("N", "非金融流水")
    ;

    private String code;
    private String desc;

    private TransactTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static TransactTypeEnum get(String code) {
        for (TransactTypeEnum transactTypeEnum : TransactTypeEnum.values()){
            if (transactTypeEnum.getCode().equals(code)){
                return transactTypeEnum;
            }
        }

        return FINANCIAL_FLOW;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
