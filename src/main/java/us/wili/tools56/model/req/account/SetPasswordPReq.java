package us.wili.tools56.model.req.account;

import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class SetPasswordPReq extends BaseReq {
    private String customer_no;
    private String card_no;
    private String out_serial_no;
    private String success_url;
    private String fail_url;
    private String callback_url;

    public SetPasswordPReq() {
        super();
        this.service = "set_password_p";
        setClient("000002");
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("customer_no", getCustomer_no());
        map.put("card_no", getCard_no());
        map.put("out_serial_no", getOut_serial_no());
        map.put("success_url", getSuccess_url());
        map.put("fail_url", getFail_url());
        map.put("callback_url", getCallback_url());

        return map;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
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

    public String getSuccess_url() {
        return success_url;
    }

    public void setSuccess_url(String success_url) {
        this.success_url = success_url;
    }

    public String getFail_url() {
        return fail_url;
    }

    public void setFail_url(String fail_url) {
        this.fail_url = fail_url;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }
}
