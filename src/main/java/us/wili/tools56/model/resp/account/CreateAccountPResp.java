package us.wili.tools56.model.resp.account;

import com.alibaba.fastjson.JSONObject;
import us.wili.tools56.model.resp.BaseResp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhyue on 2018/3/17.
 */
public class CreateAccountPResp extends BaseResp {
    private String out_serial_no;
    private String order_id;
    private String url;

    public static CreateAccountPResp fromJson(String content) {
        return JSONObject.parseObject(content, CreateAccountPResp.class);
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();

        map.put("out_serial_no", getOut_serial_no());
        map.put("order_id", getOrder_id());
        map.put("url", getUrl());

        return map;
    }


    public String getOut_serial_no() {
        return out_serial_no;
    }

    public void setOut_serial_no(String out_serial_no) {
        this.out_serial_no = out_serial_no;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
