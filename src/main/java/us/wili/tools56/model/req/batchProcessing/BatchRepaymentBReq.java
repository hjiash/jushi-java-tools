package us.wili.tools56.model.req.batchProcessing;

import io.swagger.annotations.ApiModelProperty;
<<<<<<< HEAD:src/main/java/us/wili/tools56/model/req/batchProcessing/BatchRepaymentBReq.java
=======
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/req/batchProcessing/BatchRepaymentReq.java
import us.wili.tools56.model.req.BaseReq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
<<<<<<< HEAD:src/main/java/us/wili/tools56/model/req/batchProcessing/BatchRepaymentBReq.java
public class BatchRepaymentBReq extends BaseReq {
=======
public class BatchRepaymentReq extends BaseReq {
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/req/batchProcessing/BatchRepaymentReq.java

    @ApiModelProperty(value = "批次号，必填，6", required = true)
    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，6", required = true)
    private String batch_count;
    @ApiModelProperty(value = "业务类别 ,必填，001-放款 002-到期还款 003-平台逾期代偿/担保公司代偿,3", required = true)
    private String batch_type;
    @ApiModelProperty(value = "日期 ,必填，YYYYMMDD，需与文件名中的日期一致,8", required = true)
    private String batch_date;
    private List<ItemsBean> items;

    public BatchRepaymentBReq() {
        super();
        this.service = "batch_repayment_b";
    }


    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());
        map.put("batch_date", getBatch_date());
        map.put("batch_type", getBatch_type());

        List<Map<String, Object>> items = new ArrayList<>();
        for (BatchRepaymentBReq.ItemsBean itemsBean : getItems()) {
            Map<String, Object> childMap = itemsBean.toMap();
            items.add(childMap);
        }
        map.put("items", items);
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
        @ApiModelProperty(value = "转让方电子账号，19", required = true)
        private String out_card_no;
        @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
        private String amount;
        private String interest_amount;
        @ApiModelProperty(value = "承接方电子账号，19", required = true)
        private String in_card_no;
        @ApiModelProperty(value = "币种 ，必填，156，3", required = true)
        private String currency;
        @ApiModelProperty(value = "转出方手续费扣款方式 0：指定金额； 1：同产品设置，1", required = true)
        private String out_fee_mode;
        @ApiModelProperty(value = "转出方手续费扣款金额,11", required = true)
        private String out_fee_amount;
        @ApiModelProperty(value = "转入方手续费扣款方式,11", required = true)
        private String in_fee_mode;
        @ApiModelProperty(value = "转入方手续费扣款金额，11", required = true)
        private String in_fee_amount;
        @ApiModelProperty(value = "标的编号 ,必填，投标时使用的标的编号一致,40", required = true)
        private String assets_no;
        @ApiModelProperty(value = "投标申请授权码 ,必填,20", required = true)
        private String auth_code;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，必填，40", required = true)
        private String third_reserved;
        @ApiModelProperty(value = "交易流水号，32")
        private String serial_no;

        public Map<String, Object> toMap() {
            Map<String, Object> childMap = new HashMap<>();
            childMap.put("out_card_no", getOut_card_no());
            childMap.put("amount", getAmount());
            childMap.put("interest_amount", getInterest_amount());
            childMap.put("in_card_no", getIn_card_no());
            childMap.put("currency", getCurrency());
            childMap.put("out_fee_mode", getOut_fee_mode());
            childMap.put("out_fee_amount", getOut_fee_amount());
            childMap.put("in_fee_mode", getIn_fee_mode());
            childMap.put("in_fee_amount", getIn_fee_amount());
            childMap.put("assets_no", getAssets_no());
            childMap.put("auth_code", getAuth_code());
            childMap.put("third_reserved", getThird_reserved());
            childMap.put("serial_no", getSerial_no());
            return childMap;
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

        public String getThird_reserved() {
            return third_reserved;
        }

        public void setThird_reserved(String third_reserved) {
            this.third_reserved = third_reserved;
        }

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }
    }
}
