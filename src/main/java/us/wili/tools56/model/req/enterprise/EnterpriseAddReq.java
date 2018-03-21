package us.wili.tools56.model.req.enterprise;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhumubo
 */
@ApiModel(value = "线下企业账户信息")
public class EnterpriseAddReq extends BaseReq {

    @ApiModelProperty(value = "证件号码，必填,19(位数)", required = true)
    private String cert_no;
    private String name;
    @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")
    private String mobile;
    @ApiModelProperty(value = "绑定卡卡号 ，必填，esb校验，19", required = true)    private String bind_card;
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "客户号，11(位数)", required = true)
    private String customer_no;
    @ApiModelProperty(value = "交易流水号，32")
    private String serial_no;

    @Override
    public Map<String, Object> toMap() {
<<<<<<< HEAD
        Map<String, Object> map = new HashMap<>();
        map.put("service", getService());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("sign_type", getSign_type());
        map.put("encode", getEncode());
        map.put("version", getVersion());
        map.put("custom", getCustom());
        map.put("client", getClient());
=======
        Map<String, Object> map = super.toMap();
>>>>>>> c82db61... 调整model
        map.put("card_no", getCard_no());
        map.put("cert_no", getCert_no());
        map.put("name", getName());
        map.put("mobile", getMobile());
        map.put("bind_card", getBind_card());
        map.put("customer_no", getCustomer_no());
        map.put("serial_no", getSerial_no());
        return map;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBind_card() {
        return bind_card;
    }

    public void setBind_card(String bind_card) {
        this.bind_card = bind_card;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }
}
