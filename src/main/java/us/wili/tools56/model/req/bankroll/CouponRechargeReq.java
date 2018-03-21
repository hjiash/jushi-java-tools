package us.wili.tools56.model.req.bankroll;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class CouponRechargeReq extends BaseReq {
    private String amount;
    private String serial_no;

    public CouponRechargeReq() {
        super();
        this.service = "coupon_recharge";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("serial_no", getSerial_no());
        map.put("amount", getAmount());
        return map;
    }

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
