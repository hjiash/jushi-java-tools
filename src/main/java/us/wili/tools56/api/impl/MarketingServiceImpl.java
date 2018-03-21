package us.wili.tools56.api.impl;

import us.wili.tools56.api.JushiService;
import us.wili.tools56.api.MarketingService;
import us.wili.tools56.model.req.marketing.MoneyDispatchReq;
import us.wili.tools56.model.req.marketing.MoneyRevokeReq;
import us.wili.tools56.model.resp.marketing.MoneyDispatchResp;
import us.wili.tools56.model.resp.marketing.MoneyRevokeResp;

/**
 * Created by lhyue on 2018/3/21.
 */
public class MarketingServiceImpl implements MarketingService {

    private JushiService jushiService;

    public MarketingServiceImpl(JushiService jushiService) {
        this.jushiService = jushiService;
    }

    @Override
    public MoneyDispatchResp moneyDispatch(MoneyDispatchReq req) {
        return jushiService.postUseApi(req, MoneyDispatchResp.class);
    }

    @Override
    public MoneyRevokeResp moneyRevoke(MoneyRevokeReq req) {
        return jushiService.postUseApi(req, MoneyRevokeResp.class);
    }
}
