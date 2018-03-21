package us.wili.tools56.config;

import com.alibaba.fastjson.JSON;
import com.google.inject.Binder;
import com.google.inject.Module;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.api.impl.JushiServiceImpl;
import us.wili.tools56.model.consts.BatchTypeEnum;
import us.wili.tools56.model.req.batchProcessing.BatchEndCreditBReq;
import us.wili.tools56.model.resp.batchProcessing.BatchEndCreditBResp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

public class ApiTestConfig implements Module {

    @Override
    public void configure(Binder binder) {
        JushiProperties properties = this.getTestProperties();
        JushiService jushiService = new JushiServiceImpl();
        jushiService.setProperties(properties);

        binder.bind(JushiProperties.class).toInstance(properties);
        binder.bind(JushiService.class).toInstance(jushiService);
    }

    public JushiProperties getTestProperties() {
        InputStream in = null;
        try {
            Properties config = new Properties();

            in = ApiTestConfig.class.getClassLoader().getSystemResourceAsStream("test-config.properties");
            if (null == in) {
                throw new RuntimeException("没有找到配置文件 test-config.properties");
            }

            config.load(in);
            in.close();

            JushiProperties properties = new JushiProperties();
            properties.setApiUrl(config.getProperty("apiUrl"));
            properties.setPageUrl(config.getProperty("pageUrl"));
            properties.setKey(config.getProperty("key"));
            properties.setSecret(config.getProperty("secret"));
            properties.setOrg(config.getProperty("org"));
            properties.setPublicKey(config.getProperty("publicKey"));
            properties.setPrivateKey(config.getProperty("privateKey"));
            return properties;
        } catch (RuntimeException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            if (null != in)
                try {
                    in.close();
                } catch (Exception ex) {
                    RuntimeException rex = new RuntimeException(ex.getMessage());
                    rex.setStackTrace(ex.getStackTrace());
                    throw rex;
                }
        }
    }

}
