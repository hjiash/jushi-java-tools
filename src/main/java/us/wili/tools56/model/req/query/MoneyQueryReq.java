package us.wili.tools56.model.req.query;

import us.wili.tools56.model.req.BaseReq;

/**
 * Created by lhyue on 2018/3/17.
 */
public class MoneyQueryReq extends BaseReq {
    private String order_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
