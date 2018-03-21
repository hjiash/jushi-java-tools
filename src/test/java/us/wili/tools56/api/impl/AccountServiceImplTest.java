package us.wili.tools56.api.impl;

import com.alibaba.fastjson.JSON;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
import us.wili.tools56.model.req.account.AccountBalanceReq;
import us.wili.tools56.model.req.account.CreateAccountPReq;
import us.wili.tools56.model.req.account.FindAccountByIdReq;
import us.wili.tools56.model.req.account.SetPasswordPReq;
import us.wili.tools56.model.resp.account.AccountBalanceResp;
import us.wili.tools56.model.resp.account.CreateAccountPResp;
import us.wili.tools56.model.resp.account.FindAccountByIdResp;
import us.wili.tools56.model.resp.account.SetPasswordPResp;

import java.util.UUID;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;


@Test
@Guice(modules = ApiTestConfig.class)
public class AccountServiceImplTest {

    @Inject
    JushiService jushiService;

    @Test
    public void testCreateAccountP() throws Exception {
        CreateAccountPReq req = new CreateAccountPReq();
        req.setSuccess_url("http://www.wili.us");
        req.setFail_url("http://www.wili.us");
        req.setCallback_url("http://www.wili.us");

        req.setRole_type("1");
        req.setOut_serial_no(UUID.randomUUID().toString().replace("-", ""));

        CreateAccountPResp resp = jushiService.getAccountService().createAccountP(req);
        assertNotNull(resp);
        System.out.println(JSON.toJSONString(resp));
    }

    @Test
    public void testSetPasswordP() throws Exception {
        SetPasswordPReq req = new SetPasswordPReq();
        req.setSuccess_url("http://www.wili.us");
        req.setFail_url("http://www.wili.us");
        req.setCallback_url("http://www.wili.us");

        String uuid = UUID.randomUUID().toString();
        req.setCustomer_no(uuid.substring(1, 10));
        req.setCard_no(uuid.substring(1, 20));
        req.setOut_serial_no(uuid.substring(1, 32));

        SetPasswordPResp resp = jushiService.getAccountService().setPasswordP(req);
        assertNotNull(req);
        System.out.println(resp);

    }

    @Test
    public void testBindBankCard() throws Exception {

    }

    @Test
    public void testUnBindBankCard() throws Exception {

    }

    @Test
    public void testChangeMobile() throws Exception {

    }

    @Test
    public void testAccountMobile() throws Exception {

    }

    @Test
    public void testBindingList() throws Exception {

    }

    @Test
    public void testAccountBalance() throws Exception {
        AccountBalanceReq req = new AccountBalanceReq();

        String uuid = UUID.randomUUID().toString();
        req.setCustomer_no(uuid.substring(1, 10));
        req.setCard_no(uuid.substring(1, 20));
        req.setThird_custom("第三方预留");

        AccountBalanceResp resp = jushiService.getAccountService().accountBalance(req);
        assertNotNull(req);
        System.out.println(resp);
    }

    @Test
    public void testMarketingQuery() throws Exception {

    }

    @Test
    public void testFindAccountById() throws Exception {
        FindAccountByIdReq req = new FindAccountByIdReq();

        String uuid = UUID.randomUUID().toString();

        req.setCert_type("15");
        req.setCert_no(uuid.substring(1, 18));
        FindAccountByIdResp resp = jushiService.getAccountService().findAccountById(req);
        assertNotNull(resp);
        System.out.println(resp);
    }

    @Test
    public void testFindAccountByMobile() throws Exception {

    }

    @Test
    public void testAccountCredits() throws Exception {

    }

    @Test
    public void testAccountTransactionQuery() throws Exception {

    }

    @Test
    public void testCreateAccountSrQuery() throws Exception {

    }

    @Test
    public void testGatewayQuery() throws Exception {

    }

    @Test
    public void testSetPasswordQuery() throws Exception {

    }


}
