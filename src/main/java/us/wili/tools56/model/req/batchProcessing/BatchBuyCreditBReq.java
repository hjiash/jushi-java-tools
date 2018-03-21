package us.wili.tools56.model.req.batchProcessing;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchBuyCreditBReq extends BaseReq {
    @ApiModelProperty(value = "回调地址，必填,256", required = true)
    private String notify_url;
    @ApiModelProperty(value = "批次号，必填，6", required = true)
    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，6", required = true)
    private String batch_count;

    private List<ItemsBean> items;

    public BatchBuyCreditBReq() {
        super();
        this.client = "000002";
        this.service = "batch_buy_credit_b";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("notify_url", getNotify_url());
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());

        List<Map<String, Object>> items = new ArrayList<>();
        for (ItemsBean itemsBean : getItems()) {
            Map<String, Object> childMap = itemsBean.toMap();
            items.add(childMap);
        }
        map.put("items", items);

        return map;
    }


    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
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

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        @ApiModelProperty(value = "银行代号,10", required = true)
        private String bank_no;
        @ApiModelProperty(value = "承接方电子账号，19", required = true)
        private String in_card_no;
        @ApiModelProperty(value = "转让方电子账号，19", required = true)
        private String out_card_no;
        @ApiModelProperty(value = "交易流水号，32", required = true)
        private String serial_no;
        @ApiModelProperty(value = "原交易流水号", required = true)
        private String origin_serial_no;
        @ApiModelProperty(value = "总共可转让份额,必填，两位小数 由转让人在不超过总原投标份额内进行控制，13", required = true)
        private String total_amount;
        @ApiModelProperty(value = "转让份额，必填，两位小数本次转让份额+累计已转让份额不能大于总共可转让份额,13", required = true)
        private String transfer_amount;
        @ApiModelProperty(value = "转让价格 ,必填，两位小数购买转让份额所需要的金额,13", required = true)
        private String transfer_prise;
        @ApiModelProperty(value = "转让手续费 ，必填，手续费从转让方收取，13", required = true)
        private String transfer_fee;
        @ApiModelProperty(value = "起息日YYYYMMDD,必填,(8)位数", required = true)
        private String interest_date;
        @ApiModelProperty(value = "转让后预期年化收益率 ，必填，5位小数 ，如年化收益率为10%，需上送10.00000,8", required = true)
        private String interest_rate;
        @ApiModelProperty(value = "保留域，条件选填,60", required = true)
        private String reserved;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，必填，40", required = true)
        private String third_reserved;

        public Map<String, Object> toMap() {
            Map<String, Object> childMap = new HashMap<>();
            childMap.put("bank_no", getBank_no());
            childMap.put("in_card_no", getIn_card_no());
            childMap.put("out_card_no", getOut_card_no());
            childMap.put("serial_no", getSerial_no());
            childMap.put("origin_serial_no", getOrigin_serial_no());
            childMap.put("total_amount", getTotal_amount());
            childMap.put("transfer_amount", getTransfer_amount());
            childMap.put("transfer_prise", getTransfer_prise());
            childMap.put("transfer_fee", getTransfer_fee());
            childMap.put("interest_date", getInterest_date());
            childMap.put("interest_rate", getInterest_rate());
            childMap.put("reserved", getReserved());
            childMap.put("third_reserved", getThird_reserved());
            return childMap;
        }

        public String getBank_no() {
            return bank_no;
        }

        public void setBank_no(String bank_no) {
            this.bank_no = bank_no;
        }

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

        public String getOrigin_serial_no() {
            return origin_serial_no;
        }

        public void setOrigin_serial_no(String origin_serial_no) {
            this.origin_serial_no = origin_serial_no;
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

        public String getInterest_date() {
            return interest_date;
        }

        public void setInterest_date(String interest_date) {
            this.interest_date = interest_date;
        }

        public String getInterest_rate() {
            return interest_rate;
        }

        public void setInterest_rate(String interest_rate) {
            this.interest_rate = interest_rate;
        }

        public String getReserved() {
            return reserved;
        }

        public void setReserved(String reserved) {
            this.reserved = reserved;
        }

        public String getThird_reserved() {
            return third_reserved;
        }

        public void setThird_reserved(String third_reserved) {
            this.third_reserved = third_reserved;
        }
    }
}
