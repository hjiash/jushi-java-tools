package us.wili.tools56.api.impl;

import us.wili.tools56.api.JushiService;
import us.wili.tools56.api.TransactionService;
import us.wili.tools56.model.req.transaction.*;
import us.wili.tools56.model.resp.transaction.*;

/**
 * Created by lhyue on 2018/3/21.
 */
public class TransactionServiceImpl implements TransactionService {

    private JushiService jushiService;

    public TransactionServiceImpl(JushiService jushiService) {
        this.jushiService = jushiService;
    }

    @Override
    public BidApplyPResp bidApplyP(BidApplyPReq req) {
        return jushiService.post(req, BidApplyPResp.class);
    }

    @Override
    public BidApplyPAsyncResp asyncBidApplyP(String content) {
        return jushiService.decode(content, BidApplyPAsyncResp.class);
    }

    @Override
    public BuyCreditPResp buyCreditP(BuyCreditPReq req) {
        return jushiService.post(req, BuyCreditPResp.class);
    }

    @Override
    public BuyCreditPAsyncResp asyncBuyCreditP(String content) {
        return jushiService.decode(content, BuyCreditPAsyncResp.class);
    }

    @Override
    public SignAutoBidPResp signAutoBidP(SignAutoBidPReq req) {
        return jushiService.post(req, SignAutoBidPResp.class);
    }

    @Override
    public SignAutoBidPAsyncResp asyncSignAutoBidP(String content) {
        return jushiService.decode(content, SignAutoBidPAsyncResp.class);
    }

    @Override
    public AutomaticTightnessPResp automaticTightnessP(AutomaticTightnessPReq req) {
        return jushiService.post(req, AutomaticTightnessPResp.class);
    }

    @Override
    public AutomaticTightnessPAsyncResp asyncAutomaticTightnessP(String content) {
        return jushiService.decode(content, AutomaticTightnessPAsyncResp.class);
    }

    @Override
    public SignCreditTransferPResp signCreditTransferP(SignCreditTransferPReq req) {
        return jushiService.post(req, SignCreditTransferPResp.class);
    }

    @Override
    public SignCreditTransferPAsyncResp asyncSignCreditTransferP(String content) {
        return jushiService.decode(content, SignCreditTransferPAsyncResp.class);
    }

    @Override
    public AuthorizationPResp authorizationP(AuthorizationPReq req) {
        return jushiService.post(req, AuthorizationPResp.class);
    }

    @Override
    public AuthorizationPAsyncResp asyncAuthorizationP(String content) {
        return jushiService.decode(content, AuthorizationPAsyncResp.class);
    }

    @Override
    public TrusteePayPResp trusteePayP(TrusteePayPReq req) {
        return jushiService.post(req, TrusteePayPResp.class);
    }

    @Override
    public TrusteePayPAsyncResp asyncTrusteePayP(String content) {
        return jushiService.decode(content, TrusteePayPAsyncResp.class);
    }

    @Override
    public RevokeBidResp revokeBid(RevokeBidReq req) {
        return jushiService.post(req, RevokeBidResp.class);
    }

    @Override
    public RevokeAutoBidResp revokeAutoBid(RevokeAutoBidReq req) {
        return jushiService.post(req, RevokeAutoBidResp.class);
    }

    @Override
    public SignBidQueryResp signBidQuery(SignBidQueryReq req) {
        return jushiService.post(req, SignBidQueryResp.class);
    }

    @Override
    public AutoBidApplyResp autoBidApply(AutoBidApplyReq req) {
        return jushiService.post(req, AutoBidApplyResp.class);
    }

    @Override
    public RevokeCreditTransferResp revokeCreditTransfer(RevokeCreditTransferReq req) {
        return jushiService.post(req, RevokeCreditTransferResp.class);
    }

    @Override
    public SignTransferQueryResp signTransferQuery(SignTransferQueryReq req) {
        return jushiService.post(req, SignTransferQueryResp.class);
    }

    @Override
    public RevokeWithdrawalsResp revokeWithdrawals(RevokeWithdrawalsReq req) {
        return jushiService.post(req, RevokeWithdrawalsResp.class);
    }

    @Override
    public SignWithdrawalsQueryResp signWithdrawalsQuery(SignWithdrawalsQueryReq req) {
        return jushiService.post(req, SignWithdrawalsQueryResp.class);
    }
}
