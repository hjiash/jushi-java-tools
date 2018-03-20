package us.wili.tools56.model.req.transaction;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.model.dto.req.BaseReqDto;

import javax.validation.constraints.Pattern;

/**
 * Created by lhyue on 2018/3/17.
 */
public class RevokeBidReq extends BaseReqDto {
    @ApiModelProperty(value = "电子账户,必填", required = true)
    private String card_no;
    @ApiModelProperty(value = "申请流水号 ,必填，用于交易的唯一性标识,(32)位数", required = true)
    private String out_serial_no;
    @ApiModelProperty(value = "原交易申请流水号 ,必填，原投标交易申请号,40", required = true)
    private String origin_serial_no;
    @ApiModelProperty(value = "投标金额 ，必填,13位保留两位", required = true)
    private String amount;
    @ApiModelProperty(value = "标的编号 ,必填，标的信息录入时的标的编号,(40)位数", required = true)
    private String asset_no;

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

    @Length(max = 40, message = "申请流水号长度最大为40位")
    @NotBlank(message = "申请流水号不能为空")
    public String getOrigin_serial_no() {
        return origin_serial_no;
    }

    public void setOrigin_serial_no(String origin_serial_no) {
        this.origin_serial_no = origin_serial_no;
    }

    @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "投标金额最多13个字符，且要保留两位小数")
    @NotBlank(message = "投标金额不能为空")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    @Length(max = 40, message = "标的编号长度最大为40位")
    @NotBlank(message = "标的编号不能为空")
    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }
}
