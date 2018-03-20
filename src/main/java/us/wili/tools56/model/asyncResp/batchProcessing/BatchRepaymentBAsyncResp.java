package us.wili.tools56.model.asyncResp.batchProcessing;


import us.wili.tools56.model.asyncResp.BaseAsyncResp;

import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchRepaymentBAsyncResp extends BaseAsyncResp {

    private String batch_no;
    private String batch_count;
    private String batch_type;
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
        private String out_card_no;
        private String amount;
        private String interest_amount;
        private String real_amount;
        private String in_card_no;
        private String currency;
        private String out_fee_mode;
        private String out_fee_amount;
        private String in_fee_mode;
        private String in_fee_amount;
        private String auth_code;
        private String third_reserved;
        private String serial_no;
        private String assets_no;
        private String reserved;

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

        public String getAssets_no() {
            return assets_no;
        }

        public void setAssets_no(String assets_no) {
            this.assets_no = assets_no;
        }

        public String getReserved() {
            return reserved;
        }

        public void setReserved(String reserved) {
            this.reserved = reserved;
        }
    }
}
