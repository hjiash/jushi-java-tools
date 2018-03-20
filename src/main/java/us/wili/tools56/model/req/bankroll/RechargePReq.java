package us.wili.tools56.model.req.bankroll;

import io.swagger.annotations.ApiModelProperty;
<<<<<<< HEAD
=======
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.common.model.validator.Phone;
>>>>>>> a5f4fed... 调整model类名称，新增service接口
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class RechargePReq extends BaseReq {
<<<<<<< HEAD
=======
    @ApiModelProperty(value = "订单编号 ,必填,(32)位数", required = true)
>>>>>>> a5f4fed... 调整model类名称，新增service接口
    private String order_no;
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "绑定卡卡号 ，必填，esb校验，19", required = true)
    private String bind_card;
    @ApiModelProperty(value = "币种 ，必填，156，3", required = true)
    private String currency;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;
    @ApiModelProperty(value = "手续费，必填,(8,2)位数", required = true)
    private String fee;
    @ApiModelProperty(value = "证件类型，必填，15:身份证18位，2(位数)", required = true)
    private String cert_type;
    @ApiModelProperty(value = "证件号码，必填,19(位数)", required = true)
    private String cert_no;
    @ApiModelProperty(value = "姓名 ，必填，60", required = true)
    private String name;
    @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")
    private String mobile;
    @ApiModelProperty(value = "ESB代发实名认证标志 ，必填，首次充值上送Y，之后充值上送N，1")
    private String auth_flag;
    @ApiModelProperty(value = "实名认证流水号 ，条件可选，6")
    private String auth_seq_id;
    @ApiModelProperty(value = "开户银行代码，条件可选 ，20")
    private String user_bank_code;
    @ApiModelProperty(value = "开户银行英文缩写，条件可选 ，20")
    private String user_bank_name_en;
    @ApiModelProperty(value = "开户银行中文名称，条件可选 ，50")
    private String user_bank_name_cn;
    @ApiModelProperty(value = "开户行省份，条件可选，20")
    private String bank_province;
    @ApiModelProperty(value = "开户行城市，条件可选，50")
    private String bank_city;
    @ApiModelProperty(value = "回调地址，必填", required = true)
    private String callback_url;
    @ApiModelProperty(value = "成功跳转地址，必填", required = true)
    private String success_url;
    @ApiModelProperty(value = "失败跳转地址，256，必填", required = true)
    private String fail_url;
    @ApiModelProperty(value = "客户IP，有条件必填，32(位数)", required = true)
    private String user_ip;

    public RechargePReq() {
        super();
        this.service = "recharge_p";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
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
        map.put("callback_url", getCallback_url());
        map.put("success_url", getSuccess_url());
        map.put("fail_url", getFail_url());
        map.put("user_ip", getUser_ip());
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

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public String getSuccess_url() {
        return success_url;
    }

    public void setSuccess_url(String success_url) {
        this.success_url = success_url;
    }

    public String getFail_url() {
        return fail_url;
    }

    public void setFail_url(String fail_url) {
        this.fail_url = fail_url;
    }

    public String getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(String user_ip) {
        this.user_ip = user_ip;
    }
}
