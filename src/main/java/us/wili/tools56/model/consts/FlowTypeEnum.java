package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum FlowTypeEnum {
    ALL("0", "所有交易"),
    TURN_IN("1", "转入"),
    TURN_OUT("2", "转出")
    ;

    private String code;
    private String desc;

    private FlowTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static FlowTypeEnum get(String code) {
        for (FlowTypeEnum flowTypeEnum : FlowTypeEnum.values()){
            if (flowTypeEnum.getCode().equals(code)){
                return flowTypeEnum;
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
