package us.wili.tools56.model.req.bankroll;

import us.wili.tools56.model.req.BaseReq;

/**
 * Created by lhyue on 2018/3/17.
 */
public class CouponWithdrawReq extends BaseReq {
    private String amount;
    private String serial_no;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }
}
