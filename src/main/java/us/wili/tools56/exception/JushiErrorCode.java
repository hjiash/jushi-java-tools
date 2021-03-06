package us.wili.tools56.exception;

/**
 * 钜石存管系统异常信息枚举
 * 格式：模块名_接口名_异常描述("文档中提及的错误信息", "异常代号")
 *
 * Created by JasonY on 18/3/20.
 */
public enum JushiErrorCode {
    SUCCESS("成功", "RD000000"),
    ACCOUNT_DOES_NOT_EXIST("账户不存在", "RD001034"),
    THE_SERIAL_NUMBER_ALREADY_EXISTS("流水号已存在，请重新输入", "RD001024"),
    MESSAGE_TYPE_CONVERSION_ERROR("报文参数类型转换错误！", "RD1031301"),
    ID_NAME_OR_BANK_RESERVED_CELL_PHONE_NUMBER_WRONG("身份证、姓名或银行预留手机号有误","T2600120"),
    Bid_records_do_not_exist("投标记录不存在","RD000201"),
    Inadequate_balance_of_accounts("账户可用余额不足","RD000195"),

    ACCOUNT_EMPTY_SUCCESS_URL("成功跳转链接不能为空", "RD000603"),
    ACCOUNT_EMPTY_FAIL_URL("失败跳转链接不能为空", "RD000604"),
    ACCOUNT_EMPTY_CALLBACK_URL("后台响应链接不能为空", "RD000605"),
    ACCOUNT_CREATE_ACCOUNT_P_TYPE_WRONG("开户账户类型上送有误", "RD000601"),
    ACCOUNT_CREATE_ACCOUNT_P_EMPTY_SERIALNUMBER("开户请求流水号不能为空", "RD000602"),
    ACCOUNT_CREATE_ACCOUNT_P_ACCOUNT_SYSTEM_ERROR("账务系统接口错误", "RD777777"),
    ACCOUNT_CREATE_ACCOUNT_P_EMPTY_CHANNEL_INTERFACE("渠道接口交易未配置或不存在，或交易地址为空", "RD10001"),
    ACCOUNT_SET_PASSWORD_P_NON_CHANNEL_CUSTOMERS("非渠道内客户", "RD1031303"),
    ACCOUNT_SET_PASSWORD_P_REPEAT_BUSINESS_TRANSACTION("请求业务流水号重复", "RD1031304"),
    ACCOUNT_SET_PASSWORD_P_ADDRESS_IS_EMPTY("交易地址为空", "RD10001"),
    ACCOUNT_BIND_BANK_CARD_NUMBER_HAS_BIND("该卡号已绑卡","RD000120"),
    ACCOUNT_BIND_BANK_CARD_BANKID_WRONG("请求参数[BANKID]格式错误！","RD1001"),
    ACCOUNT_BIND_BANK_CARD_ACCOUNT_HAD_BOUND_NUMBER("电子账号已与该卡号绑定","RD000213"),
    ACCOUNT_BIND_BANK_CARD_ACCOUNT_HAD_SIGNED("电子账号已存在签约关系","RD000214"),
    ACCOUNT_BIND_BANK_CARD_VALIDATION_DID_NOT_PASS("平台交易验证未通过","RD000210"),
    ACCOUNT_BIND_BANK_CARD_BLACKLIST_LIMIT_TRANSACTION_TIMES_AMOUNT_OVERRUN("黑名单限制、交易次数/金额超限","RD000439"),
    ACCOUNT_BIND_BANK_CARD_PARAMETER_NOT_SET("交易缺省参数未设置","RD000467"),
    ACCOUNT_BIND_BANK_CARD_VERIFY_SIGNATURE_FAILURE("验证签名失败","RD000490"),
    ACCOUNT_BIND_BANK_CARD_TRANSACTION_FAILURE("交易失败，详情请咨询您的发卡行","RD000507"),
    ACCOUNT_BIND_BANK_CARD_INVALID_CARD_NUMBER("输入的卡号无效，请确认后输入","RD000508"),
    ACCOUNT_BIND_BANK_CARD_BANK_DOES_NOT_SUPPORT_THE_MERCHANT("交易失败，发卡银行不支持该商户，请更换其他银行卡","RD000509"),
    ACCOUNT_BIND_BANK_CARD_PASSWORD_TIME_OF_VALIDITY_OR_CVN2_ERROR("输入的密码、有效期或CVN2有误，交易失败","RD000512"),
    ACCOUNT_BIND_BANK_CARD_IDENTITY_INFORMATION_OR_CELL_PHONE_NUMBER_INCORRECTLY("银行卡验证信息及身份信息或手机号输入不正确，验证失败","RD000513"),
    ACCOUNT_BIND_BANK_CARD_NOT_SUPPORT_THE_BUSINESS("您的银行卡暂不支持该业务，请向您的银行或95516咨询","RD000515"),
    ACCOUNT_BIND_BANK_CARD_NON_AUTHENTICATION_PAYMENT("银行卡未开通认证支付","RD000524"),
    ACCOUNT_BIND_BANK_CARD_CT_RECEIVING_TIMEOUT("CT接收超时","RD000537"),
    ACCOUNT_UNBIND_BANK_CARD_CUSTOMER_NUMBER_MISMATCH("客户号不匹配","RD1010607"),
    ACCOUNT_UNBIND_BANK_CARD_CARD_NUMBER_HAD_TIED_UP("该卡号已解绑","RD000014"),
    ACCOUNT_CHANGE_MOBILE_PHONE_HAS_CLAIMED("该手机已申领过电子账号","RD000317"),
    ACCOUNT_ACCOUNT_MOBILE_OPERATION_OPTION_ERROR("操作选项错误","RD000074"),
    ACCOUNT_BINDING_LIST_CARD_NUMBER_DOES_NOT_EXIST("卡号不存在","RD000094"),
    ACCOUNT_FIND_ACCOUNT_BY_ID_LENGTH_ILLEGAL("证件号码长度非法","RD000061"),
    ACCOUNT_FIND_ACCOUNT_BY_ID_INCORRECT_ID_NUMBER("证件号码不正确","RD000089"),
    ACCOUNT_FIND_ACCOUNT_BY_ID_INVALID_CERTIFICATE_TYPE("证件类型无效","RD000060"),
    ACCOUNT_FIND_ACCOUNT_BY_ID_CHECK_BIT_ERROR("身份证(18位)校验位错误","RD000063"),
    ACCOUNT_FIND_ACCOUNT_BY_MOBILE_INPUT_PHONE("请输入手机号","RD000107"),
    ACCOUNT_FIND_ACCOUNT_BY_MOBILE_PHONE_TYPE_WRONG("手机号码格式不正确","T130016"),
    ACCOUNT_ACCOUNT_CREDITS_THE_RECORD_STATE_QUERY_ILLEGAL("查询的记录状态非法","RD000203"),

    ASSETS_ASSETS_ENROLL_INTEREST_MONTHLY_PAYMENT_IS_EMPTY("利息每月支付日为空","RD000189"),
    ASSETS_ASSETS_ENROLL_ANNUAL_RATE_OF_RETURN_IS_EMPTY("年化收益率为空","RD000191"),
    ASSETS_ASSETS_ENROLL_PROJECT_AND_PRODUCT_ISSUER_UNDERLYING("请输入项目期限（5846）/产品发行方与标的信息不一致（5805）","RD000388"),
    ASSETS_ASSETS_ENROLL_UNDERLYING_INFORMATION_UNDERLYING("标的信息已经存在不允许录入（5846）/预期年化率与标的信息不一致（5805）","RD000391"),
    ASSETS_ASSETS_ENROLL_THE_PLATFORM_ACCOUNT_CANNOT_BE_RECORDED("平台账户不能进行标的录入","RD000435"),

    ASSETS_ASSETS_REVOKE_PLEASE_CONTACT_THE_ISSUING_BANK("请联系发卡行","RD000001"),
    ASSETS_ASSETS_REVOKE_AMOUNT_TRANSACTION_NOT_MATCH_THE_ORIGINAL_TRANSACTION("交易金额与原交易不匹配","RD000005"),
    ASSETS_ASSETS_REVOKE_DUPLICATION("重复交易","RD000027"),


    TRANSACTION_REVOKE_BID_THE_AMOUNT_OF_THE_BID_IS_NOT_IN_CONFORMITY("投标金额与原交易记录不符","RD000198"),
    TRANSACTION_REVOKE_BID_ONLY_PURCHASE_TO_BE_REVOKED("只有状态是申购中的记录才能撤销","RD000199"),
    TRANSACTION_REVOKE_BID_RECORDS_DO_NOT_EXIST("投标记录不存在","RD000170"),
    TRANSACTION_REVOKE_BID_INSUFFICIENT_FREEZING_AMOUNT("冻结金额不足","RD000371"),
    TRANSACTION_REVOKE_CREDIT_TRANSFER_AUTOMATIC_TENDER_HAS_CANCELLED("自动投标签约记录已取消","RD000179"),

    MARKETING_MONEY_DISPATCH_UNSUPPORTED_FUNCTIONS("不支持的功能","RD000012"),
    MARKETING_MONEY_DISPATCH_CREDIT_IS_RUNNING_LOW("余额不足","RD000017"),
    MARKETING_MONEY_REVOKE_UNLAWFUL_DATE("日期非法","RD000004"),
    MARKETING_MONEY_REVOKE_CAN_NOT_FIND_THE_ORIGINAL_TRANSACTION("找不到原交易","RD000008"),


    REQUEST_ERROR("请求错误","400"),
    IDENTITY_AUTHENTICATION_ERROR("身份认证错误","401"),
    LACK_OF_AUTHORITY("权限不足","403"),
    THE_SERVICE_THAT_HAS_ACCESSED_DOES_NOT_EXIST("访问的服务不存在","404"),
    ACCESS_METHOD_IS_NOT_ALLOWED("访问方法不允许","405"),
    JSON_FORMAT_IS_NOT_CORRECT("JSON格式不正确","406"),
    THE_SERVICE_HAS_BEEN_DISABLED("该服务已经禁用","410"),
    LIMIT_OF_REQUEST_TIMES("超过请求次数限制","429"),
    SERVER_INTERNAL_ERROR("服务器内部错误","500"),
    THE_SERVER_IS_CURRENTLY_UNAVAILABLE("服务器当前不可用","503"),

    // 自定义异常
    CUSTOM_SING_INVALID("返回结果签名不一致", "C100");

    private String message;
    private String code;

    JushiErrorCode(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
