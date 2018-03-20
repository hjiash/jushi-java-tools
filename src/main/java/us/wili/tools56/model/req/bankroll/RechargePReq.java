package us.wili.tools56.model.req.bankroll;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.common.model.validator.Phone;
import us.wili.tools56.model.req.BaseReq;

import javax.validation.constraints.Pattern;

/**
 * Created by lhyue on 2018/3/17.
 */
public class RechargePReq extends BaseReq {
    @ApiModelProperty(value = "订单编号 ,必填,(32)位数", required = true)
    private String order_no;
    @ApiModelProperty(value = "电子账号，必填，限定19个字符", required = true)
    private String card_no;
    @ApiModelProperty(value = "绑定卡卡号 ，必填，esb校验，限定19个字符", required = true)
    private String bind_card;
    @ApiModelProperty(value = "币种 ，必填，限定3个字符", required = true)
    private String currency;
    @ApiModelProperty(value = "金额 ，必填，精确到分，限定12个字符", required = true)
    private String amount;
    @ApiModelProperty(value = "充值手续费 ，必填，精确到分，限定12个字符", required = true)
    private String fee;
    @ApiModelProperty(value = "证件类型，必填，限定2个字符", required = true)
    private String cert_type;
    @ApiModelProperty(value = "证件号码，必填，限定18个字符", required = true)
    private String cert_no;
    @ApiModelProperty(value = "姓名，必填，限定60个字符", required = true)
    private String name;
    @ApiModelProperty(value = "手机号码，必填，限定12个字符", required = true)
    private String mobile;
    @ApiModelProperty(value = "ESB代发实名认证标志 ，必填，首次充值上送Y，之后充值上送N，限定1个字符", required = true)
    private String auth_flag;
    @ApiModelProperty(value = "实名认证流水号 ，条件可选，限定6个字符", required = true)
    private String auth_seq_id;
    @ApiModelProperty(value = "开户银行代码，条件可选 ，限定20个字符", required = true)
    private String user_bank_code;
    @ApiModelProperty(value = "开户银行英文缩写，条件可选，限定20个字符", required = true)
    private String user_bank_name_en;
    @ApiModelProperty(value = "开户银行中文名称，条件可选，限定50个字符", required = true)
    private String user_bank_name_cn;
    @ApiModelProperty(value = "开户行省份，条件可选，限定20个字符", required = true)
    private String bank_province;
    @ApiModelProperty(value = "开户行城市，条件可选，限定50个字符", required = true)
    private String bank_city;

    @Length(max = 32, message = "订单编号限定32个字符")
    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    @Length(min = 19, max = 19, message = "电子账号长度必须为19位")
    @NotBlank(message = "电子账户不能为空")
    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    @CreditCardNumber(message = "银行卡格式错误")
    @NotBlank(message = "银行卡不能为空")
    public String getBind_card() {
        return bind_card;
    }

    public void setBind_card(String bind_card) {
        this.bind_card = bind_card;
    }

    @Pattern(regexp = "^\\d{3}$")
    @NotBlank(message = "币种信息不能为空")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,8}.\\d{2}$", message = "投标金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "金额不能为空")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,8}.\\d{2}$", message = "投标金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "充值手续费不能为空")
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Pattern(regexp = "^\\d{2}$", message = "证件类型限定2个字符")
    @NotBlank(message = "证件类型不能为空")
    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    @Length(max = 18, message = "证件号码长度必须为18位")
    @NotBlank(message = "证件号码不能为空")
    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    @Length(max = 60, message = "名称长度必须为60位")
    @NotBlank(message = "名称不能为空")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Phone
    @NotBlank(message = "手机号不能为空")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Pattern(regexp = "^[Y|N]$", message = "错误的ESB代发实名认证标志")
    @NotBlank(message = "ESB代发实名认证标志不能为空")
    public String getAuth_flag() {
        return auth_flag;
    }

    public void setAuth_flag(String auth_flag) {
        this.auth_flag = auth_flag;
    }

    @Length(max = 6, message = "实名认证流水号限定6个字符")
    public String getAuth_seq_id() {
        return auth_seq_id;
    }

    public void setAuth_seq_id(String auth_seq_id) {
        this.auth_seq_id = auth_seq_id;
    }

    @Length(max = 20, message = "开户银行代码限定20个字符")
    public String getUser_bank_code() {
        return user_bank_code;
    }

    public void setUser_bank_code(String user_bank_code) {
        this.user_bank_code = user_bank_code;
    }

    @Length(max = 20, message = "开户银行英文缩写限定20个字符")
    public String getUser_bank_name_en() {
        return user_bank_name_en;
    }

    public void setUser_bank_name_en(String user_bank_name_en) {
        this.user_bank_name_en = user_bank_name_en;
    }

    @Length(max = 50, message = "开户银行中文缩写限定50个字符")
    public String getUser_bank_name_cn() {
        return user_bank_name_cn;
    }

    public void setUser_bank_name_cn(String user_bank_name_cn) {
        this.user_bank_name_cn = user_bank_name_cn;
    }

    @Length(max = 20, message = "开户行省份限定20个字符")
    public String getBank_province() {
        return bank_province;
    }

    public void setBank_province(String bank_province) {
        this.bank_province = bank_province;
    }

    @Length(max = 50, message = "开户行省份限定50个字符")
    public String getBank_city() {
        return bank_city;
    }

    public void setBank_city(String bank_city) {
        this.bank_city = bank_city;
    }
}
