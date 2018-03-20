package us.wili.tools56.api.impl;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 23939f4... 添加测试逻辑
import us.wili.tools56.model.req.assets.AssetsEnrollReq;
import us.wili.tools56.model.resp.assets.AssetsEnrollResp;

import java.util.UUID;

import static org.testng.AssertJUnit.assertNotNull;
<<<<<<< HEAD
=======
>>>>>>> cb7ae10... 增加单元测试
=======
import us.wili.tools56.model.req.assets.AssetsEnrollReq;
import us.wili.tools56.model.req.assets.AssetsQueryReq;
import us.wili.tools56.model.req.assets.AssetsRevokeReq;

import static org.testng.AssertJUnit.assertNotNull;
>>>>>>> 730f059... 补充测试类
=======
>>>>>>> e30d57b... 补充提交
=======
>>>>>>> 23939f4... 添加测试逻辑

/**
 * Created by JasonY on 18/3/21.
 */
@Test
@Guice(modules = ApiTestConfig.class)
public class AssetsServiceImplTest {

    @Inject
    JushiService jushiService;

<<<<<<< HEAD
<<<<<<< HEAD
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

=======
    @Test
    public void testAssetsEnroll() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD
        AssetsEnrollReq req = new AssetsEnrollReq();
        assertNotNull(jushiService.getAssetsService().assetsEnroll(req));
>>>>>>> 730f059... 补充测试类
=======
>>>>>>> e30d57b... 补充提交
=======
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

>>>>>>> 23939f4... 添加测试逻辑
    }

    @Test
    public void testAssetsRevoke() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD
=======
        AssetsRevokeReq req = new AssetsRevokeReq();
        assertNotNull(jushiService.getAssetsService().assetsRevoke(req));
>>>>>>> 730f059... 补充测试类
=======
>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testAssetsQuery() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD
    }


=======
>>>>>>> cb7ae10... 增加单元测试
=======
        AssetsQueryReq req = new AssetsQueryReq();
        assertNotNull(jushiService.getAssetsService().assetsQuery(req));
=======
>>>>>>> e30d57b... 补充提交
    }


>>>>>>> 730f059... 补充测试类
}
