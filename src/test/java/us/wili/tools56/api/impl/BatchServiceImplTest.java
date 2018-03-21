package us.wili.tools56.api.impl;

import com.alibaba.fastjson.JSON;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import sun.net.www.protocol.jar.URLJarFile;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
import us.wili.tools56.model.req.batchProcessing.BatchBuyCreditBReq;
import us.wili.tools56.model.resp.batchProcessing.BatchBuyCreditBResp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.testng.AssertJUnit.assertNotNull;

@Test
@Guice(modules = ApiTestConfig.class)
public class BatchServiceImplTest {

    @Inject
    JushiService jushiService;

    @Test
    public void testBatchPaymentB() throws Exception {

    }

    @Test
    public void testAsyncBatchPaymentB() throws Exception {

    }

    @Test
    public void testBatchRepaymentB() throws Exception {

    }

    @Test
    public void testAsyncBatchRepaymentB() throws Exception {

    }

    @Test
    public void testBatchBuyCreditB() throws Exception {
        BatchBuyCreditBReq req = new BatchBuyCreditBReq();
        req.setNotify_url("www.baidu.com");
        req.setBatch_no("300001");
        req.setBatch_count("1");

        List<BatchBuyCreditBReq.ItemsBean> items = new ArrayList<>();
        BatchBuyCreditBReq.ItemsBean itemsBean = new BatchBuyCreditBReq.ItemsBean();
        itemsBean.setBank_no("30040000");
        itemsBean.setIn_card_no(UUID.randomUUID().toString().replace("-", ""));
        itemsBean.setOut_card_no(UUID.randomUUID().toString().replace("-", ""));
        itemsBean.setSerial_no(UUID.randomUUID().toString().replace("-", ""));
        itemsBean.setOrigin_serial_no(UUID.randomUUID().toString().replace("-", ""));
        itemsBean.setTotal_amount("100.00");
        itemsBean.setTransfer_amount("1.00");
        itemsBean.setTransfer_prise("100.00");
        itemsBean.setTransfer_fee("");
        itemsBean.setInterest_date("21170515");
        itemsBean.setInterest_rate("10.00000");
        itemsBean.setReserved("");
        itemsBean.setThird_reserved("20170515173236098362");

        items.add(itemsBean);
        req.setItems(items);


        BatchBuyCreditBResp resp = jushiService.getBatchService().batchBuyCreditB(req);
        assertNotNull(resp);
        System.out.println(JSON.toJSONString(resp));

    }

    @Test
    public void testAsyncBatchBuyCreditB() throws Exception {

    }

    @Test
    public void testBatchRevokePaymentB() throws Exception {

    }

    @Test
    public void testBatchRevokeRepaymentB() throws Exception {

    }

    @Test
    public void testBatchRevokeBuyCreditB() throws Exception {

    }

    @Test
    public void testBatchEndCreditB() throws Exception {

    }

    @Test
    public void testBatchCouponB() throws Exception {

    }

    @Test
    public void testAsyncBatchCouponB() throws Exception {

    }


}
