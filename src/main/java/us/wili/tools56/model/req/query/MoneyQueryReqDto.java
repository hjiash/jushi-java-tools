package us.wili.tools56.model.req.query;

import us.wili.dev.model.dto.req.BaseReqDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class MoneyQueryReqDto extends BaseReqDto {
    private String order_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
