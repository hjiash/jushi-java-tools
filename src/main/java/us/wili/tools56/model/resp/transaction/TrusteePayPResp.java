package us.wili.tools56.model.resp.transaction;

import us.wili.tools56.model.resp.BaseResp;

/**
 * Created by lhyue on 2018/3/17.
 */
public class TrusteePayPResp extends BaseResp {
    private String order_id;
    private String url;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
