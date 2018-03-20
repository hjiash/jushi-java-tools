package us.wili.tools56.api.impl;

import com.alibaba.fastjson.JSON;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.ApiTestConfig;
import us.wili.tools56.model.req.enterprise.EnterpriseAddReq;
import us.wili.tools56.model.resp.enterprise.EnterpriseAddResp;

import static org.testng.AssertJUnit.assertNotNull;

@Test
@Guice(modules = ApiTestConfig.class)
public class EnterpriseServiceImplTest {

    @Inject
    JushiService jushiService;

    @Test
    public void testEnterpriseAdd() throws Exception {
        EnterpriseAddReq req = new EnterpriseAddReq();
=======
        req.setService("enterprise_add");
>>>>>>> e30d57b... 补充提交
=======

>>>>>>> 9e70d1b... 修啊个ibug
        req.setCert_no("11111111111111111111111111111111");
        req.setName("111111111111");
        req.setMobile("1111111111111111111");
        req.setBind_card("111111111111111111");
        req.setCard_no("111111111111111111");
        req.setCustomer_no("1111111111111111111");
        req.setSerial_no("111111111111111111111");
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 23939f4... 添加测试逻辑


        EnterpriseAddResp resp = jushiService.getEnterpriseService().enterpriseAdd(req);
        assertNotNull(resp);
        System.out.println(JSON.toJSONString(resp));
<<<<<<< HEAD
=======

=======
>>>>>>> e30d57b... 补充提交
        assertNotNull(jushiService.getEnterpriseService().enterpriseAdd(req));
>>>>>>> 730f059... 补充测试类
=======
>>>>>>> 23939f4... 添加测试逻辑
    }


} 
