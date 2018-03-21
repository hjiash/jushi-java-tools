package us.wili.tools56.model.req;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.BaseModel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by lhyue on 2018/3/17.
 */
public abstract class BaseReq extends BaseModel implements Serializable {
    @ApiModelProperty(hidden = true)
    protected String service;
    @ApiModelProperty(hidden = true)
    protected String timestamp;
    @ApiModelProperty(hidden = true)
    protected String uuid;
    @ApiModelProperty(hidden = true)
    protected String sign;
    @ApiModelProperty(hidden = true)
    protected String sign_type = "";
    @ApiModelProperty(hidden = true)
    protected String encode = "";
    @ApiModelProperty(hidden = true)
    protected String version = "";
    @ApiModelProperty(value = "交易终端 ,必填，000001手机APP 000002网页 000003微信 000004柜面", required = false)
    protected String custom = "";
    @ApiModelProperty(value = "商户自定义数据——可选,用于传递商户自定义数据，商户上传的数据会直接返回给商户", required = false)
    protected String client = "";

    public BaseReq() {
        this.timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        this.uuid = UUID.randomUUID().toString().replace("-", "");
    }

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

        return map;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
}
