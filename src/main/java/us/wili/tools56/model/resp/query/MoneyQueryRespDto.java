package us.wili.tools56.model.resp.query;

import us.wili.dev.model.dto.resp.BaseRespDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class MoneyQueryRespDto extends BaseRespDto {
    private String status;
    private String name;
    private String bind_card;
    private String amount;
    private String order_time;
    private String error_code;
    private String error_msg;
    private String remark;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBind_card() {
        return bind_card;
    }

    public void setBind_card(String bind_card) {
        this.bind_card = bind_card;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
