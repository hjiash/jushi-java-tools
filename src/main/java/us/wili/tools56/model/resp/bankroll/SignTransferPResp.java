package us.wili.tools56.model.resp.bankroll;

import us.wili.tools56.model.resp.BaseResp;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignTransferPResp extends BaseResp {
    private String out_serial_no;
    private String order_no;
    private String order_id;
    private String url;

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

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
