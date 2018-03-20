package us.wili.tools56.model.req.bankroll;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class RechargePReq extends BaseReq {
    private String order_no;
    private String card_no;
    private String bind_card;
    private String currency;
    private String amount;
    private String fee;
    private String cert_type;
    private String cert_no;
    private String name;
    private String mobile;
    private String auth_flag;
    private String auth_seq_id;
    private String user_bank_code;
    private String user_bank_name_en;
    private String user_bank_name_cn;
    private String bank_province;
    private String bank_city;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("sign_type", getSign_type());
        map.put("encode", getEncode());
        map.put("version", getVersion());
        map.put("custom", getCustom());
        map.put("client", getClient());
        map.put("card_no", getCard_no());
        map.put("order_no", getOrder_no());
        map.put("amount", getAmount());
        map.put("currency", getCurrency());
        map.put("bind_card", getBind_card());
        map.put("name", getName());
        map.put("cert_type", getCert_type());
        map.put("mobile", getMobile());
        map.put("fee", getFee());
        map.put("auth_flag", getAuth_flag());
        map.put("auth_seq_id", getAuth_seq_id());
        map.put("user_bank_code", getUser_bank_code());
        map.put("user_bank_name_en", getUser_bank_name_en());
        map.put("user_bank_name_cn", getUser_bank_name_cn());
        map.put("bank_province", getBank_province());
        map.put("bank_city", getBank_city());
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

    public String getBind_card() {
        return bind_card;
    }

    public void setBind_card(String bind_card) {
        this.bind_card = bind_card;
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

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAuth_flag() {
        return auth_flag;
    }

    public void setAuth_flag(String auth_flag) {
        this.auth_flag = auth_flag;
    }

    public String getAuth_seq_id() {
        return auth_seq_id;
    }

    public void setAuth_seq_id(String auth_seq_id) {
        this.auth_seq_id = auth_seq_id;
    }

    public String getUser_bank_code() {
        return user_bank_code;
    }

    public void setUser_bank_code(String user_bank_code) {
        this.user_bank_code = user_bank_code;
    }

    public String getUser_bank_name_en() {
        return user_bank_name_en;
    }

    public void setUser_bank_name_en(String user_bank_name_en) {
        this.user_bank_name_en = user_bank_name_en;
    }

    public String getUser_bank_name_cn() {
        return user_bank_name_cn;
    }

    public void setUser_bank_name_cn(String user_bank_name_cn) {
        this.user_bank_name_cn = user_bank_name_cn;
    }

    public String getBank_province() {
        return bank_province;
    }

    public void setBank_province(String bank_province) {
        this.bank_province = bank_province;
    }

    public String getBank_city() {
        return bank_city;
    }

    public void setBank_city(String bank_city) {
        this.bank_city = bank_city;
    }
}
