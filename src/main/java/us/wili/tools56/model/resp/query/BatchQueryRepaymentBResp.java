package us.wili.tools56.model.resp.query;

<<<<<<< HEAD:src/main/java/us/wili/tools56/model/resp/query/BatchQueryRepaymentBResp.java
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
=======
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/resp/query/BatchQueryRepaymentBResp.java
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchQueryRepaymentBResp extends BaseResp {

    @ApiModelProperty(value = "批次号，必填，6", required = true)    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，6", required = true)    private String batch_count;
    @ApiModelProperty(value = "业务类别 ,必填，001-放款 002-到期还款 003-平台逾期代偿/担保公司代偿,3", required = true)    private String batch_type;
    @ApiModelProperty(value = "日期 ,必填，YYYYMMDD，需与文件名中的日期一致,8", required = true)    private String batch_date;
    private List<ItemsBean> items;

    public static BatchQueryRepaymentBResp fromJson(String content) {
        return JSONObject.parseObject(content, BatchQueryRepaymentBResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("version", getVersion());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("custom", getCustom());
        map.put("client", getClient());
        map.put("sequence_id", getSequence_id());
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());
        map.put("batch_date", getBatch_date());
        map.put("batch_type", getBatch_type());
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

    public String getBatch_type() {
        return batch_type;
    }

    public void setBatch_type(String batch_type) {
        this.batch_type = batch_type;
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

        private String result;
        private String message;
        @ApiModelProperty(value = "转让方电子账号，19", required = true)        private String out_card_no;
        @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)    private String amount;
        private String interest_amount;
        private String real_amount;
        @ApiModelProperty(value = "承接方电子账号，19", required = true)        private String in_card_no;
        @ApiModelProperty(value = "币种 ，必填，156，3", required = true)    private String currency;
        @ApiModelProperty(value = "转出方手续费扣款方式 0：指定金额； 1：同产品设置，1", required = true)        private String out_fee_mode;
        private String out_fee_amount;
        private String real_out_fee_amount;
        @ApiModelProperty(value = "转出方手续费扣款金额,11", required = true)        private String in_fee_mode;
        @ApiModelProperty(value = "转入方手续费扣款金额，11", required = true)        private String in_fee_amount;
        private String real_in_fee_amount;
        @ApiModelProperty(value = "标的编号 ,必填，投标时使用的标的编号一致,40",required = true)        private String assets_no;
        @ApiModelProperty(value = "投标申请授权码 ,必填,20", required = true)        private String auth_code;
        @ApiModelProperty(value = "交易流水号，32")    private String serial_no;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，必填，40", required = true)        private String third_reserved;

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

        public String getOut_card_no() {
            return out_card_no;
        }

        public void setOut_card_no(String out_card_no) {
            this.out_card_no = out_card_no;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getInterest_amount() {
            return interest_amount;
        }

        public void setInterest_amount(String interest_amount) {
            this.interest_amount = interest_amount;
        }

        public String getReal_amount() {
            return real_amount;
        }

        public void setReal_amount(String real_amount) {
            this.real_amount = real_amount;
        }

        public String getIn_card_no() {
            return in_card_no;
        }

        public void setIn_card_no(String in_card_no) {
            this.in_card_no = in_card_no;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getOut_fee_mode() {
            return out_fee_mode;
        }

        public void setOut_fee_mode(String out_fee_mode) {
            this.out_fee_mode = out_fee_mode;
        }

        public String getOut_fee_amount() {
            return out_fee_amount;
        }

        public void setOut_fee_amount(String out_fee_amount) {
            this.out_fee_amount = out_fee_amount;
        }

        public String getReal_out_fee_amount() {
            return real_out_fee_amount;
        }

        public void setReal_out_fee_amount(String real_out_fee_amount) {
            this.real_out_fee_amount = real_out_fee_amount;
        }

        public String getIn_fee_mode() {
            return in_fee_mode;
        }

        public void setIn_fee_mode(String in_fee_mode) {
            this.in_fee_mode = in_fee_mode;
        }

        public String getIn_fee_amount() {
            return in_fee_amount;
        }

        public void setIn_fee_amount(String in_fee_amount) {
            this.in_fee_amount = in_fee_amount;
        }

        public String getReal_in_fee_amount() {
            return real_in_fee_amount;
        }

        public void setReal_in_fee_amount(String real_in_fee_amount) {
            this.real_in_fee_amount = real_in_fee_amount;
        }

        public String getAssets_no() {
            return assets_no;
        }

        public void setAssets_no(String assets_no) {
            this.assets_no = assets_no;
        }

        public String getAuth_code() {
            return auth_code;
        }

        public void setAuth_code(String auth_code) {
            this.auth_code = auth_code;
        }

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }

        public String getThird_reserved() {
            return third_reserved;
        }

        public void setThird_reserved(String third_reserved) {
            this.third_reserved = third_reserved;
        }
    }
}
