package us.wili.tools56.model.resp.account;

import us.wili.dev.model.dto.resp.BaseRespDto;

import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountTransactionQueryRespDto extends BaseRespDto {
    private String total_result;
    private String current_result;
    private String out_num;
    private String end_flag;

    private List<WaterAccount> items;

    public String getTotal_result() {
        return total_result;
    }

    public void setTotal_result(String total_result) {
        this.total_result = total_result;
    }

    public String getCurrent_result() {
        return current_result;
    }

    public void setCurrent_result(String current_result) {
        this.current_result = current_result;
    }

    public String getOut_num() {
        return out_num;
    }

    public void setOut_num(String out_num) {
        this.out_num = out_num;
    }

    public String getEnd_flag() {
        return end_flag;
    }

    public void setEnd_flag(String end_flag) {
        this.end_flag = end_flag;
    }

    public List<WaterAccount> getItems() {
        return items;
    }

    public void setItems(List<WaterAccount> items) {
        this.items = items;
    }

    class WaterAccount{
        private String transact_date;
        private String transact_time;
        private String transact_type;
        private String accounting_date;
        private String description;
        private String record_flag;
        private String remark;
        private String card_no;
        private String sign;
        private String transact_amount;
        private String account_balance;
        private String interest_date;
        private String opponent_card_no;

        public String getTransact_date() {
            return transact_date;
        }

        public void setTransact_date(String transact_date) {
            this.transact_date = transact_date;
        }

        public String getTransact_time() {
            return transact_time;
        }

        public void setTransact_time(String transact_time) {
            this.transact_time = transact_time;
        }

        public String getTransact_type() {
            return transact_type;
        }

        public void setTransact_type(String transact_type) {
            this.transact_type = transact_type;
        }

        public String getAccounting_date() {
            return accounting_date;
        }

        public void setAccounting_date(String accounting_date) {
            this.accounting_date = accounting_date;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getRecord_flag() {
            return record_flag;
        }

        public void setRecord_flag(String record_flag) {
            this.record_flag = record_flag;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getCard_no() {
            return card_no;
        }

        public void setCard_no(String card_no) {
            this.card_no = card_no;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getTransact_amount() {
            return transact_amount;
        }

        public void setTransact_amount(String transact_amount) {
            this.transact_amount = transact_amount;
        }

        public String getAccount_balance() {
            return account_balance;
        }

        public void setAccount_balance(String account_balance) {
            this.account_balance = account_balance;
        }

        public String getInterest_date() {
            return interest_date;
        }

        public void setInterest_date(String interest_date) {
            this.interest_date = interest_date;
        }

        public String getOpponent_card_no() {
            return opponent_card_no;
        }

        public void setOpponent_card_no(String opponent_card_no) {
            this.opponent_card_no = opponent_card_no;
        }
    }
}
