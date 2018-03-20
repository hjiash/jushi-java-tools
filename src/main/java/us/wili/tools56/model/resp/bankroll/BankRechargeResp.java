package us.wili.tools56.model.resp.bankroll;

<<<<<<< HEAD
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

=======
import us.wili.tools56.model.resp.BaseResp;

>>>>>>> a5f4fed... 调整model类名称，新增service接口
/**
 * Created by lhyue on 2018/3/20.
 */
public class BankRechargeResp extends BaseResp {
<<<<<<< HEAD
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    private String order_no;

    public static BankRechargeResp fromJson(String content) {
        return JSONObject.parseObject(content, BankRechargeResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("version", getVersion());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("custom", getCustom());
        map.put("client", getClient());
        map.put("encode", getEncode());
        map.put("sequence_id", getSequence_id());
        map.put("card_no", getCard_no());
        map.put("order_no", getOrder_no());
        map.put("amount", getAmount());
        return map;
    }

=======
    private String amount;
    private String card_no;
    private String order_no;

>>>>>>> a5f4fed... 调整model类名称，新增service接口
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }
}
