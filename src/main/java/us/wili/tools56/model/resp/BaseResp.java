package us.wili.tools56.model.resp;

import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.BaseModel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public abstract class BaseResp extends BaseModel implements Serializable {
    private String code;
    private String msg;
    private String service;
    private String version;
    private String uuid;
    private String sequence_id;
    private String custom;
    private String encode;
    private String sign_type;
    private String sign;
    private String timestamp;
    private String client;

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

        return map;
    }

    public static BaseResp fromJson(String content) {
        return JSONObject.parseObject(content, BaseResp.class);
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getSequence_id() {
        return sequence_id;
    }

    public void setSequence_id(String sequence_id) {
        this.sequence_id = sequence_id;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }
}
