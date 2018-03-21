package us.wili.tools56.model.req.account;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class ChangeMobileReq extends BaseReq {
    @ApiModelProperty(value = "卡号，必填，电子账户，19",required = true)private String card_no;
    @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")    private String mobile;

    public ChangeMobileReq() {
        super();
        this.service = "change_mobile";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("mobile", getMobile());

        return map;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
