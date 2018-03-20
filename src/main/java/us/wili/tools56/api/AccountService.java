package us.wili.tools56.api;

import us.wili.tools56.model.asynResp.account.AccountCreatePAsynResp;
import us.wili.tools56.model.req.account.*;
import us.wili.tools56.model.resp.account.*;

/**
 * Created by JasonY on 18/3/20.
 */
public interface AccountService {

    CreateAccountPResp createAccountP(CreateAccountPReq req);

    AccountCreatePAsynResp asyncCreateAccount(String content);

    SetPasswordPResp setPasswordP(SetPasswordPReq req);

    BindBankCardResp bindBankCard(BindBankCardReq req);

    UnBindBankCardResp unBindBankCard(UnBindBankCardReq req);

    ChangeMobileResp changeMobile(ChangeMobileReq req);

    AccountMobileResp accountMobile(AccountMobileReq req);

    BindingListResp bindingList(BindingListReq req);

    AccountBalanceResp accountBalance(AccountBalanceReq req);

    MarketingQueryResp marketingQuery(MarketingQueryReq req);

    FindAccountByIdResp findAccountById(FindAccountByIdReq req);

    FindAccountByMobileResp findAccountByMobile(FindAccountByMobileReq req);

    AccountCreditsResp accountCredits(AccountCreditsReq req);

    AccountTransactionQueryResp accountTransactionQuery(AccountTransactionQueryReq req);

    CreateAccountSrQueryResp createAccountSrQuery(CreateAccountSrQueryReq req);

    GatewayQueryResp gatewayQuery(GatewayQueryReq req);

    SetPasswordQueryResp setPasswordQuery(SetPasswordQueryReq req);
}
