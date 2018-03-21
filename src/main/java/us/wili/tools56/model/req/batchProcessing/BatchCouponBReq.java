package us.wili.tools56.model.req.batchProcessing;

import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchCouponBReq extends BaseReq{

    private String notify_url;
    private String batch_no;
    private String batch_count;
    private List<ItemsBean> items;

    public BatchCouponBReq() {
        super();
        this.service = "batch_coupon_b";
    }


    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("notify_url", getNotify_url());
        map.put("batch_no", getBatch_count());
        map.put("batch_count", getBatch_count());
        map.put("items", getItems());
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

        private String in_card_no;
        private String currency;
        private String amount;
        private String coupon_date;
        private String coupon_type;
        private String name;
        private String third_reserved;

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

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getCoupon_date() {
            return coupon_date;
        }

        public void setCoupon_date(String coupon_date) {
            this.coupon_date = coupon_date;
        }

        public String getCoupon_type() {
            return coupon_type;
        }

        public void setCoupon_type(String coupon_type) {
            this.coupon_type = coupon_type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getThird_reserved() {
            return third_reserved;
        }

        public void setThird_reserved(String third_reserved) {
            this.third_reserved = third_reserved;
        }
    }
}
