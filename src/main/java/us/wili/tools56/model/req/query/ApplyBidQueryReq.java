package us.wili.tools56.model.req.query;

import us.wili.tools56.model.req.BaseReq;

/**
 * Created by lhyue on 2018/3/17.
 */
public class ApplyBidQueryReq extends BaseReq {
    private String card_no;
    private String out_serial_no;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }
}
