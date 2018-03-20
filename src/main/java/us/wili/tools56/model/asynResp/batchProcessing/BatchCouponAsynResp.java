package us.wili.tools56.model.asynResp.batchProcessing;


import us.wili.tools56.model.asynResp.BaseAsynResp;

import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchCouponAsynResp extends BaseAsynResp {
    private String batch_no;
    private String batch_count;
    private String batch_date;
    private List<ItemsBean> items;

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
        private String in_card_no;
        private String amount;
        private String name;
        private String serial_no;
        private String result;
        private String third_reserved;
        private String message;

        public String getIn_card_no() {
            return in_card_no;
        }

        public void setIn_card_no(String in_card_no) {
            this.in_card_no = in_card_no;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getThird_reserved() {
            return third_reserved;
        }

        public void setThird_reserved(String third_reserved) {
            this.third_reserved = third_reserved;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
