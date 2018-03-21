package us.wili.tools56.model.req.bankroll;

import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.req.BaseReq;

import java.util.Map;

/**
 * Created by lhyue on 2018/3/20.
 */
public class BankRechargeReq extends BaseReq {
    @ApiModelProperty(value = "卡号，必填，电子账户，19", required = true)
    private String card_no;
    private String bank_type;
    @ApiModelProperty(value = "回调地址，必填", required = true)
    private String callback_url;
    @ApiModelProperty(value = "客户号，11(位数)", required = true)
    private String customer_no;
    @ApiModelProperty(value = "支付成功跳转url，必填", required = true)
    private String redirect_url;
    @ApiModelProperty(value = "产品名称，条件选填")
    private String product_name;
    @ApiModelProperty(value = "产品详情，条件选填")
    private String product_detail;
    @ApiModelProperty(value = "订单号，必填", required = true)
    private String order_no;
    @ApiModelProperty(value = "银行名称，必填", required = true)
    private String bank_name;
    @ApiModelProperty(value = "银行编码，必填，例如：BOC 中国银行 10(位数)", required = true)
    private String bank_id_no;
    @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)
    private String amount;

    public BankRechargeReq() {
        super();
        this.service = "bank_recharge";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("card_no", getCard_no());
        map.put("bank_type", getBank_type());
        map.put("callback_url", getCallback_url());
        map.put("customer_no", getCustomer_no());
        map.put("redirect_url", getRedirect_url());
        map.put("product_name", getProduct_name());
        map.put("product_detail", getProduct_detail());
        map.put("order_no", getOrder_no());
        map.put("bank_name", getBank_name());
        map.put("bank_id_no", getBank_id_no());
        map.put("amount", getAmount());
        return map;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_detail() {
        return product_detail;
    }

    public void setProduct_detail(String product_detail) {
        this.product_detail = product_detail;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_id_no() {
        return bank_id_no;
    }

    public void setBank_id_no(String bank_id_no) {
        this.bank_id_no = bank_id_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
