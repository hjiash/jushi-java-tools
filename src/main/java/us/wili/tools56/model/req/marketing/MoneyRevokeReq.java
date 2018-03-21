package us.wili.tools56.model.req.marketing;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class MoneyRevokeReq extends BaseReq {
    private String origin_timestamp;
    private String origin_serial_no;
    private String card_no;
    private String card_no_in;
    private String currency;
    private String amount;
    private String description_flag;
    private String description;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("origin_timestamp", getOrigin_timestamp());
        map.put("origin_serial_no", getOrigin_serial_no());
        map.put("card_no", getCard_no());
        map.put("card_no_in", getCard_no_in());
        map.put("currency", getCurrency());
        map.put("amount", getAmount());
        map.put("description_flag", getDescription_flag());
        map.put("description", getDescription());
        return map;
    }

    public String getOrigin_timestamp() {
        return origin_timestamp;
    }

    public void setOrigin_timestamp(String origin_timestamp) {
        this.origin_timestamp = origin_timestamp;
    }

    public String getOrigin_serial_no() {
        return origin_serial_no;
    }

    public void setOrigin_serial_no(String origin_serial_no) {
        this.origin_serial_no = origin_serial_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getCard_no_in() {
        return card_no_in;
    }

    public void setCard_no_in(String card_no_in) {
        this.card_no_in = card_no_in;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription_flag() {
        return description_flag;
    }

    public void setDescription_flag(String description_flag) {
        this.description_flag = description_flag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
