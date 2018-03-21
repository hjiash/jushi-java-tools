package us.wili.tools56.model.resp.transaction;

import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class TrusteePayPAsyncResp extends BaseResp {
    private String out_serial_no;
    private String card_no;
    private String cert_type;
    private String cert_no;
    private String in_card_no;
    private String asset_no;
    private String state;
    private String confirm_date;
    private String confirm_time;
    private String third_custom;

    public static TrusteePayPAsyncResp fromJson(String content) {
        return JSONObject.parseObject(content, TrusteePayPAsyncResp.class);
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
        map.put("cert_type", getCert_type());
        map.put("cert_no", getCert_no());
        map.put("in_card_no", getIn_card_no());
        map.put("asset_no", getAsset_no());
        map.put("state", getState());
        map.put("confirm_date", getConfirm_date());
        map.put("confirm_time", getConfirm_time());
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

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getIn_card_no() {
        return in_card_no;
    }

    public void setIn_card_no(String in_card_no) {
        this.in_card_no = in_card_no;
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

    public String getConfirm_date() {
        return confirm_date;
    }

    public void setConfirm_date(String confirm_date) {
        this.confirm_date = confirm_date;
    }

    public String getConfirm_time() {
        return confirm_time;
    }

    public void setConfirm_time(String confirm_time) {
        this.confirm_time = confirm_time;
    }

    public String getThird_custom() {
        return third_custom;
    }

    public void setThird_custom(String third_custom) {
        this.third_custom = third_custom;
    }
}
