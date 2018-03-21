package us.wili.tools56.model.req.assets;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AssetsQueryReq extends BaseReq {
    @ApiModelProperty(value = "标的编号，有条件必填，为空时查询所有的产品；不为空时按输入的产品发行方查询，6", required = true)
    private String asset_no;
    @ApiModelProperty(value = "第三方保留域，第三方机构使用，原样返回，100(位数)")
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
