package us.wili.tools56.model.req.transaction;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BuyCreditPReq extends BaseReq {
    private String card_no_in;
    private String out_serial_no;
    private String origin_serial_no;
    private String card_no_out;
    private String total_balance;
    private String amount;
    private String transfer_price;
    private String interest_date;
    private String interest_rate;
    private String fee_way;
    private String fee;
    private String mobile;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("sign_type", getSign_type());
        map.put("encode", getEncode());
        map.put("version", getVersion());
        map.put("custom", getCustom());
        map.put("client", getClient());
        map.put("card_no_in", getCard_no_in());
        map.put("origin_serial_no", getOrigin_serial_no());
        map.put("card_no_out", getCard_no_out());
        map.put("total_balance", getTotal_balance());
        map.put("out_serial_no", getOut_serial_no());
        map.put("amount", getAmount());
        map.put("transfer_price", getTransfer_price());
        map.put("fee_way", getFee_way());
        map.put("fee", getFee());
        map.put("interest_date", getInterest_date());
        map.put("interest_rate", getInterest_rate());
        map.put("mobile", getMobile());
        return map;
    }

    public String getCard_no_in() {
        return card_no_in;
    }

    public void setCard_no_in(String card_no_in) {
        this.card_no_in = card_no_in;
    }


    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    public String getOrigin_serial_no() {
        return origin_serial_no;
    }

    public void setOrigin_serial_no(String origin_serial_no) {
        this.origin_serial_no = origin_serial_no;
    }

    public String getCard_no_out() {
        return card_no_out;
    }

    public void setCard_no_out(String card_no_out) {
        this.card_no_out = card_no_out;
    }

    public String getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(String total_balance) {
        this.total_balance = total_balance;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransfer_price() {
        return transfer_price;
    }

    public void setTransfer_price(String transfer_price) {
        this.transfer_price = transfer_price;
    }

    public String getInterest_date() {
        return interest_date;
    }

    public void setInterest_date(String interest_date) {
        this.interest_date = interest_date;
    }

    public String getFee_way() {
        return fee_way;
    }

    public void setFee_way(String fee_way) {
        this.fee_way = fee_way;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }
}
