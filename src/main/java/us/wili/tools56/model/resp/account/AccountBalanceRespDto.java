package us.wili.tools56.model.resp.account;

import us.wili.dev.model.dto.resp.BaseRespDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountBalanceRespDto extends BaseRespDto {
    private String card_no;
    private String name;
    private String balance;
    private String freBl;
    private String third_custom;

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

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getFreBl() {
        return freBl;
    }

    public void setFreBl(String freBl) {
        this.freBl = freBl;
    }

    public String getThird_custom() {
        return third_custom;
    }

    public void setThird_custom(String third_custom) {
        this.third_custom = third_custom;
    }
}
