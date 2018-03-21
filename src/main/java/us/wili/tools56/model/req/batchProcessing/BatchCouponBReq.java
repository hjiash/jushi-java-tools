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
public class BatchCouponBReq extends BaseReq {

    @ApiModelProperty(value = "回调地址，必填,256", required = true)
    private String notify_url;
    @ApiModelProperty(value = "批次号，必填，6", required = true)
    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，6", required = true)
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
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());

        List<Map<String, Object>> items = new ArrayList<>();
        for (BatchCouponBReq.ItemsBean itemsBean : getItems()) {
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

        @ApiModelProperty(value = "承接方电子账号，19", required = true)
        private String in_card_no;
        @ApiModelProperty(value = "币种 ，必填，156，3", required = true)
        private String currency;
        @ApiModelProperty(value = "入账金额，必填，13", required = true)
        private String amount;
        @ApiModelProperty(value = "日期，CCYYMMDD，必填，8", required = true)
        private String coupon_date;
        @ApiModelProperty(value = "业务类别，001-红包发放，必填，3", required = true)
        private String coupon_type;
        @ApiModelProperty(value = "持卡人姓名，转入方姓名必须与持卡人姓名一致，必填，60", required = true)
        private String name;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，必填，40", required = true)
        private String third_reserved;

        public Map<String, Object> toMap() {
            Map<String, Object> childMap = new HashMap<>();
            childMap.put("in_card_no", getIn_card_no());
            childMap.put("currency", getCurrency());
            childMap.put("amount", getAmount());
            childMap.put("coupon_date", getCoupon_date());
            childMap.put("coupon_type", getCoupon_type());
            childMap.put("name", getName());
            childMap.put("third_reserved", getThird_reserved());
            return childMap;
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
