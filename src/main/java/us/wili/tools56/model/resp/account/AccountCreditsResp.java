package us.wili.tools56.model.resp.account;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AccountCreditsResp extends BaseResp {
    @ApiModelProperty(value = "卡号，必填，电子账户，19",required = true)private String card_no;
    private String name;
    private String count;
    private String page_flag;

    private List<Subject> items;

    public static AccountCreditsResp fromJson(String content) {
        return JSONObject.parseObject(content, AccountCreditsResp.class);
    }


    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("service", getService());
        map.put("code", getCode());
        map.put("msg", getMsg());
        map.put("version", getVersion());
        map.put("sign_type", getSign_type());
        map.put("timestamp", getTimestamp());
        map.put("uuid", getUuid());
        map.put("custom", getCustom());
        map.put("client", getClient());
        map.put("sequence_id", getSequence_id());
        map.put("encode", getEncode());
        map.put("card_no", getCard_no());
        map.put("name", getName());
        map.put("count", getCount());
        map.put("page_flag", getPage_flag());
        map.put("items", getItems());
        return map;
    }


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
        @ApiModelProperty(value = "标的编号，有条件必填，为空时查询所有的产品；不为空时按输入的产品发行方查询，6",required = true)    private String asset_no;
        private String buy_date;
        @ApiModelProperty(value = "申请流水号,32为位 必填",required = true)    private String out_serial_no;
        @ApiModelProperty(value = "金额，必填，两位小数，13", required = true)    private String amount;
        @ApiModelProperty(value = "预期年化收益率 ,必填,8", required = true)    private String interest_rate;
        private String forcast_income;
        private String income_total;
        private String state;
        @ApiModelProperty(value = "抵扣红包金额 ,必填,两位小数,9位保留两位", required = true)    private String bonus_amount;

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
