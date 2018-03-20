package us.wili.tools56.model.resp.assets;

import us.wili.dev.model.dto.resp.BaseRespDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AssetsEnrollRespDto extends BaseRespDto{
    private String asset_no;
    private String asset_brief;
    private String card_no;
    private String name;
    private String amount;
    private String loan_term;
    private String issue_date;
    private String state;
    private String warrant_card_no;
    private String warrant_name;
    private String borrow_card_no;
    private String debtor_card_no;
    private String third_custom;

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
