package us.wili.tools56.model.req.transaction;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.model.dto.req.BaseReqDto;

import javax.validation.constraints.Pattern;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignCreditTransferPReq extends BaseReqDto {
    @ApiModelProperty(value = "电子账户,必填", required = true)
    private String card_no;
    @ApiModelProperty(value = "投标金额 ，必填,13位保留两位", required = true)
    private String amount;
    @ApiModelProperty(value = "单笔签约最高金额，(13)位数")
    private String unit_amount;
    @ApiModelProperty(value = "申请流水号 ,必填，用于交易的唯一性标识,(32)位数", required = true)
    private String out_serial_no;
    @ApiModelProperty(value = "签约起始时间（时间戳），必填，(10)位数", required = true)
    private String start_time;
    @ApiModelProperty(value = "签约结束时间（时间戳），必填，(10)位数", required = true)
    private String end_time;

    @Length(min = 19, max = 19, message = "电子账号长度必须为19位")
    @NotBlank(message = "电子账户不能为空")
    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "投标金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "投标金额不能为空")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,12}$", message = "单笔签约最高金额")
    public String getUnit_amount() {
        return unit_amount;
    }

    public void setUnit_amount(String unit_amount) {
        this.unit_amount = unit_amount;
    }

    @Length(max = 32, message = "申请流水号长度最大为32位")
    @NotBlank(message = "申请流水号不能为空")
    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    @Pattern(regexp = "^\\d{10}$")
    @NotBlank(message = "签约起始时间不能为空")
    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    @Pattern(regexp = "^\\d{10}$")
    @NotBlank(message = "签约结束时间不能为空")
    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void validate() {
        if (end_time.compareTo(start_time) < 0) {
            // TODO 抛出异常
        }

    }

}
