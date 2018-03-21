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
public class BatchRevokeBuyCreditBReq extends BaseReq {

    @ApiModelProperty(value = "回调地址，必填,256", required = true)
    private String notify_url;
    @ApiModelProperty(value = "批次号，必填，6", required = true)
    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，6", required = true)
    private String batch_count;
    @ApiModelProperty(value = "日期 ,必填，YYYYMMDD，需与文件名中的日期一致,8", required = true)
    private String batch_date;
    private List<ItemsBean> items;

    public BatchRevokeBuyCreditBReq() {
        super();
        this.service = "batch_revoke_buy_credit_b";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());
        map.put("batch_date", getBatch_date());
        map.put("notify_url", getNotify_url());
        map.put("items", getItems());

        List<Map<String, Object>> items = new ArrayList<>();
        for (BatchRevokeBuyCreditBReq.ItemsBean itemsBean : getItems()) {
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
        @ApiModelProperty(value = "银行代号,10", required = true)
        private String bank_no;
        @ApiModelProperty(value = "承接方电子账号，19", required = true)
        private String in_card_no;
        @ApiModelProperty(value = "转让方电子账号，19", required = true)
        private String out_card_no;
        @ApiModelProperty(value = "转让份额，必填，两位小数本次转让份额+累计已转让份额不能大于总共可转让份额13", required = true)
        private String transfer_amount;
        @ApiModelProperty(value = "交易流水号，32")
        private String serial_no;
        @ApiModelProperty(value = "保留域，条件选填,60", required = true)
        private String reserved;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，必填，40", required = true)
        private String third_reserved;

        public Map<String, Object> toMap() {
            Map<String, Object> childMap = new HashMap<>();
            childMap.put("bank_no", getBank_no());
            childMap.put("out_card_no", getOut_card_no());
            childMap.put("in_card_no", getIn_card_no());
            childMap.put("serial_no", getSerial_no());
            childMap.put("transfer_amount", getTransfer_amount());
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

        public String getTransfer_amount() {
            return transfer_amount;
        }

        public void setTransfer_amount(String transfer_amount) {
            this.transfer_amount = transfer_amount;
        }

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
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
