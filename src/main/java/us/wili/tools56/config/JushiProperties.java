package us.wili.tools56.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import us.wili.tools56.util.http.apache.ApacheHttpClientBuilder;

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

    private String httpProxyHost;
    private int httpProxyPort;
    private String httpProxyUsername;
    private String httpProxyPassword;

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public void setHttpProxyHost(String httpProxyHost) {
        this.httpProxyHost = httpProxyHost;
    }

    public void setHttpProxyPort(int httpProxyPort) {
        this.httpProxyPort = httpProxyPort;
    }

    public void setHttpProxyUsername(String httpProxyUsername) {
        this.httpProxyUsername = httpProxyUsername;
    }

    public void setHttpProxyPassword(String httpProxyPassword) {
        this.httpProxyPassword = httpProxyPassword;
    }

    public String getHttpProxyHost() {
        return httpProxyHost;
    }

    public int getHttpProxyPort() {
        return httpProxyPort;
    }

    public String getHttpProxyUsername() {
        return httpProxyUsername;
    }

    public String getHttpProxyPassword() {
        return httpProxyPassword;
    }
}
