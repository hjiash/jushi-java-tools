package us.wili.tools56.model.req.transaction;

import us.wili.dev.model.dto.req.BaseReqDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignWithdrawalsQueryReqDto extends BaseReqDto {
    private String card_no;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
}
