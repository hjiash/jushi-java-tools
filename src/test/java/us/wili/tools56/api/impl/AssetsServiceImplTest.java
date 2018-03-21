package us.wili.tools56.api.impl;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
import us.wili.tools56.model.req.assets.AssetsEnrollReq;
import us.wili.tools56.model.resp.assets.AssetsEnrollResp;

import java.util.UUID;

import static org.testng.AssertJUnit.assertNotNull;

/**
 * Created by JasonY on 18/3/21.
 */
@Test
@Guice(modules = ApiTestConfig.class)
public class AssetsServiceImplTest {

    @Inject
    JushiService jushiService;

    @Test
    public void testAssetsEnroll() throws Exception {
        AssetsEnrollReq req = new AssetsEnrollReq();
        String uuid = UUID.randomUUID().toString();
        req.setAsset_no(uuid.substring(0, 30));
        req.setAsset_brief(uuid);
        req.setCard_no(uuid.substring(0, 19));
        req.setAmount("0.01");
        req.setInterest_type("1");
        req.setInterest_day("01");
        req.setLoan_term("1000");
        req.setInterest_rate("1.00000%");
        req.setWarrant_card_no(uuid.substring(1, 20));
        req.setBorrow_card_no(uuid.substring(2, 21));
        req.setDebtor_card_no(uuid.substring(3, 22));
        req.setTrustee_pay_flag("1");

        AssetsEnrollResp assetsEnrollResp = jushiService.getAssetsService().assetsEnroll(req);
        assertNotNull(assetsEnrollResp);
        System.out.println(assetsEnrollResp);

    }

    @Test
    public void testAssetsRevoke() throws Exception {
    }

    @Test
    public void testAssetsQuery() throws Exception {
    }


}
