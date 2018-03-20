package us.wili.tools56.model.req.assets;

import io.swagger.annotations.ApiModelProperty;
<<<<<<< HEAD
=======
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
>>>>>>> a5f4fed... 调整model类名称，新增service接口
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AssetsRevokeReq extends BaseReq {
<<<<<<< HEAD
    @ApiModelProperty(value = "标的编号，有条件必填，为空时查询所有的产品；不为空时按输入的产品发行方查询，6", required = true)
=======
    @ApiModelProperty(value = "标的编号，必填，由产品的发行方定义；需保证唯一性，限定40各字符", required = true)
>>>>>>> a5f4fed... 调整model类名称，新增service接口
    private String asset_no;
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)    private String amount;

    public AssetsRevokeReq() {
        super();
        this.service = "assets_revoke";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("asset_no", getAsset_no());
        map.put("amount", getAmount());
        return map;
    }

    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
