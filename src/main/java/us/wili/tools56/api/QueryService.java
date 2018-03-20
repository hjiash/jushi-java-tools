package us.wili.tools56.api;

import us.wili.tools56.model.req.query.*;
import us.wili.tools56.model.resp.query.*;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface QueryService {
    BatchQueryPaymentBResp batchQueryPaymentB(BatchQueryPaymentBReq req);

    BatchQueryRepaymentBResp batchQueryRepaymentB(BatchQueryRepaymentBReq req);

    BatchQueryBuyCreditBResp batchQueryBuyCreditB(BatchQueryBuyCreditBReq req);

    ApplyBidQueryResp applyBidQuery(ApplyBidQueryReq req);

    BuyCreditQueryResp buyCreditQuery(BuyCreditQueryReq req);

    MoneyQueryResp moneyQuery(MoneyQueryReq req);

}
