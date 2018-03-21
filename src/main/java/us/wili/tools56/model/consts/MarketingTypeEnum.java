package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum MarketingTypeEnum {
    SERVICE_CHARGE_ACCOUNT("1", "服务费账户"),
    RED_ENVELOPES_ACCOUNT("2", "红包户"),
    OTHER("3", "其他")
    ;

    private String code;
    private String desc;

    private MarketingTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static MarketingTypeEnum get(String code) {
        for (MarketingTypeEnum marketingTypeEnum : MarketingTypeEnum.values()){
            if (marketingTypeEnum.getCode().equals(code)){
                return marketingTypeEnum;
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
