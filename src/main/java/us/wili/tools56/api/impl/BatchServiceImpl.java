package us.wili.tools56.api.impl;

import us.wili.tools56.api.BatchService;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.model.resp.batchProcessing.BatchBuyCreditBAsyncResp;
import us.wili.tools56.model.resp.batchProcessing.BatchCouponBAsyncResp;
import us.wili.tools56.model.resp.batchProcessing.BatchPaymentBAsyncResp;
import us.wili.tools56.model.resp.batchProcessing.BatchRepaymentBAsyncResp;
import us.wili.tools56.model.req.batchProcessing.*;
import us.wili.tools56.model.resp.batchProcessing.*;

/**
 * Created by lhyue on 2018/3/21.
 */
public class BatchServiceImpl implements BatchService {

    private JushiService jushiService;

    public BatchServiceImpl(JushiService jushiService) {
        this.jushiService = jushiService;
    }

    @Override
    public BatchPaymentBResp batchPaymentB(BatchPaymentBReq req) {
        return jushiService.post(req, BatchPaymentBResp.class);
    }

    @Override
    public BatchPaymentBAsyncResp asyncBatchPaymentB(String content) {
        return jushiService.decode(content, BatchPaymentBAsyncResp.class);
    }

    @Override
    public BatchRepaymentBResp batchRepaymentB(BatchRepaymentBReq req) {
        return jushiService.post(req, BatchRepaymentBResp.class);
    }

    @Override
    public BatchRepaymentBAsyncResp asyncBatchRepaymentB(String content) {
        return jushiService.decode(content, BatchRepaymentBAsyncResp.class);
    }

    @Override
    public BatchBuyCreditBResp batchBuyCreditB(BatchBuyCreditBReq req) {
        return jushiService.post(req, BatchBuyCreditBResp.class);
    }

    @Override
    public BatchBuyCreditBAsyncResp asyncBatchBuyCreditB(String content) {
        return jushiService.decode(content, BatchBuyCreditBAsyncResp.class);
    }

    @Override
    public BatchRevokePaymentBResp batchRevokePaymentB(BatchRevokePaymentBReq req) {
        return jushiService.post(req, BatchRevokePaymentBResp.class);
    }

    @Override
    public BatchRevokeRepaymentBResp batchRevokeRepaymentB(BatchRevokeRepaymentBReq req) {
        return jushiService.post(req, BatchRevokeRepaymentBResp.class);
    }

    @Override
    public BatchRevokeBuyCreditBResp batchRevokeBuyCreditB(BatchRevokeBuyCreditBReq req) {
        return jushiService.post(req, BatchRevokeBuyCreditBResp.class);
    }

    @Override
    public BatchEndCreditBResp batchEndCreditB(BatchEndCreditBReq req) {
        return jushiService.post(req, BatchEndCreditBResp.class);
    }

    @Override
    public BatchCouponBResp batchCouponB(BatchCouponBReq req) {
        return jushiService.post(req, BatchCouponBResp.class);
    }

    @Override
    public BatchCouponBAsyncResp asyncBatchCouponB(String content) {
        return jushiService.decode(content, BatchCouponBAsyncResp.class);
    }
}
