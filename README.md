钜石存管系统的Java开发工具包（SDK）
---------------------------------

本项目实现了钜石存管系统接口的请求封装，目前仅对项目中使用到的接口进行了单元测试。

# 一般项目使用

```java

// 实例化对象
JushiProperties properties = this.getTestProperties();
properties.setApiUrl(config.getProperty("apiUrl"));
properties.setPageUrl(config.getProperty("pageUrl"));
properties.setKey(config.getProperty("key"));
properties.setSecret(config.getProperty("secret"));
properties.setOrg(config.getProperty("org"));
properties.setPublicKey(config.getProperty("publicKey"));
properties.setPrivateKey(config.getProperty("privateKey"));

JushiService jushiService = new JushiServiceImpl();
jushiService.setProperties(properties);

// 以账号创建为例子
AccountBalanceReq req = new AccountBalanceReq();

String uuid = UUID.randomUUID().toString();
req.setCustomer_no(uuid.substring(1, 10));
req.setCard_no(uuid.substring(1, 20));
req.setThird_custom("第三方预留");

// 请求参数会自动签名并且加密
// 返回结果已经通过解密和验签
AccountBalanceResp resp = jushiService.getAccountService().accountBalance(req);
```

## SpringBoot项目使用

* 配置
```yml

wili.jushi:
  apiUrl: https://apiuat.rockfintech.com/2.0.0/deposit
  pageUrl: https://apiuat.rockfintech.com/2.0.0/deposit
  key: 6615210820854674
  secret: f3fb620e9d92eb77bb46764cbd957ae0
  org: 1001
  publicKey: /Users/JasonY/Program/56/config/test-pub.key
  privateKey: /Users/JasonY/Program/56/config/test-pri.key

```

* 自动注入配置参数，并且注入对象
```java
// 在需要使用JushiService的地方
@javax.annotation.Resource
JushiService jushiService;

// 以账号创建为例子
AccountBalanceReq req = new AccountBalanceReq();

String uuid = UUID.randomUUID().toString();
req.setCustomer_no(uuid.substring(1, 10));
req.setCard_no(uuid.substring(1, 20));
req.setThird_custom("第三方预留");

// 请求参数会自动签名并且加密
// 返回结果已经通过解密和验签
AccountBalanceResp resp = jushiService.getAccountService().accountBalance(req);

```