package us.wili.tools56.model.resp.transaction;

import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BidApplyPResp extends BaseResp {
    private String url;

    public static BidApplyPResp fromJson(String content) {
        return JSONObject.parseObject(content, BidApplyPResp.class);
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
        map.put("url", getUrl());
        return map;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
