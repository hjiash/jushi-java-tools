package us.wili.tools56.api;

import us.wili.tools56.model.req.bankroll.*;
import us.wili.tools56.model.resp.bankroll.*;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface BankrollService {
    CouponRechargeResp couponRecharge(CouponRechargeReq req);

    CouponWithdrawResp couponWithdraw(CouponWithdrawReq req);

    FrozenResp frozen(FrozenReq req);

    UnfrozenResp unFrozen(UnfrozenReq req);

    FrozenQueryResp frozenQuery(FrozenQueryReq req);

    OfflineRechargeAsyncResp asyncOfflineRecharge(String content);

    NoSecretPresentationAsyncResp asyncNoSecretPresentation(String content);

    BankRechargeResp bankRecharge(BankRechargeReq req);

    BankRechargeAsyncResp asyncBankRecharge(String content);

    RechargePResp rechargeP(RechargePReq req);

    RechargePAsyncResp asyncRechargeP(String content);

    WithdrawPResp withdrawP(WithdrawPReq req);

    WithdrawPAsyncResp asyncWithdrawP(String content);

    SignBorrowerPResp signBorrowerP(SignBorrowerPReq req);

    SignBorrowerPAsyncResp asyncSignBorrowerP(String content);

    SignPaymentQueryResp signPaymentQuery(SignPaymentQueryReq req);

    SignRepaymentQueryResp signRepaymentQuery(SignRepaymentQueryReq req);

    RevokeRepaymentResp revokeRepayment(RevokeRepaymentReq req);

    RevokePaymentResp revokePayment(RevokePaymentReq req);

    SignTransferPResp signTransferP(SignTransferPReq req);

    SignTransferPAsyncResp asyncSignTransferP(String content);

    SignTransferCheckResp signTransferCheck(SignTransferCheckReq req);

    RevokeTransferResp revokeTransfer(RevokeTransferReq req);

}
