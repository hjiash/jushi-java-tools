package us.wili.tools56.model.asyncResp.transaction;


import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.asyncResp.BaseAsyncResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BuyCreditPAsyncResp extends BaseAsyncResp {
    private String out_serial_no;
    private String card_no_in;
    private String card_no_out;
    private String amount;
    private String transfer_price;
    private String left_balance;
    private String fee;
    private String income;
    private String auth_code;
    private String third_custom;

    public static BuyCreditPAsyncResp fromJson(String content) {
        return JSONObject.parseObject(content, BuyCreditPAsyncResp.class);
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
        map.put("card_no_in", getCard_no_in());
        map.put("card_no_out", getCard_no_out());
        map.put("amount", getAmount());
        map.put("transfer_price", getTransfer_price());
        map.put("left_balance", getLeft_balance());
        map.put("fee", getFee());
        map.put("income", getIncome());
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

    public String getCard_no_in() {
        return card_no_in;
    }

    public void setCard_no_in(String card_no_in) {
        this.card_no_in = card_no_in;
    }

    public String getCard_no_out() {
        return card_no_out;
    }

    public void setCard_no_out(String card_no_out) {
        this.card_no_out = card_no_out;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransfer_price() {
        return transfer_price;
    }

    public void setTransfer_price(String transfer_price) {
        this.transfer_price = transfer_price;
    }

    public String getLeft_balance() {
        return left_balance;
    }

    public void setLeft_balance(String left_balance) {
        this.left_balance = left_balance;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
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
