package us.wili.tools56.api;

import us.wili.tools56.model.req.query.BatchQueryBuyCreditBReq;
import us.wili.tools56.model.req.query.BatchQueryPaymentBReq;
import us.wili.tools56.model.req.query.BatchQueryRepaymentBReq;
import us.wili.tools56.model.resp.query.BatchQueryBuyCreditBResp;
import us.wili.tools56.model.resp.query.BatchQueryPaymentBResp;
import us.wili.tools56.model.resp.query.BatchQueryRepaymentBResp;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface QueryService {
    BatchQueryPaymentBResp batchQueryPaymentB(BatchQueryPaymentBReq req);

    BatchQueryRepaymentBResp batchQueryRepaymentB(BatchQueryRepaymentBReq req);

    BatchQueryBuyCreditBResp batchQueryBuyCreditB(BatchQueryBuyCreditBReq req);
}
