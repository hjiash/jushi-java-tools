package us.wili.tools56.model.resp.account;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SetPasswordPAsyncResp extends BaseResp {
    @ApiModelProperty(value = "申请流水号,32为位 必填",required = true)    private String out_serial_no;
    @ApiModelProperty(value = "客户号，11(位数)",required = true)    private String customer_no;
    @ApiModelProperty(value = "卡号，必填，电子账户，19",required = true)private String card_no;

    public static SetPasswordPAsyncResp fromJson(String content) {
        return JSONObject.parseObject(content, SetPasswordPAsyncResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("service", getService());
        map.put("version", getVersion());
        map.put("uuid", getUuid());
        map.put("sequence_id", getSequence_id());
        map.put("custom", getCustom());
        map.put("encode", getEncode());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("client", getClient());
        map.put("customer_no", getCustomer_no());
        map.put("card_no", getCard_no());
        map.put("out_serial_no", getOut_serial_no());
        return map;
    }


    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
}
