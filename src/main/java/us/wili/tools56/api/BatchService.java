package us.wili.tools56.api;

import us.wili.tools56.model.req.batchProcessing.*;
import us.wili.tools56.model.resp.batchProcessing.*;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface BatchService {
    BatchPaymentBResp batchPaymentB(BatchPaymentBReq req);

    BatchRepaymentBResp batchRepaymentB(BatchRepaymentBReq req);

    BatchBuyCreditBResp batchBuyCreditB(BatchBuyCreditBReq req);

    BatchRevokePaymentBResp batchRevokePaymentB(BatchRevokePaymentBReq req);

    BatchRevokeRepaymentBResp batchRevokeRepaymentB(BatchRevokeRepaymentReq req);

    BatchRevokeBuyCreditBResp batchRevokeBuyCreditB(BatchRevokeBuyCreditBReq req);

    BatchEndCreditBResp batchEndCreditB(BatchEndCreditBReq req);

    BatchCouponBResp batchCouponB(BatchCouponBReq req);

}
