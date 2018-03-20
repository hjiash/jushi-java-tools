package us.wili.tools56.model.req.transaction;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.tools56.model.req.BaseReq;

import javax.validation.constraints.Pattern;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AutoBidApplyReq extends BaseReq {
    @ApiModelProperty(value = "电子账号，必填，限定19个字符", required = true)
    private String card_no;
    @ApiModelProperty(value = "申请流水号 ,必填，用于交易的唯一性标识,(32)位数", required = true)
    private String out_serial_no;
    @ApiModelProperty(value = "借款金额，必填，两位小数，限定13个字符", required = true)
    private String amount;
    @ApiModelProperty(value = "投标金额 ，必填,13位保留两位", required = true)
    private String use_bonus;
    @ApiModelProperty(value = "抵扣红包金额 ,必填,两位小数,13", required = true)
    private String bonus_amount;

    private String auth_code;
    @ApiModelProperty(value = "标的编号 ,必填，标的信息录入时的标的编号,(40)位数", required = true)
    private String asset_no;
    @ApiModelProperty(value = "起息日 ,必填，YYYYMMDD,(8)位数", required = true)
    private String interest_date;
    @ApiModelProperty(value = "付息方式 ,必填 1：等额本息； 2：每月付息，到期还本；,(1)位数", required = true)
    private String interest_type;
    @ApiModelProperty(value = "利息每月支付日, 条件选填 ，DD ，付息方式为2时必填；,2", required = true)
    private String interest_day;
    @ApiModelProperty(value = "产品到期日 ,必填，YYYYMMDD,(8)位数", required = true)
    private String end_date;
    @ApiModelProperty(value = "预期年化收益率 ,必填，是5位小数如年化收益率为10%，需上送10.00000,8位保留5位", required = true)
    private String interest_rate;
    @ApiModelProperty(value = "是否冻结金额 ,必填，0：不冻结；1：冻结,1", required = true)
    private String frozen_flag;

    @Length(min = 19, max = 19, message = "电子账号长度必须为19位")
    @NotBlank(message = "电子账户不能为空")
    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    @Length(max = 32, message = "申请流水号长度最大为32位")
    @NotBlank(message = "申请流水号不能为空")
    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "投标金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "投标金额不能为空")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUse_bonus() {
        return use_bonus;
    }

    public void setUse_bonus(String use_bonus) {
        this.use_bonus = use_bonus;
    }

    public String getBonus_amount() {
        return bonus_amount;
    }

    public void setBonus_amount(String bonus_amount) {
        this.bonus_amount = bonus_amount;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    @Length(max = 40, message = "标的编号长度最大为40位")
    @NotBlank(message = "标的编号不能为空")
    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    @NotBlank(message = "起息日不能为空")
    public String getInterest_date() {
        return interest_date;
    }

    public void setInterest_date(String interest_date) {
        this.interest_date = interest_date;
    }

    @Pattern(regexp = "^[1-2]{1}$", message = "非法的付息方式代码")
    @NotBlank(message = "付息方式不能为空")
    public String getInterest_type() {
        return interest_type;
    }

    public void setInterest_type(String interest_type) {
        this.interest_type = interest_type;
    }

    @Pattern(regexp = "^0[1-9]{1}$|^1\\d{1}$|^2[0-8]{1}$", message = "日期格式错误")
    public String getInterest_day() {
        return interest_day;
    }

    public void setInterest_day(String interest_day) {
        this.interest_day = interest_day;
    }

    @NotBlank(message = "产品到期日不能为空")
    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,1}.\\d{5}$", message = "预计年化收益率格式错误")
    @NotBlank(message = "预计年化收益率不能为空")
    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }

    @Pattern(regexp = "^[0-1]{1}$", message = "未知是否冻结余额")
    @NotBlank(message = "未知是否冻结余额")
    public String getFrozen_flag() {
        return frozen_flag;
    }

    public void setFrozen_flag(String frozen_flag) {
        this.frozen_flag = frozen_flag;
    }
}
