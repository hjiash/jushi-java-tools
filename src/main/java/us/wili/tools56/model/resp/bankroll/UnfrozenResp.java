package us.wili.tools56.model.resp.bankroll;

import us.wili.tools56.model.resp.BaseResp;

/**
 * Created by lhyue on 2018/3/17.
 */
public class UnfrozenResp extends BaseResp{
    private String card_no;
    private String name;
    private String prd_issuer;
    private String amount;
    private String asset_no;
    private String state;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrd_issuer() {
        return prd_issuer;
    }

    public void setPrd_issuer(String prd_issuer) {
        this.prd_issuer = prd_issuer;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
