package us.wili.tools56.model.resp.batchProcessing;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchBuyCreditBAsyncResp extends BaseResp {
    @ApiModelProperty(value = "批次号，必填，6", required = true)    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，6", required = true)    private String batch_count;
    @ApiModelProperty(value = "日期 ,必填，YYYYMMDD，需与文件名中的日期一致,8", required = true)    private String batch_date;
    private List<ItemsBean> items;

    public static BatchBuyCreditBAsyncResp fromJson(String content) {
        return JSONObject.parseObject(content, BatchBuyCreditBAsyncResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("service", getService());
        map.put("version", getVersion());
        map.put("uuid", getUuid());
        map.put("sequence_id", getSequence_id());
        map.put("custom", getCustom());
        map.put("encode", getEncode());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("client", getClient());
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());
        map.put("batch_date", getBatch_date());
        map.put("items", getItems());
        return map;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public String getBatch_count() {
        return batch_count;
    }

    public void setBatch_count(String batch_count) {
        this.batch_count = batch_count;
    }

    public String getBatch_date() {
        return batch_date;
    }

    public void setBatch_date(String batch_date) {
        this.batch_date = batch_date;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {

        @ApiModelProperty(value = "承接方电子账号，19", required = true)        private String in_card_no;
        @ApiModelProperty(value = "转让方电子账号，19", required = true)        private String out_card_no;
        @ApiModelProperty(value = "交易流水号，32")    private String serial_no;
        @ApiModelProperty(value = "投标申请授权码 ,必填,20", required = true)        private String auth_code;
        private String total_amount;
        private String transfer_amount;
        private String transfer_prise;
        private String transfer_fee;
        private String result;
        private String message;
        @ApiModelProperty(value = "保留域，条件选填,60", required = true)        private String reserved;
       @ApiModelProperty(value = "原交易流水号",required = true)    private String origin_serial_no;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，必填，40", required = true)        private String third_reserved;

        public String getIn_card_no() {
            return in_card_no;
        }

        public void setIn_card_no(String in_card_no) {
            this.in_card_no = in_card_no;
        }

        public String getOut_card_no() {
            return out_card_no;
        }

        public void setOut_card_no(String out_card_no) {
            this.out_card_no = out_card_no;
        }

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }

        public String getAuth_code() {
            return auth_code;
        }

        public void setAuth_code(String auth_code) {
            this.auth_code = auth_code;
        }

        public String getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(String total_amount) {
            this.total_amount = total_amount;
        }

        public String getTransfer_amount() {
            return transfer_amount;
        }

        public void setTransfer_amount(String transfer_amount) {
            this.transfer_amount = transfer_amount;
        }

        public String getTransfer_prise() {
            return transfer_prise;
        }

        public void setTransfer_prise(String transfer_prise) {
            this.transfer_prise = transfer_prise;
        }

        public String getTransfer_fee() {
            return transfer_fee;
        }

        public void setTransfer_fee(String transfer_fee) {
            this.transfer_fee = transfer_fee;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getReserved() {
            return reserved;
        }

        public void setReserved(String reserved) {
            this.reserved = reserved;
        }

        public String getOrigin_serial_no() {
            return origin_serial_no;
        }

        public void setOrigin_serial_no(String origin_serial_no) {
            this.origin_serial_no = origin_serial_no;
        }

        public String getThird_reserved() {
            return third_reserved;
        }

        public void setThird_reserved(String third_reserved) {
            this.third_reserved = third_reserved;
        }
    }
}
