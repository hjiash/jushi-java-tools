package us.wili.tools56.model.resp.account;

import us.wili.dev.model.dto.resp.BaseRespDto;

import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class BindingListRespDto extends BaseRespDto {
    private String card_no;
    private String name;

    private List<BankCard> subpacks;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public List<BankCard> getSubpacks() {
        return subpacks;
    }

    public void setSubpacks(List<BankCard> subpacks) {
        this.subpacks = subpacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class BankCard {
        private String bank_card_no;
        private String card_type;
        private String sign_date;
        private String sign_time;
        private String serial_no;
        private String mobile;
        private String state;
        private String revoke_sign_date;
        private String revoke_sign_time;

        public String getBank_card_no() {
            return bank_card_no;
        }

        public void setBank_card_no(String bank_card_no) {
            this.bank_card_no = bank_card_no;
        }

        public String getCard_type() {
            return card_type;
        }

        public void setCard_type(String card_type) {
            this.card_type = card_type;
        }

        public String getSign_date() {
            return sign_date;
        }

        public void setSign_date(String sign_date) {
            this.sign_date = sign_date;
        }

        public String getSign_time() {
            return sign_time;
        }

        public void setSign_time(String sign_time) {
            this.sign_time = sign_time;
        }

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getRevoke_sign_date() {
            return revoke_sign_date;
        }

        public void setRevoke_sign_date(String revoke_sign_date) {
            this.revoke_sign_date = revoke_sign_date;
        }

        public String getRevoke_sign_time() {
            return revoke_sign_time;
        }

        public void setRevoke_sign_time(String revoke_sign_time) {
            this.revoke_sign_time = revoke_sign_time;
        }
    }
}
