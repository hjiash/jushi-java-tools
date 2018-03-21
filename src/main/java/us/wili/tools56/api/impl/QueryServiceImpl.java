package us.wili.tools56.api.impl;

import us.wili.tools56.api.JushiService;
import us.wili.tools56.api.QueryService;
import us.wili.tools56.model.req.query.*;
import us.wili.tools56.model.resp.query.*;

/**
 * Created by lhyue on 2018/3/21.
 */
public class QueryServiceImpl implements QueryService {

    private JushiService jushiService;

    public QueryServiceImpl(JushiService jushiService) {
        this.jushiService = jushiService;
    }

    @Override
    public BatchQueryPaymentBResp batchQueryPaymentB(BatchQueryPaymentBReq req) {
        return jushiService.post(req, BatchQueryPaymentBResp.class);
    }

    @Override
    public BatchQueryRepaymentBResp batchQueryRepaymentB(BatchQueryRepaymentBReq req) {
        return jushiService.post(req, BatchQueryRepaymentBResp.class);
    }

    @Override
    public BatchQueryBuyCreditBResp batchQueryBuyCreditB(BatchQueryBuyCreditBReq req) {
        return jushiService.post(req, BatchQueryBuyCreditBResp.class);
    }

    @Override
    public ApplyBidQueryResp applyBidQuery(ApplyBidQueryReq req) {
        return jushiService.post(req, ApplyBidQueryResp.class);
    }

    @Override
    public BuyCreditQueryResp buyCreditQuery(BuyCreditQueryReq req) {
        return jushiService.post(req, BuyCreditQueryResp.class);
    }

    @Override
    public MoneyQueryResp moneyQuery(MoneyQueryReq req) {
        return jushiService.post(req, MoneyQueryResp.class);
    }
}
