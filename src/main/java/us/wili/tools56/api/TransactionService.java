package us.wili.tools56.api;

import us.wili.tools56.model.req.transaction.*;
import us.wili.tools56.model.resp.transaction.*;

/**
 * Created by lhyue on 2018/3/20.
 */
public interface TransactionService {
    BidApplyPResp bidApplyP(BidApplyPReq req);

    BuyCreditPResp buyCreditP(BuyCreditPReq req);

    SignAutoBidPResp signAutoBidP(SignAutoBidPReq req);

    AutomaticTightnessPResp automaticTightnessP(AutomaticTightnessPReq req);

    SignCreditTransferPResp signCreditTransferP(SignCreditTransferPReq req);

    AuthorizationPResp authorizationP(AuthorizationPReq req);

    TrusteePayPResp trusteePayP(TrusteePayPReq req);

    RevokeBidResp revokeBid(RevokeBidReq req);

    RevokeAutoBidResp revokeAutoBid(RevokeAutoBidReq req);

    SignBidQueryResp signBidQuery(SignBidQueryReq req);

    AutoBidApplyResp autoBidApply(AutoBidApplyReq req);

    RevokeCreditTransferResp revokeCreditTransfer(RevokeCreditTransferReq req);

    SignTransferQueryResp signTransferQuery(SignTransferQueryReq req);

    RevokeWithdrawalsResp revokeWithdrawals(RevokeWithdrawalsReq req);

    SignWithdrawalsQueryResp signWithdrawalsQuery(SignWithdrawalsQueryReq req);

}
