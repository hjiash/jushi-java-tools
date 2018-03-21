package us.wili.tools56.model.req.transaction;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import us.wili.tools56.model.req.BaseReq;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class AutoBidApplyReq extends BaseReq {
    private String card_no;
    private String out_serial_no;
    private String amount;
    private String use_bonus;
    private String bonus_amount;
    private String auth_code;
    private String asset_no;
    private String interest_date;
    private String interest_type;
    private String interest_day;
    private String end_date;
    private String interest_rate;
    private String frozen_flag;

    public AutoBidApplyReq(){
        super();
        this.service = "auto_bid_apply";
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map =super.toMap();

        map.put("card_no", getCard_no());
        map.put("out_serial_no", getOut_serial_no());
        map.put("amount", getAmount());
        map.put("use_bonus", getUse_bonus());
        map.put("bonus_amount", getBonus_amount());
        map.put("auth_code", getAuth_code());
        map.put("asset_no", getAsset_no());
        map.put("interest_date", getInterest_date());
        map.put("interest_type", getInterest_type());
        map.put("interest_day", getInterest_day());
        map.put("end_date", getEnd_date());
        map.put("interest_rate", getInterest_rate());
        map.put("frozen_flag", getFrozen_flag());
        return map;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
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

    public String getUse_bonus() {
        return use_bonus;
    }

    public void setUse_bonus(String use_bonus) {
        this.use_bonus = use_bonus;
    }

    public String getBonus_amount() {
        return bonus_amount;
    }

    public void setBonus_amount(String bonus_amount) {
        this.bonus_amount = bonus_amount;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    public String getInterest_date() {
        return interest_date;
    }

    public void setInterest_date(String interest_date) {
        this.interest_date = interest_date;
    }

    public String getInterest_type() {
        return interest_type;
    }

    public void setInterest_type(String interest_type) {
        this.interest_type = interest_type;
    }

    public String getInterest_day() {
        return interest_day;
    }

    public void setInterest_day(String interest_day) {
        this.interest_day = interest_day;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }

    public String getFrozen_flag() {
        return frozen_flag;
    }

    public void setFrozen_flag(String frozen_flag) {
        this.frozen_flag = frozen_flag;
    }
}
