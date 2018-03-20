package us.wili.tools56.model.resp.account;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
<<<<<<< HEAD:src/main/java/us/wili/tools56/model/resp/account/FindAccountByMobileResp.java
public class FindAccountByMobileResp extends BaseResp{
    @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")    private String mobile;
    @ApiModelProperty(value = "客户号，11(位数)",required = true)    private String customer_no;
=======
public class FindAccountByMobileResp {
    private String mobile;
    private String customer_no;
>>>>>>> a5f4fed... 调整model类名称，新增service接口:src/main/java/us/wili/tools56/model/resp/account/FindAccountByMobileResp.java

    List<Account> subpacks;

    public static FindAccountByMobileResp fromJson(String content) {
        return JSONObject.parseObject(content, FindAccountByMobileResp.class);
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
        map.put("mobile", getMobile());
        map.put("customer_no", getCustomer_no());
        map.put("subpacks", getSubpacks());
        return map;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public List<Account> getSubpacks() {
        return subpacks;
    }

    public void setSubpacks(List<Account> subpacks) {
        this.subpacks = subpacks;
    }

    class Account{
        private String issue_date;
        private String name;
        @ApiModelProperty(value = "卡号，必填，电子账户，19",required = true)private String card_no;
        @ApiModelProperty(value = "证件号码，必填,19(位数)", required = true)    private String cert_no;
        private String product;
        @ApiModelProperty(value = "证件类型，必填，15:身份证18位，2(位数)", required = true)    private String cert_type;

        public String getIssue_date() {
            return issue_date;
        }

        public void setIssue_date(String issue_date) {
            this.issue_date = issue_date;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCard_no() {
            return card_no;
        }

        public void setCard_no(String card_no) {
            this.card_no = card_no;
        }

        public String getCert_no() {
            return cert_no;
        }

        public void setCert_no(String cert_no) {
            this.cert_no = cert_no;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getCert_type() {
            return cert_type;
        }

        public void setCert_type(String cert_type) {
            this.cert_type = cert_type;
        }
    }
}
