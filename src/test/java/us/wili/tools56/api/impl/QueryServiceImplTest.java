package us.wili.tools56.api.impl;

<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD

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
=======
=======
import com.google.inject.Inject;
import org.testng.annotations.Guice;
>>>>>>> 730f059... 补充测试类
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
        BatchQueryPaymentBReq req = new BatchQueryPaymentBReq();
=======
>>>>>>> e30d57b... 补充提交

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


<<<<<<< HEAD
} 
>>>>>>> 2ddada4... 增加MarketingServiceImplTest
=======
}
>>>>>>> e30d57b... 补充提交
