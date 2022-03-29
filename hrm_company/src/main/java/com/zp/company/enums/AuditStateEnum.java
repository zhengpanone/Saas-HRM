package com.zp.company.enums;

import lombok.Data;

/**
 * AuditStateEnum
 *
 * @author zhengpanone
 * @since 2022-03-29
 */
public enum AuditStateEnum {
    // 未审核
    UN_AUDIT_STATE("0", "未审核", "unAuditState"),
    // 已审核
    AUDIT_STATE("1", "已审核", "autditState");
    /**
     * 保存在数据库中的值
     */
    private String code;
    /**
     * 一般页面显示的内容
     */
    private String name;
    /**
     * 一般页面显示的英文内容
     */
    private String enName;

    AuditStateEnum(String code, String name, String enName) {
        this.code = code;
        this.name = name;
        this.enName = enName;
    }

    public String getCode() {
        return code;
    }

    public String getName(){
        return name;
    }
    public String getEnName(){
        return enName;
    }

}
