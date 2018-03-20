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
public class WithdrawPReq extends BaseReq {

    private String order_no;
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    private String bank_name;
    @ApiModelProperty(value = "绑定卡卡号 ，必填，esb校验，19", required = true)
    private String bind_card;
    private String name;
    @ApiModelProperty(value = "证件号码，必填,19(位数)", required = true)
    private String cert_no;
    @ApiModelProperty(value = "证件类型，必填，15:身份证18位，2(位数)", required = true)
    private String cert_type;
    @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")
    private String mobile;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;
    @ApiModelProperty(value = "手续费，必填,(8,2)位数", required = true)
    private String fee;
    @ApiModelProperty(value = "是否指定通道 ,条件选填，Y-指定资金通道(默认人民银行)， N-不填资金通道(ESB选择),(1)位数", required = true)
    private String channel_flag;
    @ApiModelProperty(value = "通道标识(如果channel_flag选Y就填G1) ,条件选填,(2)位数", required = true)
    private String channel_code;
    @ApiModelProperty(value = "开户银行联行号 ,条件选填，(如果channel_code填了 G1就填写人民银行分配联行号,如果没填，就不用分配。),(20)位数", required = true)
    private String union_bank_code;
    @ApiModelProperty(value = "开户银行代码 ,条件选填,(20)位数", required = true)
    private String open_bank_code;
    @ApiModelProperty(value = "开户银行英文缩写,条件选填,(20)位数", required = true)
    private String bank_name_en;
    @ApiModelProperty(value = "开户银行中文名称,条件选填,(50)位数", required = true)
    private String bank_name_cn;
    @ApiModelProperty(value = "开户行省份,条件选填,(20)位数", required = true)
    private String bank_province;
    @ApiModelProperty(value = "开户行城市,条件选填,(50)位数", required = true)
    private String bank_city;
    @ApiModelProperty(value = "成功跳转地址，必填", required = true)
    private String success_url;
    @ApiModelProperty(value = "失败跳转地址，256，必填", required = true)
    private String fail_url;
    @ApiModelProperty(value = "回调地址，必填", required = true)
    private String callback_url;

    public WithdrawPReq() {
        super();
        this.service = "withdraw_p";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("order_no", getOrder_no());
        map.put("card_no", getCard_no());
        map.put("bank_name", getBank_name());
        map.put("bind_card", getBind_card());
        map.put("name", getName());
        map.put("cert_no", getCert_no());
        map.put("cert_type", getCert_type());
        map.put("mobile", getMobile());
        map.put("amount", getAmount());
        map.put("fee", getFee());
        map.put("channel_flag", getChannel_flag());
        map.put("channel_code", getChannel_code());
        map.put("union_bank_code", getUnion_bank_code());
        map.put("open_bank_code", getOpen_bank_code());
        map.put("bank_name_en", getBank_name_en());
        map.put("bank_name_cn", getBank_name_cn());
        map.put("bank_province", getBank_province());
        map.put("bank_city", getBank_city());
        map.put("callback_url", getCallback_url());
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

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBind_card() {
        return bind_card;
    }

    public void setBind_card(String bind_card) {
        this.bind_card = bind_card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getChannel_flag() {
        return channel_flag;
    }

    public void setChannel_flag(String channel_flag) {
        this.channel_flag = channel_flag;
    }

    public String getChannel_code() {
        return channel_code;
    }

    public void setChannel_code(String channel_code) {
        this.channel_code = channel_code;
    }

    public String getUnion_bank_code() {
        return union_bank_code;
    }

    public void setUnion_bank_code(String union_bank_code) {
        this.union_bank_code = union_bank_code;
    }

    public String getOpen_bank_code() {
        return open_bank_code;
    }

    public void setOpen_bank_code(String open_bank_code) {
        this.open_bank_code = open_bank_code;
    }

    public String getBank_name_en() {
        return bank_name_en;
    }

    public void setBank_name_en(String bank_name_en) {
        this.bank_name_en = bank_name_en;
    }

    public String getBank_name_cn() {
        return bank_name_cn;
    }

    public void setBank_name_cn(String bank_name_cn) {
        this.bank_name_cn = bank_name_cn;
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

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }
}
