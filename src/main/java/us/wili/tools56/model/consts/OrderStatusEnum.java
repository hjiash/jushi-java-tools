package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum OrderStatusEnum {
    PLACE_ORDER("1", "下单（等待网关访问后提交）"),
    PROCESSING("2", "处理中（客户已提交，正在处理）"),
    CLOSE("3", "订单关闭"),
    CLOSE_FOR_TIME_OUT("4", "超时关闭(超时时间:5分钟)")
    ;

    private String code;
    private String desc;

    private OrderStatusEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static OrderStatusEnum get(String code) {
        for (OrderStatusEnum orderStatusEnum : OrderStatusEnum.values()){
            if (orderStatusEnum.getCode().equals(code)){
                return orderStatusEnum;
            }
        }

        return PLACE_ORDER;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
