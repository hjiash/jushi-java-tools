package us.wili.tools56.model.resp.transaction;


import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BidApplyPAsyncResp extends BaseResp {
    private String out_serial_no;
    private String card_no;
    private String asset_no;
    private String bid_amount;
    private String forcast_income;
    private String buy_date;
    private String state;
    private String auth_code;
    private String third_custom;

    public static BidApplyPAsyncResp fromJson(String content) {
        return JSONObject.parseObject(content, BidApplyPAsyncResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("service", getService());
        map.put("version", getVersion());
        map.put("uuid", getUuid());
        map.put("sequence_id", getSequence_id());
        map.put("custom", getCustom());
        map.put("encode", getEncode());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("client", getClient());
        map.put("out_serial_no", getOut_serial_no());
        map.put("card_no", getCard_no());
        map.put("asset_no", getAsset_no());
        map.put("bid_amount", getBid_amount());
        map.put("forcast_income", getForcast_income());
        map.put("buy_date", getBuy_date());
        map.put("state", getState());
        map.put("auth_code", getAuth_code());
        map.put("third_custom", getThird_custom());
        return map;
    }

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
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

    public String getBid_amount() {
        return bid_amount;
    }

    public void setBid_amount(String bid_amount) {
        this.bid_amount = bid_amount;
    }

    public String getForcast_income() {
        return forcast_income;
    }

    public void setForcast_income(String forcast_income) {
        this.forcast_income = forcast_income;
    }

    public String getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(String buy_date) {
        this.buy_date = buy_date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getThird_custom() {
        return third_custom;
    }

    public void setThird_custom(String third_custom) {
        this.third_custom = third_custom;
    }
}
