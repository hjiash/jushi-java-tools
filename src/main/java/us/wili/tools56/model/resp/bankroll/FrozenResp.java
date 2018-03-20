package us.wili.tools56.model.resp.bankroll;

import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class FrozenResp extends BaseResp {
    private String card_no;
    private String name;
    private String amount;
    private String asset_no;

    public static FrozenResp fromJson(String content) {
        return JSONObject.parseObject(content, FrozenResp.class);
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
        map.put("amount", getAmount());
        map.put("asset_no", getAsset_no());
        map.put("card_no", getCard_no());
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
}
