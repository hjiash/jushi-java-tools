package us.wili.tools56.model.req.query;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BatchQueryPaymentBReq extends BaseReq {

    @ApiModelProperty(value = "回调地址，必填,256", required = true)
    private String notify_url;
    @ApiModelProperty(value = "批次号，必填，6", required = true)
    private String batch_no;
    @ApiModelProperty(value = "总量 ,必填，数据总量，6", required = true)
    private String batch_count;
    @ApiModelProperty(value = "日期 ,必填，YYYYMMDD，需与文件名中的日期一致,8", required = true)
    private String batch_date;
    @ApiModelProperty(value = "业务类别 ,必填，001-放款 002-到期还款 003-平台逾期代偿/担保公司代偿,3", required = true)
    private String batch_type;
    private List<ItemsBean> items;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("notify_url", getNotify_url());
        map.put("batch_no", getBatch_no());
        map.put("batch_count", getBatch_count());
        map.put("batch_date", getBatch_date());
        map.put("batch_type", getBatch_type());
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

    public String getBatch_date() {
        return batch_date;
    }

    public void setBatch_date(String batch_date) {
        this.batch_date = batch_date;
    }

    public String getBatch_type() {
        return batch_type;
    }

    public void setBatch_type(String batch_type) {
        this.batch_type = batch_type;
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
        @ApiModelProperty(value = "承接方电子账号，19", required = true)
        private String in_card_no;
        @ApiModelProperty(value = "标的编号 ,必填，投标时使用的标的编号一致,40", required = true)
        private String assets_no;
        @ApiModelProperty(value = "交易流水号，32")
        private String serial_no;
        @ApiModelProperty(value = "投标申请授权码 ,必填,20", required = true)
        private String auth_code;
        @ApiModelProperty(value = "第三方流水号 ,必填，p2p平台上送，用于区分每笔交易，必填，40", required = true)
        private String third_reserved;

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
    }
}
