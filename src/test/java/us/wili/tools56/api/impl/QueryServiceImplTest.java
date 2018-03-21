package us.wili.tools56.api.impl;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
import us.wili.tools56.model.req.query.*;

import static org.testng.AssertJUnit.assertNotNull;

@Test
@Guice(modules = ApiTestConfig.class)
public class QueryServiceImplTest {

    @Inject
    JushiService jushiService;

    @Test
    public void testBatchQueryPaymentB() throws Exception {

    }


    @Test
    public void testBatchQueryRepaymentB() throws Exception {

    }

    @Test
    public void testBatchQueryBuyCreditB() throws Exception {

    }

    @Test
    public void testApplyBidQuery() throws Exception {
    }

    @Test
    public void testBuyCreditQuery() throws Exception {
    }

    @Test
    public void testMoneyQuery() throws Exception {
    }


}
