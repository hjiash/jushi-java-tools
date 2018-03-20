package us.wili.tools56.model.asyncResp.bankroll;


import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.asyncResp.BaseAsyncResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class RechargePAsyncResp extends BaseAsyncResp {
    private String order_no;
    private String card_no;
    private String amount;
    private String fee;

    public static RechargePAsyncResp fromJson(String content) {
        return JSONObject.parseObject(content, RechargePAsyncResp.class);
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
        map.put("order_no", getOrder_no());
        map.put("fee", getFee());
        return map;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}
