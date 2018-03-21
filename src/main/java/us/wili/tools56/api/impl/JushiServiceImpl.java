package us.wili.tools56.api.impl;

import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.JushiProperties;
import us.wili.tools56.model.resp.account.CreateAccountPResp;

/**
 * Created by JasonY on 18/3/21.
 */
public class JushiServiceImpl extends JushiServiceApacheImpl {

    public void test(JushiProperties properties) {
        JushiService jushiService = new JushiServiceImpl();
        jushiService.setProperties(properties);

<<<<<<< HEAD
//        jushiService.getAccountService().createAccountP(req);
=======
>>>>>>> 60ed685... 删除无用包，填充serviceImpl逻辑
    }

}