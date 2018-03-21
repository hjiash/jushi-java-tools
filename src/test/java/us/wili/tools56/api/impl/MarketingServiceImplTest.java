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
    }

    /**
     * Method: moneyRevoke(MoneyRevokeReq req)
     */
    @Test
    public void testMoneyRevoke() throws Exception {
    }


}
