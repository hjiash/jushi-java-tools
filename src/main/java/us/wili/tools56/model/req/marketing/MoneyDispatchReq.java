package us.wili.tools56.model.req.marketing;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class MoneyDispatchReq extends BaseReq {
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "承接方电子账号,必填,(19)位数", required = true)
    private String card_no_in;
    @ApiModelProperty(value = "币种 ，必填，156，3", required = true)
    private String currency;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;
    @ApiModelProperty(value = "是否使用交易描述 ,必填，1使用，0不使用,1", required = true)
    private String description_flag;
    @ApiModelProperty(value = "交易描述 , 条件选填，该字段禁止使用”/“，40", required = true)
    private String description;

    public MoneyDispatchReq() {
        super();
        setService("money_dispatch");
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("card_no_in", getCard_no_in());
        map.put("currency", getCurrency());
        map.put("amount", getAmount());
        map.put("description_flag", getDescription_flag());
        map.put("description", getDescription());
        return map;
    }


    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getCard_no_in() {
        return card_no_in;
    }

    public void setCard_no_in(String card_no_in) {
        this.card_no_in = card_no_in;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription_flag() {
        return description_flag;
    }

    public void setDescription_flag(String description_flag) {
        this.description_flag = description_flag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
