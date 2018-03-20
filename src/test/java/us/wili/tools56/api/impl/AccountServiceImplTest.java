package us.wili.tools56.api.impl;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.alibaba.fastjson.JSON;
=======
>>>>>>> cb7ae10... 增加单元测试
=======
import com.alibaba.fastjson.JSON;
>>>>>>> 3a047ad... fix
=======
import com.alibaba.fastjson.JSON;
>>>>>>> 70d9154... fix
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 23939f4... 添加测试逻辑
import us.wili.tools56.model.req.account.AccountBalanceReq;
import us.wili.tools56.model.req.account.CreateAccountPReq;
import us.wili.tools56.model.req.account.FindAccountByIdReq;
import us.wili.tools56.model.req.account.SetPasswordPReq;
import us.wili.tools56.model.resp.account.AccountBalanceResp;
<<<<<<< HEAD
import us.wili.tools56.model.resp.account.CreateAccountPResp;
import us.wili.tools56.model.resp.account.FindAccountByIdResp;
import us.wili.tools56.model.resp.account.SetPasswordPResp;
=======
import us.wili.tools56.model.consts.RoleTypeEnum;
import us.wili.tools56.model.req.account.CreateAccountPReq;
import us.wili.tools56.model.resp.account.CreateAccountPResp;
<<<<<<< HEAD
>>>>>>> cb7ae10... 增加单元测试
=======
import us.wili.tools56.util.http.SimplePostRequestExecutor;
>>>>>>> 3a047ad... fix

import java.util.Map;
import java.util.UUID;
<<<<<<< HEAD
=======
import us.wili.tools56.model.req.account.*;
<<<<<<< HEAD
>>>>>>> 730f059... 补充测试类
=======
=======
>>>>>>> 23939f4... 添加测试逻辑
import us.wili.tools56.model.resp.account.CreateAccountPResp;
import us.wili.tools56.model.resp.account.FindAccountByIdResp;
import us.wili.tools56.model.resp.account.SetPasswordPResp;

import java.util.UUID;
>>>>>>> 70d9154... fix

import static org.testng.AssertJUnit.assertNotNull;
<<<<<<< HEAD
import static org.testng.AssertJUnit.assertTrue;

=======
import java.util.HashMap;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;
>>>>>>> 3a047ad... fix

=======

<<<<<<< HEAD
/**
 * Created by JasonY on 18/3/21.
 */
>>>>>>> cb7ae10... 增加单元测试
=======

>>>>>>> 730f059... 补充测试类
@Test
@Guice(modules = ApiTestConfig.class)
public class AccountServiceImplTest {

    @Inject
    JushiService jushiService;

    @Test
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
    }

    @Test
    public void testSetPasswordP() throws Exception {
<<<<<<< HEAD
        SetPasswordPReq req = new SetPasswordPReq();
=======
    public void testCreateAccountP() {
=======
    public void testCreateAccountP() throws Exception {
>>>>>>> 730f059... 补充测试类
        CreateAccountPReq req = new CreateAccountPReq();
        req.setSuccess_url("http://www.wili.us");
        req.setFail_url("http://www.wili.us");
        req.setCallback_url("http://www.wili.us");

        req.setRole_type("1");
        req.setService("create_account_p");
        req.setOut_serial_no("1111111111111111111111111111111");
        assertNotNull(jushiService.getAccountService().createAccountP(req));
=======
>>>>>>> 70d9154... fix
    }

    @Test
    public void testSetPasswordP() throws Exception {
=======

>>>>>>> 23939f4... 添加测试逻辑
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

<<<<<<< HEAD
        req.setAccount_type("200201");
        req.setRole_type(RoleTypeEnum.LEND_ROLE.getCode());
<<<<<<< HEAD
        req.setOut_serial_no(UUID.randomUUID().toString());
>>>>>>> cb7ae10... 增加单元测试
=======
        req.setOut_serial_no(System.currentTimeMillis() + "");
>>>>>>> 3a047ad... fix
        req.setSuccess_url("http://www.wili.us");
        req.setFail_url("http://www.wili.us");
        req.setCallback_url("http://www.wili.us");
        req.setClient("000002");

<<<<<<< HEAD
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


=======
        CreateAccountPResp resp = jushiService.getAccountService().createAccountP(req);
        assertNotNull(resp);
    }
>>>>>>> cb7ae10... 增加单元测试
=======
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


>>>>>>> 730f059... 补充测试类
}
