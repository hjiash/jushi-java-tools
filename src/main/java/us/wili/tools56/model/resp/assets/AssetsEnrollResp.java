package us.wili.tools56.model.resp.assets;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AssetsEnrollResp extends BaseResp {
    @ApiModelProperty(value = "标的编号，有条件必填，为空时查询所有的产品；不为空时按输入的产品发行方查询，6", required = true)
    private String asset_no;
    private String asset_brief;
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    private String name;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;
    @ApiModelProperty(value = "项目期限，必填，单位为天，4", required = true)
    private String loan_term;
    private String issue_date;
    private String state;
    @ApiModelProperty(value = "担保人电子账号，条件选填，19", required = true)
    private String warrant_card_no;
    private String warrant_name;
    @ApiModelProperty(value = "名义借款人电子账户，条件选填，名义借款人电子账号，19", required = true)
    private String borrow_card_no;
    @ApiModelProperty(value = "收款人电子账户，条件选填，多种借款人模式下必送，19", required = true)
    private String debtor_card_no;
    @ApiModelProperty(value = "第三方保留域，第三方机构使用，原样返回，100(位数)")
    private String third_custom;

    public static AssetsEnrollResp fromJson(String content) {
        return JSONObject.parseObject(content, AssetsEnrollResp.class);
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
        map.put("asset_no", getAsset_no());
        map.put("asset_brief", getAsset_brief());
        map.put("name", getName());
        map.put("amount", getAmount());
        map.put("loan_term", getLoan_term());
        map.put("issue_date", getIssue_date());
        map.put("state", getState());
        map.put("warrant_card_no", getWarrant_card_no());
        map.put("warrant_name", getWarrant_name());
        map.put("borrow_card_no", getBorrow_card_no());
        map.put("debtor_card_no", getDebtor_card_no());
        map.put("third_custom", getThird_custom());
        return map;
    }

    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    public String getAsset_brief() {
        return asset_brief;
    }

    public void setAsset_brief(String asset_brief) {
        this.asset_brief = asset_brief;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getLoan_term() {
        return loan_term;
    }

    public void setLoan_term(String loan_term) {
        this.loan_term = loan_term;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWarrant_card_no() {
        return warrant_card_no;
    }

    public void setWarrant_card_no(String warrant_card_no) {
        this.warrant_card_no = warrant_card_no;
    }

    public String getWarrant_name() {
        return warrant_name;
    }

    public void setWarrant_name(String warrant_name) {
        this.warrant_name = warrant_name;
    }

    public String getBorrow_card_no() {
        return borrow_card_no;
    }

    public void setBorrow_card_no(String borrow_card_no) {
        this.borrow_card_no = borrow_card_no;
    }

    public String getDebtor_card_no() {
        return debtor_card_no;
    }

    public void setDebtor_card_no(String debtor_card_no) {
        this.debtor_card_no = debtor_card_no;
    }

    public String getThird_custom() {
        return third_custom;
    }

    public void setThird_custom(String third_custom) {
        this.third_custom = third_custom;
    }
}
