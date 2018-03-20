package us.wili.tools56.api.impl;

import us.wili.tools56.api.JushiService;
import us.wili.tools56.config.JushiProperties;

/**
 * Created by JasonY on 18/3/21.
 */
public class JushiServiceImpl extends JushiServiceApacheImpl {

    public void test(JushiProperties properties) {
        JushiService jushiService = new JushiServiceImpl();
        jushiService.setProperties(properties);
    }

}