package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum RspCodeEnum {
    SUCCESS("0", "处理成功"),
    NO_RECORD_OF_THE_CHANNEL("1", "查询渠道登记簿，未找到该渠道记录"),
    NO_RECORD_OF_THE_ORGANIZATION("1", "查询机构登记簿，未找到该机构记录"),
    CHANNEL_UNRELATED_PAYMENT_CHANNEL("1", "渠道未关联支付通道"),
    PAYMENT_CHANNEL_REGISTER_NOT_RECORD("1", "支付通道登记簿无此记录"),
    THIS_CHANNEL_DOES_NOT_OPERATE_SUCH_ACCOUNTS("1", "该渠道不可操作此类账户"),
    OVERLIMIT_THE_NUMBER_OF_OPEN_ACCOUNTS("1", "开户数量超限"),
    INCONSISTENCY_OF_TRANSACTION_CIPHERS("1", "交易密码不一致"),
    PLATFORM_RESERVED_CELL_PHONE_NUMBER_ERROR("1", "平台预留手机号错误"),
    THE_NUMBER_OF_BINDING_CARDS_IS_BEYOND_THE_LIMIT("1", "绑卡数量超出限制"),
    THE_FAILURE_OF_THE_FOUR_ELEMENTS_OF_AUTHENTICATION("1", "四要素鉴权失败")
    ;


    private String code;
    private String desc;

    private RspCodeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static RspCodeEnum get(String code) {
        for (RspCodeEnum signFlagEnum : RspCodeEnum.values()){
            if (signFlagEnum.getCode().equals(code)){
                return signFlagEnum;
            }
        }

        return SUCCESS;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
