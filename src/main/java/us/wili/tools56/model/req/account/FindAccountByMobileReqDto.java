package us.wili.tools56.model.req.account;

import us.wili.dev.model.dto.req.BaseReqDto;

/**
 * Created by lhyue on 2018/3/17.
 */
public class FindAccountByMobileReqDto extends BaseReqDto {
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
