package us.wili.tools56.model.req.batchProcessing;

import us.wili.tools56.model.req.BaseReq;

import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchRevokeBuyCreditReq extends BaseReq {

    private String notify_url;
    private String batch_no;
    private String batch_count;
    private String batch_date;
    private List<ItemsBean> items;

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
        private String bank_no;
        private String in_card_no;
        private String out_card_no;
        private String transfer_amount;
        private String serial_no;
        private String origin_serial_no;
        private String reserved;
        private String third_reserved;

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

        public String getOrigin_serial_no() {
            return origin_serial_no;
        }

        public void setOrigin_serial_no(String origin_serial_no) {
            this.origin_serial_no = origin_serial_no;
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
