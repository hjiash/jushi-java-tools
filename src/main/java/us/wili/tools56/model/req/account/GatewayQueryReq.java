package us.wili.tools56.model.req.account;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class GatewayQueryReq extends BaseReq {
    @ApiModelProperty(value = "订单id,40个字符", required = true)
    private String order_id;

    public GatewayQueryReq() {
        super();
        this.service = "gateway_query";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("order_id", getOrder_id());

        return map;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
