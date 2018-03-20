package us.wili.tools56.model.req.account;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class FindAccountByIdReq extends BaseReq {
    @ApiModelProperty(value = "证件类型，必填，15:身份证18位，2(位数)", required = true)
    private String cert_type;
    @ApiModelProperty(value = "证件号码，必填,19(位数)", required = true)
    private String cert_no;

    public FindAccountByIdReq() {
        super();
        this.service = "find_account_by_id";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("cert_type", getCert_type());
        map.put("cert_no", getCert_no());

        return map;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }
}
