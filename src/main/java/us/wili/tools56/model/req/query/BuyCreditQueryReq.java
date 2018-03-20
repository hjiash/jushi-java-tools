package us.wili.tools56.model.req.query;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BuyCreditQueryReq extends BaseReq {
    @ApiModelProperty(value = "承接方电子账号，19", required = true)
    private String in_card_no;
    @ApiModelProperty(value = "申请流水号,32为位 必填", required = true)
    private String out_serial_no;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("in_card_no", getIn_card_no());
        map.put("out_serial_no", getOut_serial_no());
        return map;
    }

    public String getIn_card_no() {
        return in_card_no;
    }

    public void setIn_card_no(String in_card_no) {
        this.in_card_no = in_card_no;
    }

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }
}
