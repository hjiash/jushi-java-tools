package us.wili.tools56.model.asynResp.account;

import us.wili.tools56.model.asynResp.BaseAsynResp;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountCreatePAsynResp extends BaseAsynResp {
    private String cert_type;
    private String cert_no;
    private String name;
    private String card_no;
    private String customer_no;
    private String serial_no;
    private String bank_card_no;
    private String mobile;
    private String bank_name;
    private String rsp_code;
    private String account_type;
    private String out_serial_no;

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getBank_card_no() {
        return bank_card_no;
    }

    public void setBank_card_no(String bank_card_no) {
        this.bank_card_no = bank_card_no;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getRsp_code() {
        return rsp_code;
    }

    public void setRsp_code(String rsp_code) {
        this.rsp_code = rsp_code;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }
}