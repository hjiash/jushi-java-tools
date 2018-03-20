package us.wili.tools56.model.req.account;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountCreditsReq extends BaseReq {
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "标的编号，有条件必填，为空时查询所有的产品；不为空时按输入的产品发行方查询，6", required = true)
    private String asset_no;
    @ApiModelProperty(value = "查询的记录状态, 有条件必填，0：查询所有状态；1：投标中 2：放款中 3：计息中 4：本息已返回还，1", required = true)
    private String state;
    @ApiModelProperty(value = "翻页标志，有条件必填，首次查询上送空 ；翻页查询上送1，1", required = true)
    private String page_flag;
    @ApiModelProperty(value = "投标日期，有条件必填，翻页控制使用；首次查询上送空；翻页查询时上送上页返回的最后一条记录的投标日期，8", required = true)
    private String buy_date;
    @ApiModelProperty(value = "申请流水号,32为位 必填", required = true)
    private String out_serial_no;
    @ApiModelProperty(value = "标的编号，有条件必填 ，翻页控制使用；首次查询上送空；翻页查询时上送上页返回的最后一条记录的标的编号，6", required = true)
    private String asset_page;

    public AccountCreditsReq() {
        super();
        this.service = "account_credits";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("asset_no", getAsset_no());
        map.put("state", getState());
        map.put("page_flag", getPage_flag());
        map.put("buy_date", getBuy_date());
        map.put("out_serial_no", getOut_serial_no());
        map.put("asset_page", getAsset_page());

        return map;
    }

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
