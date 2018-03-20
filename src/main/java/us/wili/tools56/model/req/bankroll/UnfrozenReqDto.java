package us.wili.tools56.model.req.bankroll;

import us.wili.dev.model.dto.req.BaseReqDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class UnfrozenReqDto extends BaseReqDto {
    private String card_no;
    private String out_serial_no;
    private String origin_serial_no;
    private String amount;
    private String asset_no;

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
