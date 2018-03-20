package us.wili.tools56.model.resp.query;

import us.wili.dev.model.dto.resp.BaseRespDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BuyCreditQueryRespDto extends BaseRespDto {

    private String in_card_no;
    private String reserved;
    private String transfer_balance;
    private String out_card_no;
    private String in_name;
    private String auth_code;
    private String amount;
    private String income;
    private String out_name;
    private String transfer_price;
    private String fee;

    public String getIn_card_no() {
        return in_card_no;
    }

    public void setIn_card_no(String in_card_no) {
        this.in_card_no = in_card_no;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public String getTransfer_balance() {
        return transfer_balance;
    }

    public void setTransfer_balance(String transfer_balance) {
        this.transfer_balance = transfer_balance;
    }

    public String getOut_card_no() {
        return out_card_no;
    }

    public void setOut_card_no(String out_card_no) {
        this.out_card_no = out_card_no;
    }

    public String getIn_name() {
        return in_name;
    }

    public void setIn_name(String in_name) {
        this.in_name = in_name;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getOut_name() {
        return out_name;
    }

    public void setOut_name(String out_name) {
        this.out_name = out_name;
    }

    public String getTransfer_price() {
        return transfer_price;
    }

    public void setTransfer_price(String transfer_price) {
        this.transfer_price = transfer_price;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}
