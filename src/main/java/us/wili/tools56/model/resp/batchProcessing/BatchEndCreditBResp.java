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
public class BatchEndCreditBResp extends BaseResp {
    @ApiModelProperty(value = "批次号，6", required = true)
    private String batch_no;
    @ApiModelProperty(value = "总量，数据总量，6", required = true)
    private String batch_count;
    @ApiModelProperty(value = "业务类别，001-放款 002-到期还款 003-平台逾期代偿/担保公司代偿,3", required = true)
    private String batch_type;
    @ApiModelProperty(value = "日期，YYYYMMDD，需与文件名中的日期一致,8", required = true)
    private String batch_date;
    private List<ItemsBean> items;

    public static BatchEndCreditBResp fromJson(String content) {
        return JSONObject.parseObject(content, BatchEndCreditBResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());
        map.put("batch_type", getBatch_type());
        map.put("batch_date", getBatch_date());

        List<Map<String, Object>> items = new ArrayList<>();
        for (BatchEndCreditBResp.ItemsBean itemsBean : getItems()) {
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
        private String result;
        private String message;
        @ApiModelProperty(value = "转让方电子账号，19")
        private String out_card_no;
        @ApiModelProperty(value = "承接方电子账号，19")
        private String in_card_no;
        @ApiModelProperty(value = "标的编号，投标时使用的标的编号一致,40")
        private String assets_no;
        @ApiModelProperty(value = "交易流水号，32")
        private String serial_no;
        @ApiModelProperty(value = "第三方流水号，p2p平台上送，用于区分每笔交易，必填，40")
        private String third_reserved;
        @ApiModelProperty(value = "授权码")
        private String auth_code;


        public Map<String, Object> toMap() {
            Map<String, Object> map = new HashMap<String, Object>();

            if (this.getResult() != null) map.put("result", getResult());
            if (this.getMessage() != null) map.put("message", getMessage());
            if (this.getOut_card_no() != null) map.put("out_card_no", getOut_card_no());
            if (this.getIn_card_no() != null) map.put("in_card_no", getIn_card_no());
            if (this.getAssets_no() != null) map.put("assets_no", getAssets_no());
            if (this.getSerial_no() != null) map.put("serial_no", getSerial_no());
            if (this.getThird_reserved() != null) map.put("third_reserved", getThird_reserved());
            if (this.getAuth_code() != null) map.put("auth_code", getAuth_code());

            return map;
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

        public String getOut_card_no() {
            return out_card_no;
        }

        public void setOut_card_no(String out_card_no) {
            this.out_card_no = out_card_no;
        }

        public String getIn_card_no() {
            return in_card_no;
        }

        public void setIn_card_no(String in_card_no) {
            this.in_card_no = in_card_no;
        }

        public String getAssets_no() {
            return assets_no;
        }

        public void setAssets_no(String assets_no) {
            this.assets_no = assets_no;
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

        public String getAuth_code() {
            return auth_code;
        }

        public void setAuth_code(String auth_code) {
            this.auth_code = auth_code;
        }
    }
}
