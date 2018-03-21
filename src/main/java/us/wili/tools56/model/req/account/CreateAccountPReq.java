package us.wili.tools56.model.req.account;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class CreateAccountPReq extends BaseReq {

    private String account_type;
    private String role_type;
    private String out_serial_no;
    private String success_url;
    private String fail_url;
    private String callback_url;

    public CreateAccountPReq() {
        super();
        this.service = "create_account_p";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();

        map.put("account_type", getAccount_type());
        map.put("role_type", getRole_type());
        map.put("out_serial_no", getOut_serial_no());
        map.put("success_url", getSuccess_url());
        map.put("fail_url", getFail_url());
        map.put("callback_url", getCallback_url());

        return map;
    }


    public String getAccount_type() {
        return "200201";
    }

    private void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getRole_type() {
        return role_type;
    }

    public void setRole_type(String role_type) {
        this.role_type = role_type;
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
