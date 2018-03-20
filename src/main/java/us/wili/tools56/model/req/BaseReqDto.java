package us.wili.tools56.model.req;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.BaseModel;

import java.io.Serializable;

/**
 * Created by lhyue on 2018/3/17.
 */
public abstract class BaseReqDto extends BaseModel implements Serializable {
    @ApiModelProperty(hidden = true)
    private String service;
    @ApiModelProperty(hidden = true)
    private String timestamp;
    @ApiModelProperty(hidden = true)
    private String uuid;
    @ApiModelProperty(hidden = true)
    private String sign;
    @ApiModelProperty(hidden = true)
    private String sign_type;
    @ApiModelProperty(hidden = true)
    private String encode;
    @ApiModelProperty(hidden = true)
    private String version;
    @ApiModelProperty(hidden = true)
    private String custom;
    @ApiModelProperty(hidden = true)
    private String client;

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
