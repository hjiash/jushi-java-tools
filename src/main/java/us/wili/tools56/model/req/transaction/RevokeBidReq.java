package us.wili.tools56.model.req.transaction;

import io.swagger.annotations.ApiModelProperty;
<<<<<<< HEAD
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
=======
>>>>>>> 4f1b840... 添加文档说明
import us.wili.tools56.model.req.BaseReq;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class RevokeBidReq extends BaseReq {
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "申请流水号,32为位 必填", required = true)
    private String out_serial_no;
    @ApiModelProperty(value = "原交易流水号", required = true)
    private String origin_serial_no;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;
    @ApiModelProperty(value = "标的编号，有条件必填，为空时查询所有的产品；不为空时按输入的产品发行方查询，6", required = true)
    private String asset_no;

    public RevokeBidReq() {
        super();
        this.service = "";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();

        map.put("card_no", getCard_no());
        map.put("origin_serial_no", getOrigin_serial_no());
        map.put("out_serial_no", getOut_serial_no());
        map.put("amount", getAmount());
        map.put("asset_no", getAsset_no());
        return map;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    public String getOrigin_serial_no() {
        return origin_serial_no;
    }

    public void setOrigin_serial_no(String origin_serial_no) {
        this.origin_serial_no = origin_serial_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }
}
