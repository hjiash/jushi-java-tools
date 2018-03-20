package us.wili.tools56.model.req.enterprise;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.dev.common.model.validator.Phone;

/**
 * @author zhumubo
 */
@ApiModel(value = "线下企业账户信息")
public class EnterpriseAddReq {

    @ApiModelProperty(value = "营业执照编号,必填", required = true)
    private String cert_no;

    @ApiModelProperty(value = "公司名称,必填", required = true)
    private String name;

    @ApiModelProperty(value = "手机号,必填", required = true)
    private String mobile;

    @ApiModelProperty(value = "银行卡号,必填", required = true)
    private String bind_card;

    @ApiModelProperty(value = "电子账户,必填", required = true)
    private String card_no;

    @ApiModelProperty(value = "客户号,必填", required = true)
    private String customer_no;

    @ApiModelProperty(value = "三方绑定编号,必填", required = true)
    private String serial_no;

    @NotBlank(message = "营业执照编号不能为空")
    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    @NotBlank(message = "公司名称不能为空")
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

    @CreditCardNumber
    @NotBlank(message = "银行卡号不能为空")
    public String getBind_card() {
        return bind_card;
    }

    public void setBind_card(String bind_card) {
        this.bind_card = bind_card;
    }

    @NotBlank(message = "电子账户不能为空")
    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    @NotBlank(message = "客户号不能为空")
    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    @NotBlank(message = "三方绑定编号不能为空")
    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }
}
