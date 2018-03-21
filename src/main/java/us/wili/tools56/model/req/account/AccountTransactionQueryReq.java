package us.wili.tools56.model.req.account;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountTransactionQueryReq extends BaseReq {
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "冲正标志位，条件选填，默认所有，Y是 N否", required = true)
    private String record_flag;
    @ApiModelProperty(value = "交易类型，条件选填，默认所有流水，B：金融流水，N：非金融流水", required = true)
    private String transact_type;
    @ApiModelProperty(value = "起始记账日期，必填，格式：yyyyMMdd", required = true)
    private String begin_date;
    @ApiModelProperty(value = "结束记账日期，必填，格式：yyyyMMdd", required = true)
    private String end_date;
    @ApiModelProperty(value = "流水类型，条件选填，默认所有交易，0：所有交易；1：转入；2：转出", required = true)
    private String type;
    @ApiModelProperty(value = "排序，条件选填，默认正序 1：正序 2：倒序", required = true)
    private String order_by;
    @ApiModelProperty(value = "起始记录数，必填，大于等于1", required = true)
    private String current_result;
    @ApiModelProperty(value = "查询记录条数，必填，不得超过99", required = true)
    private String total_result;

    public AccountTransactionQueryReq() {
        super();
        this.service = "account_transaction_query";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("record_flag", getRecord_flag());
        map.put("transact_type", getTransact_type());
        map.put("begin_date", getBegin_date());
        map.put("end_date", getEnd_date());
        map.put("type", getType());
        map.put("order_by", getOrder_by());
        map.put("current_result", getCurrent_result());
        map.put("total_result", getTotal_result());

        return map;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getRecord_flag() {
        return record_flag;
    }

    public void setRecord_flag(String record_flag) {
        this.record_flag = record_flag;
    }

    public String getTransact_type() {
        return transact_type;
    }

    public void setTransact_type(String transact_type) {
        this.transact_type = transact_type;
    }

    public String getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrder_by() {
        return order_by;
    }

    public void setOrder_by(String order_by) {
        this.order_by = order_by;
    }

    public String getCurrent_result() {
        return current_result;
    }

    public void setCurrent_result(String current_result) {
        this.current_result = current_result;
    }

    public String getTotal_result() {
        return total_result;
    }

    public void setTotal_result(String total_result) {
        this.total_result = total_result;
    }
}
