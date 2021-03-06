package us.wili.tools56.api;

import us.wili.tools56.model.req.transaction.*;
import us.wili.tools56.model.resp.transaction.*;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface TransactionService {
    BidApplyPResp bidApplyP(BidApplyPReq req);

    BidApplyPAsyncResp asyncBidApplyP(String content);

    BuyCreditPResp buyCreditP(BuyCreditPReq req);

    BuyCreditPAsyncResp asyncBuyCreditP(String content);

    SignAutoBidPResp signAutoBidP(SignAutoBidPReq req);

    SignAutoBidPAsyncResp asyncSignAutoBidP(String content);

    AutomaticTightnessPResp automaticTightnessP(AutomaticTightnessPReq req);

    AutomaticTightnessPAsyncResp asyncAutomaticTightnessP(String content);

    SignCreditTransferPResp signCreditTransferP(SignCreditTransferPReq req);

    SignCreditTransferPAsyncResp asyncSignCreditTransferP(String content);

    AuthorizationPResp authorizationP(AuthorizationPReq req);

    AuthorizationPAsyncResp asyncAuthorizationP(String content);

    TrusteePayPResp trusteePayP(TrusteePayPReq req);

    TrusteePayPAsyncResp asyncTrusteePayP(String content);

    RevokeBidResp revokeBid(RevokeBidReq req);

    RevokeAutoBidResp revokeAutoBid(RevokeAutoBidReq req);

    SignBidQueryResp signBidQuery(SignBidQueryReq req);

    AutoBidApplyResp autoBidApply(AutoBidApplyReq req);

    RevokeCreditTransferResp revokeCreditTransfer(RevokeCreditTransferReq req);

    SignTransferQueryResp signTransferQuery(SignTransferQueryReq req);

    RevokeWithdrawalsResp revokeWithdrawals(RevokeWithdrawalsReq req);

    SignWithdrawalsQueryResp signWithdrawalsQuery(SignWithdrawalsQueryReq req);

}
