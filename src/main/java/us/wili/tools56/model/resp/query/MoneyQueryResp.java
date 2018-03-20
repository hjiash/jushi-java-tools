package us.wili.tools56.model.resp.query;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;
import us.wili.tools56.model.resp.transaction.AuthorizationPResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class MoneyQueryResp extends BaseResp {
    private String status;
    private String name;
    @ApiModelProperty(value = "绑定卡卡号 ，必填，esb校验，19", required = true)    private String bind_card;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)    private String amount;
    private String order_time;
    private String error_code;
    private String error_msg;
    private String remark;

    public static MoneyQueryResp fromJson(String content) {
        return JSONObject.parseObject(content, MoneyQueryResp.class);
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
        map.put("sequence_id", getSequence_id());
        map.put("status", getStatus());
        map.put("name", getName());
        map.put("bind_card", getBind_card());
        map.put("amount", getAmount());
        map.put("order_time", getOrder_time());
        map.put("error_code", getError_code());
        map.put("error_msg", getError_msg());
        map.put("remark", getRemark());
        return map;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBind_card() {
        return bind_card;
    }

    public void setBind_card(String bind_card) {
        this.bind_card = bind_card;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
