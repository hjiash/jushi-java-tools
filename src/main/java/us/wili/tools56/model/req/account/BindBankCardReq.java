package us.wili.tools56.model.req.account;

import us.wili.tools56.model.req.BaseReq;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BindBankCardReq extends BaseReq {
    private String card_no;
    private String bank_card_no;
    private String bank_id_no;
    private String name;
    private String cert_type;
    private String customer_no;
    private String cert_no;
    private String card_type;
    private String bank_mobile;
    private String user_ip;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getBank_card_no() {
        return bank_card_no;
    }

    public void setBank_card_no(String bank_card_no) {
        this.bank_card_no = bank_card_no;
    }

    public String getBank_id_no() {
        return bank_id_no;
    }

    public void setBank_id_no(String bank_id_no) {
        this.bank_id_no = bank_id_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getBank_mobile() {
        return bank_mobile;
    }

    public void setBank_mobile(String bank_mobile) {
        this.bank_mobile = bank_mobile;
    }

    public String getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(String user_ip) {
        this.user_ip = user_ip;
    }
}
