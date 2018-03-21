package us.wili.tools56.model.resp.query;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class ApplyBidQueryResp extends BaseResp {

    private String state;
    private String name;
    private String forcast_income;
    @ApiModelProperty(value = "抵扣红包金额 ,必填,两位小数,9位保留两位", required = true)    private String bonus_amount;
    @ApiModelProperty(value = "投标申请授权码 ,必填,20", required = true)        private String auth_code;
    private String bid_amount;
    @ApiModelProperty(value = "标的编号，有条件必填，为空时查询所有的产品；不为空时按输入的产品发行方查询，6",required = true)    private String asset_no;
    private String buy_date;
    @ApiModelProperty(value = "卡号，必填，电子账户，19",required = true)private String card_no;
    private String product;

    public static ApplyBidQueryResp fromJson(String content) {
        return JSONObject.parseObject(content, ApplyBidQueryResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("version", getVersion());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("custom", getCustom());
        map.put("client", getClient());
        map.put("sequence_id", getSequence_id());
        map.put("card_no", getCard_no());
        map.put("state", getState());
        map.put("name", getName());
        map.put("forcast_income", getForcast_income());
        map.put("bonus_amount", getBonus_amount());
        map.put("auth_code", getAuth_code());
        map.put("bid_amount", getBid_amount());
        map.put("asset_no", getAsset_no());
        map.put("buy_date", getBuy_date());
        map.put("product", getProduct());
        return map;
    }

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
