package us.wili.tools56.model.req.assets;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.model.dto.constant.InterestWay;
import us.wili.dev.model.dto.req.BaseReqDto;

import javax.validation.constraints.Pattern;

/**
 * Created by lhyue on 2018/3/17.
 */
@ApiModel("标的信息")
public class AssetsEnrollReq extends BaseReqDto {
    @ApiModelProperty(value = "标的编号，必填，由产品的发行方定义；需保证唯一性，限定40各字符", required = true)
    private String asset_no;
    @ApiModelProperty(value = "标的描述，必填，理财产品中文描述，限定60个字符", required = true)
    private String asset_brief;
    @ApiModelProperty(value = "借款人电子账号，必填，限定19个字符", required = true)
    private String card_no;
    @ApiModelProperty(value = "借款金额，必填，两位小数，限定13个字符", required = true)
    private String amount;
    @ApiModelProperty(value = "付息方式 ,必填 1：等额本息；2：每月付息，到期还本；3：等额本金；4：等比累进；5：等额累进；6：组合还款；7：其他，限定1个字符", required = true)
    private String interest_type;
    @ApiModelProperty(value = "利息每月支付日, 条件选填 ，DD ，付息方式为2时必填；限定2个字符")
    private String interest_day;
    @ApiModelProperty(value = "项目期限，必填，单位为天，限定4个字符", required = true)
    private String loan_term;
    @ApiModelProperty(value = "预计年化收益率，必填，五位小数 如年化收益率为10%，需上送10.00000，限定8个字符", required = true)
    private String interest_rate;
    @ApiModelProperty(value = "担保人电子账号，条件选填，限定19个字符")
    private String warrant_card_no;
    @ApiModelProperty(value = "名义借款人电子账户，条件选填，名义借款人电子账号，限定19个字符")
    private String borrow_card_no;
    @ApiModelProperty(value = "收款人电子账户，条件选填，多种借款人模式下必送，限定19个字符")
    private String debtor_card_no;
    @ApiModelProperty(value = "标的类型，必填，1：普通；2：受托支付，限定1个字符", required = true)
    private String trustee_pay_flag;

    @Length(max = 40, message = "标的编号最多40个字符")
    @NotBlank(message = "标的编号不能为空")
    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    @Length(max = 60, message = "标的描述最多60个字符")
    @NotBlank(message = "标的描述不能为空")
    public String getAsset_brief() {
        return asset_brief;
    }

    public void setAsset_brief(String asset_brief) {
        this.asset_brief = asset_brief;
    }

    @Length(max = 19, min = 19, message = "借款人电子账号应等于19个字符")
    @NotBlank(message = "借款人电子账号不能为空")
    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "借款金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "借款金额不能为空")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Pattern(regexp = "^[1-7]{1}$", message = "非法的付息方式代码")
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

    @Pattern(regexp = "^[1-9]{1}\\d{0,3}$", message = "项目期限格式错误")
    @NotBlank(message = "项目期限不能为空")
    public String getLoan_term() {
        return loan_term;
    }

    public void setLoan_term(String loan_term) {
        this.loan_term = loan_term;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,1}.\\d{5}$", message = "预计年化收益率格式错误")
    @NotBlank(message = "预计年化收益率不能为空")
    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }

    @Length(min = 19, max = 19, message = "担保人电子账号必须等于19个字符")
    public String getWarrant_card_no() {
        return warrant_card_no;
    }

    public void setWarrant_card_no(String warrant_card_no) {
        this.warrant_card_no = warrant_card_no;
    }

    @Length(min = 19, max = 19, message = "名义借款人电子账户必须等于19个字符")
    public String getBorrow_card_no() {
        return borrow_card_no;
    }

    public void setBorrow_card_no(String borrow_card_no) {
        this.borrow_card_no = borrow_card_no;
    }

    @Length(min = 19, max = 19, message = "收款人电子账户必须等于19个字符")
    public String getDebtor_card_no() {
        return debtor_card_no;
    }

    public void setDebtor_card_no(String debtor_card_no) {
        this.debtor_card_no = debtor_card_no;
    }

    @Pattern(regexp = "^[1-2]{1}$", message = "非法标的类型状态码")
    @NotBlank(message = "标的类型不能为空")
    public String getTrustee_pay_flag() {
        return trustee_pay_flag;
    }

    public void setTrustee_pay_flag(String trustee_pay_flag) {
        this.trustee_pay_flag = trustee_pay_flag;
    }

    public void check() {
        if (InterestWay.MONTHLY_INTEREST_RATE_MATURITY_REPAYMENT.getCode().equals(getInterest_type())) {
            if (getInterest_day() == null) {
                // TODO 抛出异常
            }
        }
    }

}

