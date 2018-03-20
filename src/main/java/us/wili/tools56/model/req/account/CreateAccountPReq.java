package us.wili.tools56.model.req.account;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

/**
 * Created by lhyue on 2018/3/17.
 */
public class CreateAccountPReq extends BaseReq {

    @ApiModelProperty(hidden = true)
    private String account_type;

    private String role_type;

    private String out_serial_no;


    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
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

}
