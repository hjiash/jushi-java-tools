package us.wili.tools56.model.req.bankroll;

import us.wili.dev.model.dto.req.BaseReqDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class NoSecretPresentationReqDto extends BaseReqDto {
    private String order_no;
    private String card_no;
    private String bank_name;
    private String card_bind;
    private String name;
    private String cert_no;
    private String cert_type;
    private String phone;
    private String amount;
    private String fee;
    private String background_url;
    private String channel_flag;
    private String channel_code;
    private String union_bank_code;
    private String open_bank_code;
    private String bank_name_en;
    private String bank_name_cn;
    private String bank_province;
    private String bank_city;

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getCard_bind() {
        return card_bind;
    }

    public void setCard_bind(String card_bind) {
        this.card_bind = card_bind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getBackground_url() {
        return background_url;
    }

    public void setBackground_url(String background_url) {
        this.background_url = background_url;
    }

    public String getChannel_flag() {
        return channel_flag;
    }

    public void setChannel_flag(String channel_flag) {
        this.channel_flag = channel_flag;
    }

    public String getChannel_code() {
        return channel_code;
    }

    public void setChannel_code(String channel_code) {
        this.channel_code = channel_code;
    }

    public String getUnion_bank_code() {
        return union_bank_code;
    }

    public void setUnion_bank_code(String union_bank_code) {
        this.union_bank_code = union_bank_code;
    }

    public String getOpen_bank_code() {
        return open_bank_code;
    }

    public void setOpen_bank_code(String open_bank_code) {
        this.open_bank_code = open_bank_code;
    }

    public String getBank_name_en() {
        return bank_name_en;
    }

    public void setBank_name_en(String bank_name_en) {
        this.bank_name_en = bank_name_en;
    }

    public String getBank_name_cn() {
        return bank_name_cn;
    }

    public void setBank_name_cn(String bank_name_cn) {
        this.bank_name_cn = bank_name_cn;
    }

    public String getBank_province() {
        return bank_province;
    }

    public void setBank_province(String bank_province) {
        this.bank_province = bank_province;
    }

    public String getBank_city() {
        return bank_city;
    }

    public void setBank_city(String bank_city) {
        this.bank_city = bank_city;
    }
}
