package us.wili.tools56.api;

import us.wili.tools56.model.resp.batchProcessing.BatchBuyCreditBAsyncResp;
import us.wili.tools56.model.resp.batchProcessing.BatchCouponBAsyncResp;
import us.wili.tools56.model.resp.batchProcessing.BatchPaymentBAsyncResp;
import us.wili.tools56.model.resp.batchProcessing.BatchRepaymentBAsyncResp;
import us.wili.tools56.model.req.batchProcessing.*;
import us.wili.tools56.model.resp.batchProcessing.*;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface BatchService {
    BatchPaymentBResp batchPaymentB(BatchPaymentBReq req);

    BatchPaymentBAsyncResp asyncBatchPaymentB(String content);

    BatchRepaymentBResp batchRepaymentB(BatchRepaymentBReq req);

    BatchRepaymentBAsyncResp asyncBatchRepaymentB(String content);

    BatchBuyCreditBResp batchBuyCreditB(BatchBuyCreditBReq req);

    BatchBuyCreditBAsyncResp asyncBatchBuyCreditB(String content);

    BatchRevokePaymentBResp batchRevokePaymentB(BatchRevokePaymentBReq req);

    BatchRevokeRepaymentBResp batchRevokeRepaymentB(BatchRevokeRepaymentBReq req);

    BatchRevokeBuyCreditBResp batchRevokeBuyCreditB(BatchRevokeBuyCreditBReq req);

    BatchEndCreditBResp batchEndCreditB(BatchEndCreditBReq req);

    BatchCouponBResp batchCouponB(BatchCouponBReq req);

    BatchCouponBAsyncResp asyncBatchCouponB(String content);

}
