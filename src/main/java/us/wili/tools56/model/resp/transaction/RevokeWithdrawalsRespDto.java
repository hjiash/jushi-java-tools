package us.wili.tools56.model.resp.transaction;

import us.wili.dev.model.dto.resp.BaseRespDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class RevokeWithdrawalsRespDto extends BaseRespDto {
    private String out_serial_no;
    private String name;
    private String revoke_sign_time;
    private String sign_flag;
    private String sign_date;
    private String sign_time;
    private String card_no;

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRevoke_sign_time() {
        return revoke_sign_time;
    }

    public void setRevoke_sign_time(String revoke_sign_time) {
        this.revoke_sign_time = revoke_sign_time;
    }

    public String getSign_flag() {
        return sign_flag;
    }

    public void setSign_flag(String sign_flag) {
        this.sign_flag = sign_flag;
    }

    public String getSign_date() {
        return sign_date;
    }

    public void setSign_date(String sign_date) {
        this.sign_date = sign_date;
    }

    public String getSign_time() {
        return sign_time;
    }

    public void setSign_time(String sign_time) {
        this.sign_time = sign_time;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
}
