package us.wili.tools56.api.impl;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
import us.wili.tools56.model.req.marketing.MoneyDispatchReq;
import us.wili.tools56.model.req.marketing.MoneyRevokeReq;

import static org.testng.AssertJUnit.assertNotNull;

@Test
@Guice(modules = ApiTestConfig.class)
public class MarketingServiceImplTest {

    @Inject
    JushiService jushiService;

    @Test
    public void testMoneyDispatch() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD
=======
        MoneyDispatchReq req = new MoneyDispatchReq();
        req.setCard_no("111111111111111111");
        req.setCard_no_in("222222222222222222");
        req.setCurrency("153");
        req.setAmount("0.01");
        req.setDescription_flag("0");


        assertNotNull(jushiService.getMarketingService().moneyDispatch(req));
>>>>>>> 2ddada4... 增加MarketingServiceImplTest
=======
>>>>>>> e30d57b... 补充提交
    }

    /**
     * Method: moneyRevoke(MoneyRevokeReq req)
     */
    @Test
    public void testMoneyRevoke() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD
    }


}
=======
        MoneyRevokeReq req = new MoneyRevokeReq();
        assertNotNull(jushiService.getMarketingService().moneyRevoke(req));
    }


} 
>>>>>>> 2ddada4... 增加MarketingServiceImplTest
=======
    }


}
>>>>>>> e30d57b... 补充提交
