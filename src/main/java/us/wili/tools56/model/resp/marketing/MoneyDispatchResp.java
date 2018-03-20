package us.wili.tools56.model.resp.marketing;

import us.wili.tools56.model.resp.BaseResp;

/**
 * Created by lhyue on 2018/3/17.
 */
public class MoneyDispatchResp extends BaseResp {
    private String card_no;
    private String serial_no;
    private String card_no_in;
    private String currency;
    private String amount;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getCard_no_in() {
        return card_no_in;
    }

    public void setCard_no_in(String card_no_in) {
        this.card_no_in = card_no_in;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
