package us.wili.tools56.model.resp.query;

import us.wili.dev.model.dto.resp.BaseRespDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class ApplyBidQueryRespDto extends BaseRespDto {

    private String state;
    private String name;
    private String forcast_income;
    private String bonus_amount;
    private String auth_code;
    private String bid_amount;
    private String asset_no;
    private String buy_date;
    private String card_no;
    private String product;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForcast_income() {
        return forcast_income;
    }

    public void setForcast_income(String forcast_income) {
        this.forcast_income = forcast_income;
    }

    public String getBonus_amount() {
        return bonus_amount;
    }

    public void setBonus_amount(String bonus_amount) {
        this.bonus_amount = bonus_amount;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getBid_amount() {
        return bid_amount;
    }

    public void setBid_amount(String bid_amount) {
        this.bid_amount = bid_amount;
    }

    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    public String getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(String buy_date) {
        this.buy_date = buy_date;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
