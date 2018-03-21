package us.wili.tools56.model.req.assets;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AssetsQueryReq extends BaseReq {
    private String asset_no;
    private String third_custom;

    public AssetsQueryReq() {
        super();
        this.service = "asset_query";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();

        map.put("third_custom", getThird_custom());
        map.put("asset_no", getAsset_no());

        return map;
    }

    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    public String getThird_custom() {
        return third_custom;
    }

    public void setThird_custom(String third_custom) {
        this.third_custom = third_custom;
    }
}
