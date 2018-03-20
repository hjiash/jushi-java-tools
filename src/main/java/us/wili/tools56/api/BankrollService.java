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

//    offlineRecharge

    BankRechargeResp bankRecharge(BankRechargeReq req);

    RechargePResp rechargeP(RechargePReq req);

    WithdrawPResp withdrawP(WithdrawPReq req);

    SignBorrowerPResp signBorrowerP(SignBorrowerPReq req);

    SignPaymentQueryResp signPaymentQuery(SignPaymentQueryReq req);

    SignRepaymentQueryResp signRepaymentQuery(SignRepaymentQueryReq req);

    RevokeRepaymentResp revokeRepayment(RevokeRepaymentReq req);

    RevokePaymentResp revokePayment(RevokePaymentReq req);

    SignTransferPResp signTransferP(SignTransferPReq req);

    SignTransferCheckResp signTransferCheck(SignTransferCheckReq req);

    RevokeTransferResp revokeTransfer(RevokeTransferReq req);

}
