package us.wili.tools56.model.asynResp.bankroll;


import us.wili.tools56.model.asynResp.BaseAsynResp;

/**
 * Created by lhyue on 2018/3/17.
 */
public class NoSecretPresentationAsynResp extends BaseAsynResp {
    private String order_no;
    private String card_no;
    private String amount;

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
