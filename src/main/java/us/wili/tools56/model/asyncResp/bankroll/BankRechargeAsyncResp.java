package us.wili.tools56.model.asyncResp.bankroll;

import us.wili.tools56.model.asyncResp.BaseAsyncResp;

/**
 * Created by lhyue on 2018/3/20.
 */
public class BankRechargeAsyncResp extends BaseAsyncResp {
    private String amount;
    private String url;
    private String order_no;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }
}
