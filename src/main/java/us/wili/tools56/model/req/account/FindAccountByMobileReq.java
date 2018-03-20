package us.wili.tools56.model.req.account;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class FindAccountByMobileReq extends BaseReq {
    private String mobile;

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
        map.put("mobile", getMobile());

        return map;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
