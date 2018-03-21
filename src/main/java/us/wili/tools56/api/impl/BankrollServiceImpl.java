package us.wili.tools56.api.impl;

import us.wili.tools56.api.BankrollService;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.model.req.bankroll.*;
import us.wili.tools56.model.resp.bankroll.*;

/**
 * Created by lhyue on 2018/3/21.
 */
public class BankrollServiceImpl implements BankrollService{

    private JushiService jushiService;

    public BankrollServiceImpl(JushiService jushiService) {
        this.jushiService = jushiService;
    }

    @Override
    public CouponRechargeResp couponRecharge(CouponRechargeReq req) {
        return jushiService.post(req, CouponRechargeResp.class);
    }

    @Override
    public CouponWithdrawResp couponWithdraw(CouponWithdrawReq req) {
        return jushiService.post(req, CouponWithdrawResp.class);
    }

    @Override
    public FrozenResp frozen(FrozenReq req) {
        return jushiService.post(req, FrozenResp.class);
    }

    @Override
    public UnfrozenResp unFrozen(UnfrozenReq req) {
        return jushiService.post(req, UnfrozenResp.class);
    }

    @Override
    public FrozenQueryResp frozenQuery(FrozenQueryReq req) {
        return jushiService.post(req, FrozenQueryResp.class);
    }

    @Override
    public OfflineRechargeAsyncResp asyncOfflineRecharge(String content) {
        return jushiService.decode(content, OfflineRechargeAsyncResp.class);
    }

    @Override
    public NoSecretPresentationAsyncResp asyncNoSecretPresentation(String content) {
        return jushiService.decode(content, NoSecretPresentationAsyncResp.class);
    }

    @Override
    public BankRechargeResp bankRecharge(BankRechargeReq req) {
        return jushiService.post(req, BankRechargeResp.class);
    }

    @Override
    public BankRechargeAsyncResp asyncBankRecharge(String content) {
        return jushiService.decode(content, BankRechargeAsyncResp.class);
    }

    @Override
    public RechargePResp rechargeP(RechargePReq req) {
        return jushiService.post(req, RechargePResp.class);
    }

    @Override
    public RechargePAsyncResp asyncRechargeP(String content) {
        return jushiService.decode(content, RechargePAsyncResp.class);
    }

    @Override
    public WithdrawPResp withdrawP(WithdrawPReq req) {
        return jushiService.post(req, WithdrawPResp.class);
    }

    @Override
    public WithdrawPAsyncResp asyncWithdrawP(String content) {
        return jushiService.decode(content, WithdrawPAsyncResp.class);
    }

    @Override
    public SignBorrowerPResp signBorrowerP(SignBorrowerPReq req) {
        return jushiService.post(req, SignBorrowerPResp.class);
    }

    @Override
    public SignBorrowerPAsyncResp asyncSignBorrowerP(String content) {
        return jushiService.decode(content, SignBorrowerPAsyncResp.class);
    }

    @Override
    public SignPaymentQueryResp signPaymentQuery(SignPaymentQueryReq req) {
        return jushiService.post(req, SignPaymentQueryResp.class);
    }

    @Override
    public SignRepaymentQueryResp signRepaymentQuery(SignRepaymentQueryReq req) {
        return jushiService.post(req, SignRepaymentQueryResp.class);
    }

    @Override
    public RevokeRepaymentResp revokeRepayment(RevokeRepaymentReq req) {
        return jushiService.post(req, RevokeRepaymentResp.class);
    }

    @Override
    public RevokePaymentResp revokePayment(RevokePaymentReq req) {
        return jushiService.post(req, RevokePaymentResp.class);
    }

    @Override
    public SignTransferPResp signTransferP(SignTransferPReq req) {
        return jushiService.post(req, SignTransferPResp.class);
    }

    @Override
    public SignTransferPAsyncResp asyncSignTransferP(String content) {
        return jushiService.decode(content, SignTransferPAsyncResp.class);
    }

    @Override
    public SignTransferCheckResp signTransferCheck(SignTransferCheckReq req) {
        return jushiService.post(req, SignTransferCheckResp.class);
    }

    @Override
    public RevokeTransferResp revokeTransfer(RevokeTransferReq req) {
        return jushiService.post(req, RevokeTransferResp.class);
    }
}
