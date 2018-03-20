package us.wili.tools56.api;

<<<<<<< HEAD
import us.wili.tools56.model.req.query.*;
import us.wili.tools56.model.resp.query.*;
=======
import us.wili.tools56.model.req.query.BatchQueryBuyCreditBReq;
import us.wili.tools56.model.req.query.BatchQueryPaymentBReq;
import us.wili.tools56.model.req.query.BatchQueryRepaymentBReq;
import us.wili.tools56.model.resp.query.BatchQueryBuyCreditBResp;
import us.wili.tools56.model.resp.query.BatchQueryPaymentBResp;
import us.wili.tools56.model.resp.query.BatchQueryRepaymentBResp;
>>>>>>> a5f4fed... 调整model类名称，新增service接口

/**
 * Created by lhyue on 2018/3/20.
 */
public interface QueryService {
    BatchQueryPaymentBResp batchQueryPaymentB(BatchQueryPaymentBReq req);

    BatchQueryRepaymentBResp batchQueryRepaymentB(BatchQueryRepaymentBReq req);

    BatchQueryBuyCreditBResp batchQueryBuyCreditB(BatchQueryBuyCreditBReq req);
<<<<<<< HEAD

    ApplyBidQueryResp applyBidQuery(ApplyBidQueryReq req);

    BuyCreditQueryResp buyCreditQuery(BuyCreditQueryReq req);

    MoneyQueryResp moneyQuery(MoneyQueryReq req);

=======
>>>>>>> a5f4fed... 调整model类名称，新增service接口
}
