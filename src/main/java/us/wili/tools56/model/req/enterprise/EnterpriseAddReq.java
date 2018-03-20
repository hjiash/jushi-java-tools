package us.wili.tools56.model.req.enterprise;

import io.swagger.annotations.ApiModel;
import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhumubo
 */
@ApiModel(value = "线下企业账户信息")
public class EnterpriseAddReq extends BaseReq{

    private String cert_no;
    private String name;
    private String mobile;
    private String bind_card;
    private String card_no;
    private String customer_no;
    private String serial_no;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("sign_type", getSign_type());
        map.put("encode", getEncode());
        map.put("version", getVersion());
        map.put("custom", getCustom());
        map.put("client", getClient());
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
