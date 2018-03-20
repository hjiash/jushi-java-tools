package us.wili.tools56.model.req.account;

import us.wili.tools56.model.req.BaseReqDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountCreditsReqDto extends BaseReqDto {
    private String card_no;
    private String asset_no;
    private String state;
    private String page_flag;
    private String buy_date;
    private String out_serial_no;
    private String asset_page;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
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

    public String getPage_flag() {
        return page_flag;
    }

    public void setPage_flag(String page_flag) {
        this.page_flag = page_flag;
    }

    public String getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(String buy_date) {
        this.buy_date = buy_date;
    }

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    public String getAsset_page() {
        return asset_page;
    }

    public void setAsset_page(String asset_page) {
        this.asset_page = asset_page;
    }
}
