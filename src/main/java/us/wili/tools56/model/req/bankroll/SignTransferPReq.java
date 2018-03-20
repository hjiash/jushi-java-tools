package us.wili.tools56.model.req.bankroll;

<<<<<<< HEAD:src/main/java/us/wili/tools56/model/req/bankroll/SignTransferPReq.java
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;
=======
import us.wili.tools56.model.req.BaseReq;
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/req/bankroll/SignTransferPReq.java

/**
 * Created by lhyue on 2018/3/17.
 */
public class SignTransferPReq extends BaseReq {
<<<<<<< HEAD:src/main/java/us/wili/tools56/model/req/bankroll/SignTransferPReq.java
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
=======
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/req/bankroll/SignTransferPReq.java
    private String card_no;
    @ApiModelProperty(value = "申请流水号,32为位 必填", required = true)
    private String out_serial_no;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;
    @ApiModelProperty(value = "签约开始时间", required = true)
    private String start_time;
    @ApiModelProperty(value = "结束开始时间", required = true)
    private String end_time;
    @ApiModelProperty(value = "回调地址，必填", required = true)
    private String callback_url;
    @ApiModelProperty(value = "成功跳转地址，必填", required = true)
    private String success_url;
    @ApiModelProperty(value = "失败跳转地址，256，必填", required = true)
    private String fail_url;

    public SignTransferPReq() {
        super();
        this.service = "sign_transfer_p";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("out_serial_no", getOut_serial_no());
        map.put("amount", getAmount());
        map.put("start_time", getStart_time());
        map.put("end_time", getEnd_time());
        map.put("callback_url", getCallback_url());
        map.put("success_url", getSuccess_url());
        map.put("fail_url", getFail_url());
        return map;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
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
}
