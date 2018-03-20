package us.wili.tools56.model.resp.account;

<<<<<<< HEAD:src/main/java/us/wili/tools56/model/resp/account/BindingListResp.java
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
=======
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/resp/account/BindingListResp.java
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BindingListResp extends BaseResp {
<<<<<<< HEAD:src/main/java/us/wili/tools56/model/resp/account/BindingListResp.java
    @ApiModelProperty(value = "卡号，必填，电子账户，19",required = true)private String card_no;
=======
    private String card_no;
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/resp/account/BindingListResp.java
    private String name;

    public static BindingListResp fromJson(String content) {
        return JSONObject.parseObject(content, BindingListResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("version", getVersion());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("custom", getCustom());
        map.put("client", getClient());
        map.put("encode", getEncode());
        map.put("sequence_id", getSequence_id());
        map.put("card_no", getCard_no());
        map.put("name", getName());
        return map;
    }

    private List<BankCard> subpacks;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public List<BankCard> getSubpacks() {
        return subpacks;
    }

    public void setSubpacks(List<BankCard> subpacks) {
        this.subpacks = subpacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class BankCard {
        @ApiModelProperty(value = "绑定卡号，必填，19(位数)", required = true)    private String bank_card_no;
        @ApiModelProperty(value = "主副卡类型 ,0,位主卡", required = true)    private String card_type;
        private String sign_date;
        private String sign_time;
        @ApiModelProperty(value = "交易流水号，32")    private String serial_no;
        @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")    private String mobile;
        private String state;
        private String revoke_sign_date;
        private String revoke_sign_time;

        public String getBank_card_no() {
            return bank_card_no;
        }

        public void setBank_card_no(String bank_card_no) {
            this.bank_card_no = bank_card_no;
        }

        public String getCard_type() {
            return card_type;
        }

        public void setCard_type(String card_type) {
            this.card_type = card_type;
        }

        public String getSign_date() {
            return sign_date;
        }

        public void setSign_date(String sign_date) {
            this.sign_date = sign_date;
        }

        public String getSign_time() {
            return sign_time;
        }

        public void setSign_time(String sign_time) {
            this.sign_time = sign_time;
        }

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getRevoke_sign_date() {
            return revoke_sign_date;
        }

        public void setRevoke_sign_date(String revoke_sign_date) {
            this.revoke_sign_date = revoke_sign_date;
        }

        public String getRevoke_sign_time() {
            return revoke_sign_time;
        }

        public void setRevoke_sign_time(String revoke_sign_time) {
            this.revoke_sign_time = revoke_sign_time;
        }
    }
}
