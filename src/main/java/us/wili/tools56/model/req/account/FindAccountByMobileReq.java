package us.wili.tools56.model.req.account;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class FindAccountByMobileReq extends BaseReq {
    private String mobile;

    public FindAccountByMobileReq() {
        super();
        this.service = "find_account_by_mobile";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
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
