package us.wili.tools56.model.asyncResp.bankroll;

import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.asyncResp.BaseAsyncResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/20.
 */
public class OfflineRechargeAsyncResp extends BaseAsyncResp {
    private String amount;
    private String serial_no;
    private String name;
    private String card_no;

    public static OfflineRechargeAsyncResp fromJson(String content) {
        return JSONObject.parseObject(content, OfflineRechargeAsyncResp.class);
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
        map.put("amount", getAmount());
        map.put("card_no", getCard_no());
        map.put("serial_no", getSerial_no());
        map.put("name", getName());
        return map;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
}
