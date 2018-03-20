package us.wili.tools56.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by JasonY on 18/3/20.
 */
@ConfigurationProperties(prefix = "wili.jushi")
public class JushiProperties {
    private String apiUrl = "https://apisit.rockfintech.com/2.0.0/deposit";
    private String pageUrl = "https://apisit.rockfintech.com/2.0.0/depositp";
    private String key;
    private String secret;
    private String org;
    private String privateKey;
    private String publicKey;


}
