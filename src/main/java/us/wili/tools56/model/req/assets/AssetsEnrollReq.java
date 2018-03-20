package us.wili.tools56.model.req.assets;

import io.swagger.annotations.ApiModel;
import org.hibernate.validator.constraints.Length;
import us.wili.tools56.model.req.BaseReq;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
@ApiModel("标的信息")
public class AssetsEnrollReq extends BaseReq {
    private String asset_no;
    private String asset_brief;
    private String card_no;
    private String amount;
    private String interest_type;
    private String interest_day;
    private String loan_term;
    private String interest_rate;
    private String warrant_card_no;
    private String borrow_card_no;
    private String debtor_card_no;
    private String trustee_pay_flag;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("sign_type", getSign_type());
        map.put("encode", getEncode());
        map.put("version", getVersion());
        map.put("custom", getCustom());
        map.put("client", getClient());
        map.put("card_no", getCard_no());
        map.put("asset_no", getAsset_no());
        map.put("asset_brief", getAsset_brief());
        map.put("card_no", getCard_no());
        map.put("amount", getAmount());
        map.put("interest_type", getInterest_type());
        map.put("interest_day", getInterest_day());
        map.put("loan_term", getLoan_term());
        map.put("interest_rate", getInterest_rate());
        map.put("warrant_card_no", getWarrant_card_no());
        map.put("borrow_card_no", getBorrow_card_no());
        map.put("debtor_card_no", getDebtor_card_no());
        map.put("trustee_pay_flag", getTrustee_pay_flag());
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getInterest_type() {
        return interest_type;
    }

    public void setInterest_type(String interest_type) {
        this.interest_type = interest_type;
    }

    public String getInterest_day() {
        return interest_day;
    }

    public void setInterest_day(String interest_day) {
        this.interest_day = interest_day;
    }

    public String getLoan_term() {
        return loan_term;
    }

    public void setLoan_term(String loan_term) {
        this.loan_term = loan_term;
    }

    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }

    public String getWarrant_card_no() {
        return warrant_card_no;
    }

    public void setWarrant_card_no(String warrant_card_no) {
        this.warrant_card_no = warrant_card_no;
    }

    public String getBorrow_card_no() {
        return borrow_card_no;
    }

    public void setBorrow_card_no(String borrow_card_no) {
        this.borrow_card_no = borrow_card_no;
    }

    @Length(min = 19, max = 19, message = "收款人电子账户必须等于19个字符")
    public String getDebtor_card_no() {
        return debtor_card_no;
    }

    public void setDebtor_card_no(String debtor_card_no) {
        this.debtor_card_no = debtor_card_no;
    }

    public String getTrustee_pay_flag() {
        return trustee_pay_flag;
    }

    public void setTrustee_pay_flag(String trustee_pay_flag) {
        this.trustee_pay_flag = trustee_pay_flag;
    }

}

