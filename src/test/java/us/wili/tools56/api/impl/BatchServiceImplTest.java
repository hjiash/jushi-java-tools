package us.wili.tools56.api.impl;

<<<<<<< HEAD
import com.alibaba.fastjson.JSON;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
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

=======
import org.testng.annotations.Test;


public class BatchServiceImplTest {

    @Test
    public void testBatchPaymentB() throws Exception {
<<<<<<< HEAD
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testAsyncBatchPaymentB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testBatchRepaymentB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testAsyncBatchRepaymentB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testBatchBuyCreditB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD
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

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testAsyncBatchBuyCreditB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testBatchRevokePaymentB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testBatchRevokeRepaymentB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testBatchRevokeBuyCreditB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testBatchEndCreditB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testBatchCouponB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

=======
 
>>>>>>> 730f059... 补充测试类
=======

>>>>>>> e30d57b... 补充提交
    }

    @Test
    public void testAsyncBatchCouponB() throws Exception {
<<<<<<< HEAD
<<<<<<< HEAD

    }


}
=======
 
    }


} 
>>>>>>> 730f059... 补充测试类
=======

    }


}
>>>>>>> e30d57b... 补充提交
