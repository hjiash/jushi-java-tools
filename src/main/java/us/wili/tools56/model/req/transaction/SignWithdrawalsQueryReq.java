package us.wili.tools56.model.req.transaction;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignWithdrawalsQueryReq extends BaseReq {
    private String card_no;

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
