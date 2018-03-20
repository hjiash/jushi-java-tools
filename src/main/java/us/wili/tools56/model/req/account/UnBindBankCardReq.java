package us.wili.tools56.model.req.account;

import us.wili.tools56.model.req.BaseReq;

/**
 * Created by lhyue on 2018/3/17.
 */
public class UnBindBankCardReq extends BaseReq {
    private String card_no;
    private String bank_card_no;
    private String customer_no;
    private String serial_no;
    private String card_type;

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

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }
}
