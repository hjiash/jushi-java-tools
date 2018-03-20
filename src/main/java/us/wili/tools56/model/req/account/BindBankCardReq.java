package us.wili.tools56.model.req.account;

<<<<<<< HEAD:src/main/java/us/wili/tools56/model/req/account/BindBankCardReq.java
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;
=======
import us.wili.tools56.model.req.BaseReq;
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/req/account/BindBankCardReq.java

/**
 * Created by lhyue on 2018/3/17.
 */
public class BindBankCardReq extends BaseReq {
<<<<<<< HEAD:src/main/java/us/wili/tools56/model/req/account/BindBankCardReq.java
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
=======
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/req/account/BindBankCardReq.java
    private String card_no;
    @ApiModelProperty(value = "绑定卡号，必填，19(位数)", required = true)
    private String bank_card_no;
    @ApiModelProperty(value = "银行编码，必填，例如：BOC 中国银行 10(位数)", required = true)
    private String bank_id_no;
    @ApiModelProperty(value = "姓名，必填，60(位数)", required = true)
    private String name;
    @ApiModelProperty(value = "证件类型，必填，15:身份证18位，2(位数)", required = true)
    private String cert_type;
    @ApiModelProperty(value = "客户号，11(位数)", required = true)
    private String customer_no;
    @ApiModelProperty(value = "证件号码，必填,19(位数)", required = true)
    private String cert_no;
    @ApiModelProperty(value = "主副卡类型 ,0,位主卡", required = true)
    private String card_type;
    @ApiModelProperty(value = "绑定卡手机号码，必填,11(位数)", required = true)
    private String bank_mobile;
    @ApiModelProperty(value = "客户IP，有条件必填，32(位数)", required = true)
    private String user_ip;

    public BindBankCardReq() {
        super();
        this.service = "bind_bank_card";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("bank_card_no", getBank_card_no());
        map.put("bank_id_no", getBank_id_no());
        map.put("name", getName());
        map.put("cert_type", getCert_type());
        map.put("customer_no", getCustomer_no());
        map.put("cert_no", getCert_no());
        map.put("card_type", getCard_type());
        map.put("bank_mobile", getBank_mobile());
        map.put("user_ip", getUser_ip());

        return map;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getBank_card_no() {
        return bank_card_no;
    }

    public void setBank_card_no(String bank_card_no) {
        this.bank_card_no = bank_card_no;
    }

    public String getBank_id_no() {
        return bank_id_no;
    }

    public void setBank_id_no(String bank_id_no) {
        this.bank_id_no = bank_id_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getBank_mobile() {
        return bank_mobile;
    }

    public void setBank_mobile(String bank_mobile) {
        this.bank_mobile = bank_mobile;
    }

    public String getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(String user_ip) {
        this.user_ip = user_ip;
    }
}
