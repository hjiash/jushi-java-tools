package us.wili.tools56.model.req.assets;

import us.wili.dev.model.dto.req.BaseReqDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AssetQueryReqDto extends BaseReqDto {
    private String asset_no;
    private String third_custom;

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
