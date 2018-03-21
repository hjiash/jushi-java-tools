package us.wili.tools56.api.impl;

import us.wili.tools56.api.AccountService;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.model.resp.account.CreateAccountPAsyncResp;
import us.wili.tools56.model.resp.account.SetPasswordPAsyncResp;
import us.wili.tools56.model.req.account.*;
import us.wili.tools56.model.resp.account.*;

/**
 * Created by lhyue on 2018/3/21.
 */
public class AccountServiceImpl implements AccountService {

    private JushiService jushiService;

    public AccountServiceImpl(JushiService jushiService) {
        this.jushiService = jushiService;
    }

    @Override
    public CreateAccountPResp createAccountP(CreateAccountPReq req) {
        return jushiService.post(req, CreateAccountPResp.class);
    }

    @Override
    public CreateAccountPAsyncResp asyncCreateAccount(String content) {
        return jushiService.decode(content, CreateAccountPAsyncResp.class);
    }

    @Override
    public SetPasswordPResp setPasswordP(SetPasswordPReq req) {
        return jushiService.post(req, SetPasswordPResp.class);
    }

    @Override
    public SetPasswordPAsyncResp asyncSetPasswordP(String content) {
        return jushiService.decode(content, SetPasswordPAsyncResp.class);
    }

    @Override
    public BindBankCardResp bindBankCard(BindBankCardReq req) {
        return jushiService.post(req, BindBankCardResp.class);
    }

    @Override
    public UnBindBankCardResp unBindBankCard(UnBindBankCardReq req) {
        return jushiService.post(req, UnBindBankCardResp.class);
    }

    @Override
    public ChangeMobileResp changeMobile(ChangeMobileReq req) {
        return jushiService.post(req, ChangeMobileResp.class);
    }

    @Override
    public AccountMobileResp accountMobile(AccountMobileReq req) {
        return jushiService.post(req, AccountMobileResp.class);
    }

    @Override
    public BindingListResp bindingList(BindingListReq req) {
        return jushiService.post(req, BindingListResp.class);
    }

    @Override
    public AccountBalanceResp accountBalance(AccountBalanceReq req) {
        return jushiService.post(req, AccountBalanceResp.class);
    }

    @Override
    public MarketingQueryResp marketingQuery(MarketingQueryReq req) {
        return jushiService.post(req, MarketingQueryResp.class);
    }

    @Override
    public FindAccountByIdResp findAccountById(FindAccountByIdReq req) {
        return jushiService.post(req, FindAccountByIdResp.class);
    }

    @Override
    public FindAccountByMobileResp findAccountByMobile(FindAccountByMobileReq req) {
        return jushiService.post(req, FindAccountByMobileResp.class);
    }

    @Override
    public AccountCreditsResp accountCredits(AccountCreditsReq req) {
        return jushiService.post(req, AccountCreditsResp.class);
    }

    @Override
    public AccountTransactionQueryResp accountTransactionQuery(AccountTransactionQueryReq req) {
        return jushiService.post(req, AccountTransactionQueryResp.class);
    }

    @Override
    public CreateAccountSrQueryResp createAccountSrQuery(CreateAccountSrQueryReq req) {
        return jushiService.post(req, CreateAccountSrQueryResp.class);
    }

    @Override
    public GatewayQueryResp gatewayQuery(GatewayQueryReq req) {
        return jushiService.post(req, GatewayQueryResp.class);
    }

    @Override
    public SetPasswordQueryResp setPasswordQuery(SetPasswordQueryReq req) {
        return jushiService.post(req, SetPasswordQueryResp.class);
    }
}
