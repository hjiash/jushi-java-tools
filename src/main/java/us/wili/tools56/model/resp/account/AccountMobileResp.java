package us.wili.tools56.model.resp.account;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountMobileResp extends BaseResp {
    @ApiModelProperty(value = "卡号，必填，电子账户，19",required = true)private String card_no;
    private String name;
    @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")    private String mobile;
    @ApiModelProperty(value = "证件类型，必填，15:身份证18位，2(位数)", required = true)    private String cert_type;
    @ApiModelProperty(value = "证件号码，必填,19(位数)", required = true)    private String cert_no;
    @ApiModelProperty(value = "客户号，11(位数)",required = true)    private String customer_no;

    public static AccountMobileResp fromJson(String content) {
        return JSONObject.parseObject(content, AccountMobileResp.class);
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
        map.put("mobile", getMobile());
        map.put("cert_type", getCert_type());
        map.put("cert_no", getCert_no());
        map.put("customer_no", getCustomer_no());
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }
}
