package us.wili.tools56.model.req.batchProcessing;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.model.dto.req.BaseReqDto;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchRepaymentReq extends BaseReqDto {

    @ApiModelProperty(value = "批次号 ,必填,30", required = true)
    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，4个字符", required = true)
    private String batch_count;
    @ApiModelProperty(value = "业务类别, 必填，001-放款,3个字符", required = true)
    private String batch_type;
    @ApiModelProperty(value = "日期 ,必填，YYYYMMDD，8个字符", required = true)
    private String batch_date;
    @ApiModelProperty(value = "", required = true)
    private List<ItemsBean> items;

    @NotBlank(message = "批次号不能为空")
    @Length(max = 30, message = "批次号限定30个字符")
    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    @NotBlank(message = "数据总量不能为空")
    @Pattern(regexp = "^\\d{4}$", message = "数据总量限定4个字符")
    public String getBatch_count() {
        return batch_count;
    }

    public void setBatch_count(String batch_count) {
        this.batch_count = batch_count;
    }

    @NotBlank(message = "业务类别不能为空")
    @Pattern(regexp = "^\\d{3}$", message = "业务类别限定3个字符")
    public String getBatch_type() {
        return batch_type;
    }

    public void setBatch_type(String batch_type) {
        this.batch_type = batch_type;
    }

    @NotBlank(message = "日期不能为空")
    @Pattern(regexp = "^\\d{8}$", message = "日期限定8个字符")
    public String getBatch_date() {
        return batch_date;
    }

    public void setBatch_date(String batch_date) {
        this.batch_date = batch_date;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        @ApiModelProperty(value = "扣款账号 ,必填,19个字符", required = true)
        private String out_card_no;
        @ApiModelProperty(value = "扣账(本金)金额 ,条件选填，整数10位，小数2位,12个字符", required = true)
        private String amount;
        @ApiModelProperty(value = "扣账利息金额 ,条件选填，整数10位，小数2位，12字符", required = true)
        private String interest_amount;
        @ApiModelProperty(value = "转入账号 ,必填，19字符", required = true)
        private String in_card_no;
        @ApiModelProperty(value = "币种 ,必填，156：人民币，3个字符", required = true)
        private String currency;
        @ApiModelProperty(value = "转出方手续费扣款方式, 必填，0：指定金额，1个字符", required = true)
        private String out_fee_mode;
        @ApiModelProperty(value = "转出方手续费扣款金额，条件选填，2位小数，可为0.11")
        private String out_fee_amount;
        @ApiModelProperty(value = "转入方手续费扣款方式 ,必填，0：指定金额,1个字符", required = true)
        private String in_fee_mode;
        @ApiModelProperty(value = "转入方手续费扣款金额 ,条件选填，2位小数，可为0.11")
        private String in_fee_amount;
        @ApiModelProperty(value = "标的编号 ,必填，投标时使用的标的编号一致,40个字符", required = true)
        private String assets_no;
        @ApiModelProperty(value = "投标申请授权码 ,必填,20个字符", required = true)
        private String auth_code;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，40个字符", required = true)
        private String third_reserved;
        @ApiModelProperty(value = "投标申请流水号 ,必填，投标上送流水号，32字符", required = true)
        private String serial_no;

        @Length(min = 19, max = 19, message = "扣款账号长度必须为19位")
        @NotBlank(message = "扣款账户不能为空")
        public String getOut_card_no() {
            return out_card_no;
        }

        public void setOut_card_no(String out_card_no) {
            this.out_card_no = out_card_no;
        }

        @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "投标金额最多13个字符，且要保留两位小数")
        @NotBlank(message = "投标金额不能为空")
        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        @Pattern(regexp = "^[1-9]{1}\\d{0,6}.\\d{2}$", message = "扣账利息金额最多13个字符，且要保留两位小数")
        @NotBlank(message = "扣账利息金额不能为空")
        public String getInterest_amount() {
            return interest_amount;
        }

        public void setInterest_amount(String interest_amount) {
            this.interest_amount = interest_amount;
        }

        @Length(min = 19, max = 19, message = "转入账号长度必须为19位")
        @NotBlank(message = "转入账号不能为空")
        public String getIn_card_no() {
            return in_card_no;
        }

        public void setIn_card_no(String in_card_no) {
            this.in_card_no = in_card_no;
        }

        @Pattern(regexp = "^\\d{3}$")
        @NotBlank(message = "币种信息不能为空")
        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        @Pattern(regexp = "^0{1}$")
        @NotBlank(message = "转出方手续费扣款方式不能为空")
        public String getOut_fee_mode() {
            return out_fee_mode;
        }

        public void setOut_fee_mode(String out_fee_mode) {
            this.out_fee_mode = out_fee_mode;
        }

        @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "转出方手续费扣款金额最多13个字符，且要保留两位小数")
        @NotBlank(message = "转出方手续费扣款金额不能为空")
        public String getOut_fee_amount() {
            return out_fee_amount;
        }

        public void setOut_fee_amount(String out_fee_amount) {
            this.out_fee_amount = out_fee_amount;
        }

        @Pattern(regexp = "^0{1}$")
        @NotBlank(message = "转入方手续费扣款方式不能为空")
        public String getIn_fee_mode() {
            return in_fee_mode;
        }

        public void setIn_fee_mode(String in_fee_mode) {
            this.in_fee_mode = in_fee_mode;
        }

        @Pattern(regexp = "^[1-9]{1}\\d{0,9}.\\d{2}$", message = "转入方手续费扣款金额最多13个字符，且要保留两位小数")
        @NotBlank(message = "转入方手续费扣款金额不能为空")
        public String getIn_fee_amount() {
            return in_fee_amount;
        }

        public void setIn_fee_amount(String in_fee_amount) {
            this.in_fee_amount = in_fee_amount;
        }

        @Length(max = 40,message = "限定40个字符")
        @NotBlank(message = "不能为空")
        public String getAssets_no() {
            return assets_no;
        }

        public void setAssets_no(String assets_no) {
            this.assets_no = assets_no;
        }
        @Length(max = 20,message = "投标申请授权码限定20个字符")
        @NotBlank(message = "投标申请授权码不能为空")
        public String getAuth_code() {
            return auth_code;
        }

        public void setAuth_code(String auth_code) {
            this.auth_code = auth_code;
        }

        @Length(max = 40,message = "第三方流水号限定40个字符")
        @NotBlank(message = "第三方流水号不能为空")
        public String getThird_reserved() {
            return third_reserved;
        }

        public void setThird_reserved(String third_reserved) {
            this.third_reserved = third_reserved;
        }

        @Length(max = 32,message = "投标申请流水号 限定32个字符")
        @NotBlank(message = "投标申请流水号 不能为空")
        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }
    }
}
