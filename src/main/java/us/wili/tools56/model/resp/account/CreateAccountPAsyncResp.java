package us.wili.tools56.model.resp.account;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class CreateAccountPAsyncResp extends BaseResp {
    @ApiModelProperty(value = "证件类型，必填，15:身份证18位，2(位数)", required = true)
    private String cert_type;
    @ApiModelProperty(value = "证件号码，必填,19(位数)", required = true)
    private String cert_no;
    private String name;
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "客户号，11(位数)", required = true)
    private String customer_no;
    @ApiModelProperty(value = "交易流水号，32")
    private String serial_no;
    @ApiModelProperty(value = "绑定卡号，必填，19(位数)", required = true)
    private String bank_card_no;
    @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")
    private String mobile;
    private String bank_name;
    private String rsp_code;
    private String account_type;
    @ApiModelProperty(value = "申请流水号,32为位 必填", required = true)
    private String out_serial_no;

    public static CreateAccountPAsyncResp fromJson(String content) {
        return JSONObject.parseObject(content, CreateAccountPAsyncResp.class);
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
        map.put("cert_type", getCert_type());
        map.put("cert_no", getCert_no());
        map.put("name", getName());
        map.put("customer_no", getCustomer_no());
        map.put("card_no", getCard_no());
        map.put("serial_no", getSerial_no());
        map.put("bank_card_no", getBank_card_no());
        map.put("mobile", getMobile());
        map.put("bank_name", getBank_name());
        map.put("rsp_code", getRsp_code());
        map.put("account_type", getAccount_type());
        map.put("out_serial_no", getOut_serial_no());
        return map;
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

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getBank_card_no() {
        return bank_card_no;
    }

    public void setBank_card_no(String bank_card_no) {
        this.bank_card_no = bank_card_no;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getRsp_code() {
        return rsp_code;
    }

    public void setRsp_code(String rsp_code) {
        this.rsp_code = rsp_code;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }
}
