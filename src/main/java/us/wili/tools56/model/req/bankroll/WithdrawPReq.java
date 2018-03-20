package us.wili.tools56.model.req.bankroll;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.common.model.validator.Phone;
import us.wili.dev.model.dto.req.BaseReqDto;

import javax.validation.constraints.Pattern;

/**
 * Created by lhyue on 2018/3/17.
 */
public class WithdrawPReq extends BaseReqDto {

    @ApiModelProperty(value = "订单编号 ,必填,(32)位数", required = true)
    private String order_no;
    @ApiModelProperty(value = "电子账号，必填，限定19个字符", required = true)
    private String card_no;
    @ApiModelProperty(value = "银行名称，限定60个字符", required = true)
    private String bank_name;
    @ApiModelProperty(value = "绑定卡号，必填，限定32个字符", required = true)
    private String bind_card;
    @ApiModelProperty(value = "姓名，必填，限定60个字符", required = true)
    private String name;
    @ApiModelProperty(value = "证件号码 , 必填，限定18个字符", required = true)
    private String cert_no;
    @ApiModelProperty(value = "证件类型 , 必填，15-身份证18位，20-其它，25-企业社会信用代码 注：企业开户时上送20或社会信用号25 ,(2)位数", required = true)
    private String cert_type;
    @ApiModelProperty(value = "手机号码 ，必填,(12)位数", required = true)
    private String mobile;
    @ApiModelProperty(value = "提现金额 ，必填,12位保留两位", required = true)
    private String amount;
    @ApiModelProperty(value = "手续费，必填,2个小数 限定10个字符", required = true)
    private String fee;
    @ApiModelProperty(value = "是否指定通道 ,条件选填，Y-指定资金通道(默认人民银行)， N-不填资金通道(ESB选择)，限定1个字符", required = true)
    private String channel_flag;
    @ApiModelProperty(value = "通道标识(如果channel_flag选Y就填G1) ,条件选填，限定2个字符", required = true)
    private String channel_code;
    @ApiModelProperty(value = "开户银行联行号 ,条件选填，(如果channel_code填了 G1就填写人民银行分配联行号,如果没填，就不用分配。),限定20个字符", required = true)
    private String union_bank_code;
    @ApiModelProperty(value = "开户银行代码 ,条件选填,(20)位数，限定20个字符", required = true)
    private String open_bank_code;
    @ApiModelProperty(value = "开户银行英文缩写，条件可选，限定20个字符", required = true)
    private String bank_name_en;
    @ApiModelProperty(value = "开户银行中文名称，条件可选，限定50个字符", required = true)
    private String bank_name_cn;
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

    @Length(max = 60, message = "银行名称限定60个字符")
    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    @CreditCardNumber(message = "银行卡号码错误")
    public String getBind_card() {
        return bind_card;
    }

    public void setBind_card(String bind_card) {
        this.bind_card = bind_card;
    }

    @Length(max = 60, message = "名称长度必须为60位")
    @NotBlank(message = "名称不能为空")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Length(max = 18, message = "证件号码长度必须为18位")
    @NotBlank(message = "证件号码不能为空")
    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    @Pattern(regexp = "^\\d{2}$", message = "证件类型限定2个字符")
    @NotBlank(message = "证件类型不能为空")
    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    @Phone
    @NotBlank(message = "手机号不能为空")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,8}.\\d{2}$", message = "投标金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "金额不能为空")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,5}.\\d{2}$", message = "手续费最多10个字符，且要保留两位小数")
    @NotBlank(message = "手续费不能为空")
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Pattern(regexp = "^[Y|N]$", message = "是否指定通道标志错误")
    public String getChannel_flag() {
        return channel_flag;
    }

    public void setChannel_flag(String channel_flag) {
        this.channel_flag = channel_flag;
    }

    @Length(max = 2, message = "通道标识限定2个字符")
    public String getChannel_code() {
        return channel_code;
    }

    public void setChannel_code(String channel_code) {
        this.channel_code = channel_code;
    }

    @Length(max = 20, message = "开户银行联行号限定20个字符")
    public String getUnion_bank_code() {
        return union_bank_code;
    }

    public void setUnion_bank_code(String union_bank_code) {
        this.union_bank_code = union_bank_code;
    }

    @Length(max = 20, message = "开户银行代码限定20个字符")
    public String getOpen_bank_code() {
        return open_bank_code;
    }

    public void setOpen_bank_code(String open_bank_code) {
        this.open_bank_code = open_bank_code;
    }

    @Length(max = 20, message = "开户银行英文缩写限定20个字符")
    public String getBank_name_en() {
        return bank_name_en;
    }

    public void setBank_name_en(String bank_name_en) {
        this.bank_name_en = bank_name_en;
    }

    @Length(max = 50, message = "开户银行中文缩写限定50个字符")
    public String getBank_name_cn() {
        return bank_name_cn;
    }

    public void setBank_name_cn(String bank_name_cn) {
        this.bank_name_cn = bank_name_cn;
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
