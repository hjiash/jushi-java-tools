package us.wili.tools56.model.req.bankroll;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignRepaymentQueryReq extends BaseReq {
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;

    public SignRepaymentQueryReq() {
        super();
        this.service = "sign_repayment_query";
    }


    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        return map;
    }


    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
}
