package us.wili.tools56.model.asynResp.bankroll;


import us.wili.tools56.model.asynResp.BaseAsynResp;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignBorrowerPAsynResp extends BaseAsynResp {
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
