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

<<<<<<< HEAD
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

=======
//    offlineRecharge

    BankRechargeResp bankRecharge(BankRechargeReq req);

    RechargePResp rechargeP(RechargePReq req);

    WithdrawPResp withdrawP(WithdrawPReq req);

    SignBorrowerPResp signBorrowerP(SignBorrowerPReq req);

>>>>>>> a5f4fed... 调整model类名称，新增service接口
    SignPaymentQueryResp signPaymentQuery(SignPaymentQueryReq req);

    SignRepaymentQueryResp signRepaymentQuery(SignRepaymentQueryReq req);

    RevokeRepaymentResp revokeRepayment(RevokeRepaymentReq req);

    RevokePaymentResp revokePayment(RevokePaymentReq req);

    SignTransferPResp signTransferP(SignTransferPReq req);

<<<<<<< HEAD
    SignTransferPAsyncResp asyncSignTransferP(String content);

=======
>>>>>>> a5f4fed... 调整model类名称，新增service接口
    SignTransferCheckResp signTransferCheck(SignTransferCheckReq req);

    RevokeTransferResp revokeTransfer(RevokeTransferReq req);

}
