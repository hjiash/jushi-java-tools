package us.wili.tools56.model.req.transaction;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.common.model.validator.Phone;
import us.wili.dev.model.dto.req.BaseReqDto;

import javax.validation.constraints.Pattern;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BuyCreditPReq extends BaseReqDto {
    @ApiModelProperty(value = "承接方电子账号,必填,(19)位数", required = true)
    private String card_no_in;
    @ApiModelProperty(value = "申请流水号 ,必填，用于交易的唯一性标识,(32)位数", required = true)
    private String out_serial_no;
    @ApiModelProperty(value = "原交易申请流水号 ,必填，原投标交易申请号,40", required = true)
    private String origin_serial_no;
    @ApiModelProperty(value = "转让方电子账号,必填,(19)位数", required = true)
    private String card_no_out;
    @ApiModelProperty(value = "总共可转让金额，由转让人在不超过总原投标份额内进行控制,必填,13位保留两位", required = true)
    private String total_balance;
    @ApiModelProperty(value = "投标金额 ，必填,13位保留两位", required = true)
    private String amount;
    @ApiModelProperty(value = "转让价格，购买转让份额所需要的金额,必填,13位保留两位", required = true)
    private String transfer_price;
    @ApiModelProperty(value = "起息日 ,必填，YYYYMMDD,(8)位数", required = true)
    private String interest_date;
    @ApiModelProperty(value = "预期年化收益率 ,必填，是5位小数如年化收益率为10%，需上送10.00000,8位保留5位", required = true)
    private String interest_rate;
    @ApiModelProperty(value = "手续费扣费方式。必填,0：指定金额,(1)位数", required = true)
    private String fee_way;
    @ApiModelProperty(value = "转让手续费，手续费扣款方式为0时生效，可为0；手续费从转让方收取,必填,13位保留两位", required = true)
    private String fee;

    @ApiModelProperty(value = "手机号,必填", required = true)
    private String mobile;

    @Length(min = 19, max = 19, message = "承接人电子账号长度必须为19位")
    @NotBlank(message = "承接人电子账户不能为空")
    public String getCard_no_in() {
        return card_no_in;
    }

    public void setCard_no_in(String card_no_in) {
        this.card_no_in = card_no_in;
    }


    @Length(max = 32, message = "申请流水号长度最大为32位")
    @NotBlank(message = "申请流水号不能为空")
    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    @Length(max = 40, message = "申请流水号长度最大为40位")
    @NotBlank(message = "申请流水号不能为空")
    public String getOrigin_serial_no() {
        return origin_serial_no;
    }

    public void setOrigin_serial_no(String origin_serial_no) {
        this.origin_serial_no = origin_serial_no;
    }

    @Length(min = 19, max = 19, message = "转让人电子账号长度必须为19位")
    @NotBlank(message = "转让人电子账户不能为空")
    public String getCard_no_out() {
        return card_no_out;
    }

    public void setCard_no_out(String card_no_out) {
        this.card_no_out = card_no_out;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "总共可转让金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "总共可转让金额不能为空")
    public String getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(String total_balance) {
        this.total_balance = total_balance;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "投标金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "投标金额不能为空")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "转让价格最多13个字符，且要保留两位小数")
    @NotBlank(message = "转让价格不能为空")
    public String getTransfer_price() {
        return transfer_price;
    }

    public void setTransfer_price(String transfer_price) {
        this.transfer_price = transfer_price;
    }

    @NotBlank(message = "起息日不能为空")
    public String getInterest_date() {
        return interest_date;
    }

    public void setInterest_date(String interest_date) {
        this.interest_date = interest_date;
    }

    public String getFee_way() {
        return fee_way;
    }

    public void setFee_way(String fee_way) {
        this.fee_way = fee_way;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "转让手续费最多13个字符，且要保留两位小数")
    @NotBlank(message = "转让手续费不能为空")
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Phone
    @NotBlank(message = "手机号不能为空")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,1}.\\d{5}$", message = "预计年化收益率格式错误")
    @NotBlank(message = "预计年化收益率不能为空")
    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }
}
