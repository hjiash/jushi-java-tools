package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum ChannelFlagEnum {
    DESIGNATED_CAPITAL_CHANNEL("Y", "指定资金通道(默认人民银行)"),
    UN_DESIGNATED_CAPITAL_CHANNEL("N", "不填资金通道(ESB选择)")
    ;

    private String code;
    private String desc;

    private ChannelFlagEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static ChannelFlagEnum get(String code) {
        for (ChannelFlagEnum channelFlagEnum : ChannelFlagEnum.values()){
            if (channelFlagEnum.getCode().equals(code)){
                return channelFlagEnum;
            }
        }

        return UN_DESIGNATED_CAPITAL_CHANNEL;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
