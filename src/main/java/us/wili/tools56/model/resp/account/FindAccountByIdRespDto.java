package us.wili.tools56.model.resp.account;

import us.wili.dev.model.dto.resp.BaseRespDto;

import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class FindAccountByIdRespDto extends BaseRespDto{
    private String cert_type;
    private String cert_no;
    private String name;
    private String customer_no;
    private String count;
    private String page_flag;

    private List<Account> subpacks;

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
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

    public List<Account> getSubpacks() {
        return subpacks;
    }

    public void setSubpacks(List<Account> subpacks) {
        this.subpacks = subpacks;
    }

    class Account{
        private String user_no;
        private String account_state;
        private String prd_brief;
        private String card_no;
        private String product;
        private String frozen_state;
        private String created_at;
        private String forgot_pwd_state;

        public String getUser_no() {
            return user_no;
        }

        public void setUser_no(String user_no) {
            this.user_no = user_no;
        }

        public String getAccount_state() {
            return account_state;
        }

        public void setAccount_state(String account_state) {
            this.account_state = account_state;
        }

        public String getPrd_brief() {
            return prd_brief;
        }

        public void setPrd_brief(String prd_brief) {
            this.prd_brief = prd_brief;
        }

        public String getCard_no() {
            return card_no;
        }

        public void setCard_no(String card_no) {
            this.card_no = card_no;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getFrozen_state() {
            return frozen_state;
        }

        public void setFrozen_state(String frozen_state) {
            this.frozen_state = frozen_state;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getForgot_pwd_state() {
            return forgot_pwd_state;
        }

        public void setForgot_pwd_state(String forgot_pwd_state) {
            this.forgot_pwd_state = forgot_pwd_state;
        }
    }
}
