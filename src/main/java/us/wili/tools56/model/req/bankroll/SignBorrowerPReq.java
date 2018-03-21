package us.wili.tools56.model.req.bankroll;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignBorrowerPReq extends BaseReq {
    private String card_no;
    private String payment_amount;
    private String repayment_amount;
    private String out_serial_no;
    private String payment_start_time;
    private String repayment_start_time;
    private String payment_end_time;
    private String repayment_end_time;
    private String callback_url;
    private String success_url;
    private String fail_url;

    public SignBorrowerPReq() {
        super();
        this.service = "sign_borrower_p";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("payment_amount", getPayment_amount());
        map.put("repayment_amount", getRepayment_amount());
        map.put("out_serial_no", getOut_serial_no());
        map.put("payment_start_time", getPayment_start_time());
        map.put("payment_end_time", getPayment_end_time());
        map.put("repayment_end_time", getRepayment_end_time());
        map.put("callback_url", getCallback_url());
        map.put("success_url", getSuccess_url());
        map.put("fail_url", getFail_url());
        return map;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
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

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
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

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
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
}
