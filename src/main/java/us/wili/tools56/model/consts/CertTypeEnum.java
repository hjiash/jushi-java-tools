package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum CertTypeEnum {
    IDENTITY_CARD("15", "身份证18位"),
    OTHER("20", "其它"),
    CORPORATE_SOCIAL_CREDIT_CODE("25", "企业社会信用代码 注：企业开户时上送20或社会信用号")
    ;

    private String code;
    private String desc;

    private CertTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static CertTypeEnum get(String code) {
        for (CertTypeEnum certTypeEnum : CertTypeEnum.values()){
            if (certTypeEnum.getCode().equals(code)){
                return certTypeEnum;
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
