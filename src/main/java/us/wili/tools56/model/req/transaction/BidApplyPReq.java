package us.wili.tools56.model.req.transaction;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
@ApiModel("投资人投标申请参数")
public class BidApplyPReq extends BaseReq {

    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    @ApiModelProperty(value = "申请流水号,32为位 必填", required = true)
    private String out_serial_no;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;
    @ApiModelProperty(value = "标的编号，有条件必填，为空时查询所有的产品；不为空时按输入的产品发行方查询，6", required = true)
    private String asset_no;
    @ApiModelProperty(value = "起息日YYYYMMDD,必填,(8)位数", required = true)
    private String interest_date;
    @ApiModelProperty(value = "付息方式 ,必填 1：等额本息；2：每月付息，到期还本；3：等额本金；4：等比累进；5：等额累进；6：组合还款；7：其他，1", required = true)
    private String interest_type;
    @ApiModelProperty(value = "利息每月支付日, 条件选填 ，DD ，付息方式为2时必填；，2", required = true)
    private String interest_day;
    @ApiModelProperty(value = "产品到期日，YYYYMMDD,必填,8", required = true)
    private String end_date;
    @ApiModelProperty(value = "预期年化收益率 ,必填,8", required = true)
    private String interest_rate;
    @ApiModelProperty(value = "是否冻结金额 ,必填，0：不冻结；1：冻结,1", required = true)
    private String frozen_flag;
    @ApiModelProperty(value = "是否使用红包 ,必填,0：不使用红包;1：使用红包,(1)位数", required = true)
    private String use_bonus;
    @ApiModelProperty(value = "抵扣红包金额 ,必填,两位小数,9位保留两位", required = true)
    private String bonus_amount;
    @ApiModelProperty(value = "手机号，必填，手机号，11(位数)")
    private String mobile;
    @ApiModelProperty(value = "交易时间 ,条件选填,(10)位数", required = true)
    private String transact_date;
    @ApiModelProperty(value = "成功跳转地址，必填", required = true)
    private String success_url;
    @ApiModelProperty(value = "失败跳转地址，256，必填", required = true)
    private String fail_url;
    @ApiModelProperty(value = "回调地址，必填", required = true)
    private String callback_url;
    @ApiModelProperty(value = "忘记密码跳转链接，256", required = true)
    private String forget_pwd_url;

    public BidApplyPReq() {
        super();
        this.service = "bid_apply_p";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("out_serial_no", getOut_serial_no());
        map.put("amount", getAmount());
        map.put("use_bonus", getUse_bonus());
        map.put("bonus_amount", getBonus_amount());
        map.put("asset_no", getAsset_no());
        map.put("interest_date", getInterest_date());
        map.put("interest_type", getInterest_type());
        map.put("interest_day", getInterest_day());
        map.put("end_date", getEnd_date());
        map.put("interest_rate", getInterest_rate());
        map.put("frozen_flag", getFrozen_flag());
        map.put("mobile", getMobile());

        map.put("success_url", getSuccess_url());
        map.put("fail_url", getFail_url());
        map.put("callback_url", getCallback_url());
        map.put("forget_pwd_url", getForget_pwd_url());
        return map;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    public String getInterest_date() {
        return interest_date;
    }

    public void setInterest_date(String interest_date) {
        this.interest_date = interest_date;
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

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }

    public String getFrozen_flag() {
        return frozen_flag;
    }

    public void setFrozen_flag(String frozen_flag) {
        this.frozen_flag = frozen_flag;
    }

    public String getUse_bonus() {
        return use_bonus;
    }

    public void setUse_bonus(String use_bonus) {
        this.use_bonus = use_bonus;
    }

    public String getBonus_amount() {
        return bonus_amount;
    }

    public void setBonus_amount(String bonus_amount) {
        this.bonus_amount = bonus_amount;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTransact_date() {
        return transact_date;
    }

    public void setTransact_date(String transact_date) {
        this.transact_date = transact_date;
    }

    public String getSuccess_url() {
        return success_url;
    }

    public void setSuccess_url(String success_url) {
        this.success_url = success_url;
    }

    public String getFail_url() {
        return fail_url;
    }

    public void setFail_url(String fail_url) {
        this.fail_url = fail_url;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public String getForget_pwd_url() {
        return forget_pwd_url;
    }

    public void setForget_pwd_url(String forget_pwd_url) {
        this.forget_pwd_url = forget_pwd_url;
    }
}
