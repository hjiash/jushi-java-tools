package us.wili.tools56.api.impl;

import us.wili.tools56.api.BatchService;
import us.wili.tools56.model.asyncResp.batchProcessing.BatchBuyCreditBAsyncResp;
import us.wili.tools56.model.asyncResp.batchProcessing.BatchCouponBAsyncResp;
import us.wili.tools56.model.asyncResp.batchProcessing.BatchPaymentBAsyncResp;
import us.wili.tools56.model.asyncResp.batchProcessing.BatchRepaymentBAsyncResp;
import us.wili.tools56.model.req.batchProcessing.*;
import us.wili.tools56.model.resp.batchProcessing.*;

/**
 * Created by lhyue on 2018/3/21.
 */
public class BatchServiceImpl implements BatchService {
    @Override
    public BatchPaymentBResp batchPaymentB(BatchPaymentBReq req) {
        return null;
    }

    @Override
    public BatchPaymentBAsyncResp asyncBatchPaymentB(String content) {
        return null;
    }

    @Override
    public BatchRepaymentBResp batchRepaymentB(BatchRepaymentBReq req) {
        return null;
    }

    @Override
    public BatchRepaymentBAsyncResp asyncBatchRepaymentB(String content) {
        return null;
    }

    @Override
    public BatchBuyCreditBResp batchBuyCreditB(BatchBuyCreditBReq req) {
        return null;
    }

    @Override
    public BatchBuyCreditBAsyncResp asyncBatchBuyCreditB(String content) {
        return null;
    }

    @Override
    public BatchRevokePaymentBResp batchRevokePaymentB(BatchRevokePaymentBReq req) {
        return null;
    }

    @Override
    public BatchRevokeRepaymentBResp batchRevokeRepaymentB(BatchRevokeRepaymentBReq req) {
        return null;
    }

    @Override
    public BatchRevokeBuyCreditBResp batchRevokeBuyCreditB(BatchRevokeBuyCreditBReq req) {
        return null;
    }

    @Override
    public BatchEndCreditBResp batchEndCreditB(BatchEndCreditBReq req) {
        return null;
    }

    @Override
    public BatchCouponBResp batchCouponB(BatchCouponBReq req) {
        return null;
    }

    @Override
    public BatchCouponBAsyncResp asyncBatchCouponB(String content) {
        return null;
    }
}
