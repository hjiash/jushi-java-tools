package us.wili.tools56.model.resp.account;

import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class UnBindBankCardResp extends BaseResp {
    private String card_no;
    private String name;
    private String sign_flag;
    private String sign_date;
    private String sign_time;
    private String states;
    private String revoke_sign_date;
    private String revoke_sign_time;

    public static UnBindBankCardResp fromJson(String content) {
        return JSONObject.parseObject(content, UnBindBankCardResp.class);
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
        map.put("encode", getEncode());
        map.put("sequence_id", getSequence_id());
        map.put("card_no", getCard_no());
        map.put("name", getName());
        map.put("sign_flag", getSign_flag());
        map.put("sign_date", getSign_date());
        map.put("sign_time", getSign_time());
        map.put("states", getStates());
        map.put("revoke_sign_date", getRevoke_sign_date());
        map.put("revoke_sign_time", getRevoke_sign_time());
        return map;
    }

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

    public String getSign_flag() {
        return sign_flag;
    }

    public void setSign_flag(String sign_flag) {
        this.sign_flag = sign_flag;
    }

    public String getSign_date() {
        return sign_date;
    }

    public void setSign_date(String sign_date) {
        this.sign_date = sign_date;
    }

    public String getSign_time() {
        return sign_time;
    }

    public void setSign_time(String sign_time) {
        this.sign_time = sign_time;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getRevoke_sign_date() {
        return revoke_sign_date;
    }

    public void setRevoke_sign_date(String revoke_sign_date) {
        this.revoke_sign_date = revoke_sign_date;
    }

    public String getRevoke_sign_time() {
        return revoke_sign_time;
    }

    public void setRevoke_sign_time(String revoke_sign_time) {
        this.revoke_sign_time = revoke_sign_time;
    }
}
