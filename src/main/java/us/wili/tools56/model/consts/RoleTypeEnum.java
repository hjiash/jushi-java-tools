package us.wili.tools56.model.consts;

/**
 * Created by lhyue on 2018/3/20.
 */
public enum RoleTypeEnum {
    LEND_ROLE("1", "出借角色"),
    LOAN_ROLE("2", "借款角色"),
    COMPENSATORY_ROLE("3", "代偿角色")
    ;

    private String code;
    private String desc;

    private RoleTypeEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static RoleTypeEnum get(String code) {
        for (RoleTypeEnum roleTypeEnum : RoleTypeEnum.values()){
            if (roleTypeEnum.getCode().equals(code)){
                return roleTypeEnum;
            }
        }

        return LEND_ROLE;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
