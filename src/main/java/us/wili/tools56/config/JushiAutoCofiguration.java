package us.wili.tools56.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import us.wili.tools56.api.JushiService;
import us.wili.tools56.api.impl.JushiServiceImpl;

import javax.annotation.Resource;

/**
 * Created by JasonY on 18/3/20.
 */
@Configuration
@ConditionalOnClass({JushiProperties.class})
@EnableConfigurationProperties({JushiProperties.class})
public class JushiAutoCofiguration {

    @Resource
    private JushiProperties jushiProperties;

    @Bean
    @ConditionalOnMissingBean(name = "jushiService")
    public JushiService jushiService() {
        JushiService jushiService = new JushiServiceImpl();
        jushiService.setProperties(jushiProperties);

        return jushiService;
    }

    public JushiProperties getJushiProperties() {
        return jushiProperties;
    }

    public void setJushiProperties(JushiProperties jushiProperties) {
        this.jushiProperties = jushiProperties;
    }
}
