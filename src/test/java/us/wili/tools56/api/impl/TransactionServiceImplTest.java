package us.wili.tools56.api.impl;


import com.alibaba.fastjson.JSON;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
import us.wili.tools56.model.req.transaction.*;
import us.wili.tools56.model.resp.transaction.*;
import us.wili.tools56.model.req.transaction.AutoBidApplyReq;
import us.wili.tools56.model.req.transaction.BidApplyPReq;
import us.wili.tools56.model.resp.transaction.AutoBidApplyResp;
import us.wili.tools56.model.resp.transaction.BidApplyPResp;

import java.util.UUID;

import static org.testng.AssertJUnit.assertNotNull;

@Test
@Guice(modules = ApiTestConfig.class)
public class TransactionServiceImplTest {

    @Inject
    JushiService jushiService;

    @Test
    public void testBidApplyP() throws Exception {
        BidApplyPReq req = new BidApplyPReq();

        req.setCard_no("9930040050260250085");
        req.setOut_serial_no(UUID.randomUUID().toString().replace("-", ""));
        req.setAmount("100.00");
        req.setAsset_no(UUID.randomUUID().toString().replace("-", ""));
        req.setInterest_date("20170807");
        req.setInterest_type("1");
        req.setInterest_day("");
        req.setEnd_date("20180321");
        req.setInterest_rate("10.00000");
        req.setFrozen_flag("1");

        req.setUse_bonus("0");

        req.setBonus_amount("0.00");
        req.setMobile("1111111111111111111");
        req.setTransact_date("20180321");

        req.setEnd_date("20170211");
        req.setInterest_rate("10");
        req.setFrozen_flag("0");

        BidApplyPResp resp = jushiService.getTransactionService().bidApplyP(req);
        assertNotNull(resp);
        System.out.println(resp);

    }

    @Test
    public void testBuyCreditP() throws Exception {
        BuyCreditPReq req = new BuyCreditPReq();
        req.setCard_no_in(UUID.randomUUID().toString().replace("-", ""));
        req.setOut_serial_no(UUID.randomUUID().toString().replace("-", ""));
        req.setOrigin_serial_no(UUID.randomUUID().toString().replace("-", ""));
        req.setCard_no_out(UUID.randomUUID().toString().replace("-", ""));
        req.setTotal_balance("1000.00");
        req.setAmount("100.00");
        req.setTransfer_price("110.00");
        req.setInterest_date("20170113");
        req.setInterest_rate("13.00000");
        req.setFee_way("0");
        req.setFee("0.00");
        req.setMobile("17621020244");
        req.setThird_custom("第三方保留域");
        req.setSuccess_url("https://www.rockfintech.com");
        req.setFail_url("https://www.rockfintech.com");
        req.setForget_pwd_url("https://www.rockfintech.com");
        req.setCallback_url("https://www.rockfintech.com");

        BuyCreditPResp resp = jushiService.getTransactionService().buyCreditP(req);
        assertNotNull(resp);
        System.out.println(JSON.toJSONString(resp));
    }

    @Test
    public void testSignAutoBidP() throws Exception {
    }

    @Test
    public void testAutomaticTightnessP() throws Exception {
    }

    @Test
    public void testSignCreditTransferP() throws Exception {
        SignCreditTransferPReq req = new SignCreditTransferPReq();
        req.setCard_no(UUID.randomUUID().toString().replace("-", ""));
        req.setAmount("50000");
        req.setUnit_amount("1000");
        req.setOut_serial_no(UUID.randomUUID().toString().replace("-", ""));
        req.setStart_time("1515037542");
        req.setEnd_time("1515039542");
        req.setSuccess_url("https://www.rockfintech.com");
        req.setFail_url("https://www.rockfintech.com");
        req.setCallback_url("https://www.rockfintech.com");

        SignCreditTransferPResp resp = jushiService.getTransactionService().signCreditTransferP(req);
        assertNotNull(resp);
        System.out.println(JSON.toJSONString(resp));
    }

    @Test
    public void testAuthorizationP() throws Exception {
    }


    @Test
    public void testTrusteePayP() throws Exception {
    }

    @Test
    public void testRevokeBid() throws Exception {

    }

    @Test
    public void testRevokeAutoBid() throws Exception {
        RevokeAutoBidReq req = new RevokeAutoBidReq();
        req.setCard_no(UUID.randomUUID().toString().replace("-", ""));
        req.setOut_serial_no(UUID.randomUUID().toString().replace("-", ""));
        req.setOrigin_serial_no(UUID.randomUUID().toString().replace("-", ""));

        RevokeAutoBidResp resp = jushiService.getTransactionService().revokeAutoBid(req);
        assertNotNull(resp);
        System.out.println(JSON.toJSONString(resp));
    }

    @Test
    public void testSignBidQuery() throws Exception {
    }

    @Test
    public void testAutoBidApply() throws Exception {
        AutoBidApplyReq req = new AutoBidApplyReq();
        req.setCard_no("9930040050260250085");
        req.setOut_serial_no(UUID.randomUUID().toString().replace("-", ""));
        req.setAmount("100.00");
        req.setUse_bonus("0");
        req.setBonus_amount("0.00");
        req.setAuth_code(UUID.randomUUID().toString().replace("-", ""));
        req.setAsset_no(UUID.randomUUID().toString().replace("-", ""));
        req.setInterest_date("20170807");
        req.setInterest_type("1");
        req.setInterest_day("");
        req.setEnd_date("20170211");
        req.setInterest_rate("10");
        req.setFrozen_flag("0");

        AutoBidApplyResp resp = jushiService.getTransactionService().autoBidApply(req);
        assertNotNull(resp);
        System.out.println(JSON.toJSONString(resp));
    }

    @Test
    public void testRevokeCreditTransfer() throws Exception {
        RevokeCreditTransferReq req = new RevokeCreditTransferReq();
        req.setCard_no(UUID.randomUUID().toString().replace("-", ""));
        req.setOrigin_serial_no(UUID.randomUUID().toString().replace("-", ""));
        req.setOut_serial_no(UUID.randomUUID().toString().replace("-", ""));

        RevokeCreditTransferResp resp = jushiService.getTransactionService().revokeCreditTransfer(req);
        assertNotNull(resp);
        System.out.println(JSON.toJSONString(resp));
    }

    @Test
    public void testSignTransferQuery() throws Exception {
    }

    @Test
    public void testRevokeWithdrawals() throws Exception {
    }

    @Test
    public void testSignWithdrawalsQueryReq() throws Exception {
    }


}
