package us.wili.tools56.model.resp.account;

import java.util.List;

/**
 * Created by lhyue on 2018/3/17.
 */
public class FindAccountByMobileResp {
    private String mobile;
    private String customer_no;

    List<Account> subpacks;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public List<Account> getSubpacks() {
        return subpacks;
    }

    public void setSubpacks(List<Account> subpacks) {
        this.subpacks = subpacks;
    }

    class Account{
        private String issue_date;
        private String name;
        private String card_no;
        private String cert_no;
        private String product;
        private String cert_type;

        public String getIssue_date() {
            return issue_date;
        }

        public void setIssue_date(String issue_date) {
            this.issue_date = issue_date;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCard_no() {
            return card_no;
        }

        public void setCard_no(String card_no) {
            this.card_no = card_no;
        }

        public String getCert_no() {
            return cert_no;
        }

        public void setCert_no(String cert_no) {
            this.cert_no = cert_no;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getCert_type() {
            return cert_type;
        }

        public void setCert_type(String cert_type) {
            this.cert_type = cert_type;
        }
    }
}
