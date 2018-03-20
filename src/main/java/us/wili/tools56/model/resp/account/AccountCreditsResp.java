package us.wili.tools56.model.resp.account;

import us.wili.tools56.model.resp.BaseResp;

import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountCreditsResp extends BaseResp {
    private String card_no;
    private String name;
    private String count;
    private String page_flag;

    private List<Subject> items;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public List<Subject> getItems() {
        return items;
    }

    public void setItems(List<Subject> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPage_flag() {
        return page_flag;
    }

    public void setPage_flag(String page_flag) {
        this.page_flag = page_flag;
    }

    class Subject{
        private String asset_no;
        private String buy_date;
        private String out_serial_no;
        private String amount;
        private String interest_rate;
        private String forcast_income;
        private String income_total;
        private String state;
        private String bonus_amount;

        public String getAsset_no() {
            return asset_no;
        }

        public void setAsset_no(String asset_no) {
            this.asset_no = asset_no;
        }

        public String getBuy_date() {
            return buy_date;
        }

        public void setBuy_date(String buy_date) {
            this.buy_date = buy_date;
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

        public String getInterest_rate() {
            return interest_rate;
        }

        public void setInterest_rate(String interest_rate) {
            this.interest_rate = interest_rate;
        }

        public String getForcast_income() {
            return forcast_income;
        }

        public void setForcast_income(String forcast_income) {
            this.forcast_income = forcast_income;
        }

        public String getIncome_total() {
            return income_total;
        }

        public void setIncome_total(String income_total) {
            this.income_total = income_total;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getBonus_amount() {
            return bonus_amount;
        }

        public void setBonus_amount(String bonus_amount) {
            this.bonus_amount = bonus_amount;
        }
    }
}
