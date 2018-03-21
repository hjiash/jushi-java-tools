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
    private String third_custom;
    private String success_url;
    private String fail_url;
    private String forget_pwd_url;
    private String callback_url;

    public BuyCreditPReq(){
        super();
        this.service = "buy_credit_p";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
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
        map.put("third_custom", getThird_custom());
        map.put("success_url", getSuccess_url());
        map.put("fail_url", getFail_url());
        map.put("forget_pwd_url", getForget_pwd_url());
        map.put("callback_url", getCallback_url());
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

    public String getThird_custom() {
        return third_custom;
    }

    public void setThird_custom(String third_custom) {
        this.third_custom = third_custom;
    }

    public String getSuccess_url() {
        return success_url;
    }

    public void setSuccess_url(String success_url) {
        this.success_url = success_url;
    }

    public String getFail_url() {
        return fail_url;
    }

    public void setFail_url(String fail_url) {
        this.fail_url = fail_url;
    }

    public String getForget_pwd_url() {
        return forget_pwd_url;
    }

    public void setForget_pwd_url(String forget_pwd_url) {
        this.forget_pwd_url = forget_pwd_url;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }
}
