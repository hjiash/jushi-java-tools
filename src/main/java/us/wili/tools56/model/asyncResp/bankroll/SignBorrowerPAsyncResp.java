package us.wili.tools56.model.asyncResp.bankroll;


import us.wili.tools56.model.asyncResp.BaseAsyncResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignBorrowerPAsyncResp extends BaseAsyncResp {
    private String card_no;
    private String out_serial_no;
    private String sign_flag;
    private String payment_amount;
    private String repayment_amount;
    private String payment_start_time;
    private String repayment_start_time;
    private String payment_end_time;
    private String repayment_end_time;
    private String sign_date;
    private String sign_time;


    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("service", getService());
        map.put("version", getVersion());
        map.put("uuid", getUuid());
        map.put("sequence_id", getSequence_id());
        map.put("custom", getCustom());
        map.put("encode", getEncode());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("client", getClient());
        map.put("out_serial_no", getOut_serial_no());
        map.put("card_no", getCard_no());
        map.put("sign_flag", getSign_flag());
        map.put("payment_amount", getPayment_amount());
        map.put("repayment_amount", getRepayment_amount());
        map.put("payment_start_time", getPayment_start_time());
        map.put("repayment_start_time", getRepayment_start_time());
        map.put("payment_end_time", getPayment_end_time());
        map.put("repayment_end_time", getRepayment_end_time());
        map.put("sign_date", getSign_date());
        map.put("sign_time", getSign_time());
        return map;
    }

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

    public String getSign_flag() {
        return sign_flag;
    }

    public void setSign_flag(String sign_flag) {
        this.sign_flag = sign_flag;
    }

    public String getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(String payment_amount) {
        this.payment_amount = payment_amount;
    }

    public String getRepayment_amount() {
        return repayment_amount;
    }

    public void setRepayment_amount(String repayment_amount) {
        this.repayment_amount = repayment_amount;
    }

    public String getPayment_start_time() {
        return payment_start_time;
    }

    public void setPayment_start_time(String payment_start_time) {
        this.payment_start_time = payment_start_time;
    }

    public String getRepayment_start_time() {
        return repayment_start_time;
    }

    public void setRepayment_start_time(String repayment_start_time) {
        this.repayment_start_time = repayment_start_time;
    }

    public String getPayment_end_time() {
        return payment_end_time;
    }

    public void setPayment_end_time(String payment_end_time) {
        this.payment_end_time = payment_end_time;
    }

    public String getRepayment_end_time() {
        return repayment_end_time;
    }

    public void setRepayment_end_time(String repayment_end_time) {
        this.repayment_end_time = repayment_end_time;
    }

    public String getSign_date() {
        return sign_date;
    }

    public void setSign_date(String sign_date) {
        this.sign_date = sign_date;
    }

    public String getSign_time() {
        return sign_time;
    }

    public void setSign_time(String sign_time) {
        this.sign_time = sign_time;
    }
}
