package us.wili.tools56.model.req.account;

<<<<<<< HEAD:src/main/java/us/wili/tools56/model/req/account/UnBindBankCardReq.java
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;
=======
import us.wili.tools56.model.req.BaseReq;
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/req/account/UnBindBankCardReq.java

/**
 * Created by lhyue on 2018/3/17.
 */
public class UnBindBankCardReq extends BaseReq {
<<<<<<< HEAD:src/main/java/us/wili/tools56/model/req/account/UnBindBankCardReq.java
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
=======
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/req/account/UnBindBankCardReq.java
    private String card_no;
    @ApiModelProperty(value = "绑定卡号，必填，19(位数)", required = true)
    private String bank_card_no;
    @ApiModelProperty(value = "客户号，11(位数)", required = true)
    private String customer_no;
    @ApiModelProperty(value = "交易流水号，32")
    private String serial_no;
    @ApiModelProperty(value = "主副卡类型 ,0,位主卡", required = true)
    private String card_type;

    public UnBindBankCardReq() {
        super();
        this.service = "unbind_bank_card";
    }


    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("bank_card_no", getBank_card_no());
        map.put("customer_no", getCustomer_no());
        map.put("serial_no", getSerial_no());
        map.put("card_type", getCard_type());

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

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }
}
