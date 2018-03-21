package us.wili.tools56.model.resp.query;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BuyCreditQueryResp extends BaseResp {

    @ApiModelProperty(value = "承接方电子账号，19", required = true)        private String in_card_no;
    @ApiModelProperty(value = "保留域，条件选填,60", required = true)        private String reserved;
    private String transfer_balance;
    @ApiModelProperty(value = "转让方电子账号，19", required = true)        private String out_card_no;
    private String in_name;
    @ApiModelProperty(value = "投标申请授权码 ,必填,20", required = true)        private String auth_code;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)    private String amount;
    private String income;
    private String out_name;
    private String transfer_price;
    @ApiModelProperty(value = "手续费，必填,(8,2)位数",required = true)    private String fee;

    public static BuyCreditQueryResp fromJson(String content) {
        return JSONObject.parseObject(content, BuyCreditQueryResp.class);
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
        map.put("in_card_no", getIn_card_no());
        map.put("reserved", getReserved());
        map.put("transfer_balance", getTransfer_balance());
        map.put("out_card_no", getOut_card_no());
        map.put("in_name", getIn_name());
        map.put("income", getIncome());
        map.put("auth_code", getAuth_code());
        map.put("amount", getAmount());
        map.put("out_name", getOut_name());
        map.put("transfer_price", getTransfer_price());
        map.put("fee", getFee());
        return map;
    }

    public String getIn_card_no() {
        return in_card_no;
    }

    public void setIn_card_no(String in_card_no) {
        this.in_card_no = in_card_no;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public String getTransfer_balance() {
        return transfer_balance;
    }

    public void setTransfer_balance(String transfer_balance) {
        this.transfer_balance = transfer_balance;
    }

    public String getOut_card_no() {
        return out_card_no;
    }

    public void setOut_card_no(String out_card_no) {
        this.out_card_no = out_card_no;
    }

    public String getIn_name() {
        return in_name;
    }

    public void setIn_name(String in_name) {
        this.in_name = in_name;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getOut_name() {
        return out_name;
    }

    public void setOut_name(String out_name) {
        this.out_name = out_name;
    }

    public String getTransfer_price() {
        return transfer_price;
    }

    public void setTransfer_price(String transfer_price) {
        this.transfer_price = transfer_price;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}
