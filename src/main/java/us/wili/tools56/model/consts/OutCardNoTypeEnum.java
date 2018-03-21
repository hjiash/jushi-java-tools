package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum OutCardNoTypeEnum {
    EXPIRY_REPAYMENT("002", "到期还款-实际借款人/名义借款人"),
    COMPENSATION("003", "代偿-担保人电子账号/平台备付金账号")
    ;

    private String code;
    private String desc;

    private OutCardNoTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static OutCardNoTypeEnum get(String code) {
        for (OutCardNoTypeEnum outCardNoTypeEnum : OutCardNoTypeEnum.values()){
            if (outCardNoTypeEnum.getCode().equals(code)){
                return outCardNoTypeEnum;
            }
        }

        return EXPIRY_REPAYMENT;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
