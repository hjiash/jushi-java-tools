package us.wili.tools56.model.resp.bankroll;

import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class WithdrawPResp extends BaseResp {
    private String order_no;
    private String order_id;
    private String url;

    public static WithdrawPResp fromJson(String content) {
        return JSONObject.parseObject(content, WithdrawPResp.class);
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
        map.put("order_no", getOrder_no());
        map.put("order_id", getOrder_id());
        map.put("url", getUrl());
        return map;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
