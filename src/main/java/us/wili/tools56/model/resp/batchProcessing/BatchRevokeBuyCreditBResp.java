package us.wili.tools56.model.resp.batchProcessing;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchRevokeBuyCreditBResp extends BaseResp {

    @ApiModelProperty(value = "批次号，必填，6", required = true)
    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，6", required = true)
    private String batch_count;
    @ApiModelProperty(value = "日期 ,必填，YYYYMMDD，需与文件名中的日期一致,8", required = true)
    private String batch_date;
    private List<ItemsBean> items;

    public static BatchRevokeBuyCreditBResp fromJson(String content) {
        return JSONObject.parseObject(content, BatchRevokeBuyCreditBResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());
        map.put("batch_date", getBatch_date());

        if (this.items != null) {
            List<Map<String, Object>> items = new ArrayList<>();
            for (BatchRevokeBuyCreditBResp.ItemsBean itemsBean : getItems()) {
                Map<String, Object> childMap = itemsBean.toMap();
                items.add(childMap);
            }
            map.put("items", items);
        }

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

        @ApiModelProperty(value = "承接方电子账号，19", required = true)
        private String in_card_no;
        @ApiModelProperty(value = "转让方电子账号，19", required = true)
        private String out_card_no;
        @ApiModelProperty(value = "交易流水号，32")
        private String serial_no;
        private String result;
        private String message;
        @ApiModelProperty(value = "保留域，条件选填,60", required = true)
        private String reserved;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，必填，40", required = true)
        private String third_reserved;

        public Map<String, Object> toMap() {
            Map<String, Object> map = new HashMap<String, Object>();
            if (getResult() != null) map.put("result", getResult());
            if (getMessage() != null) map.put("message", getMessage());
            if (getIn_card_no() != null) map.put("in_card_no", getIn_card_no());
            if (getOut_card_no() != null) map.put("out_card_no", getOut_card_no());
            if (getSerial_no() != null) map.put("serial_no", getSerial_no());
            if (getReserved() != null) map.put("reserved", getReserved());
            if (getThird_reserved() != null) map.put("third_reserved", getThird_reserved());
            return map;
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

        public String getThird_reserved() {
            return third_reserved;
        }

        public void setThird_reserved(String third_reserved) {
            this.third_reserved = third_reserved;
        }
    }
}
