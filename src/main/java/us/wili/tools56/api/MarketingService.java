package us.wili.tools56.api;

import us.wili.tools56.model.req.marketing.MoneyDispatchReq;
import us.wili.tools56.model.req.marketing.MoneyRevokeReq;
import us.wili.tools56.model.resp.marketing.MoneyDispatchResp;
import us.wili.tools56.model.resp.marketing.MoneyRevokeResp;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface MarketingService {
    MoneyDispatchResp moneyDispatch(MoneyDispatchReq req);

    MoneyRevokeResp moneyRevoke(MoneyRevokeReq req);
}
