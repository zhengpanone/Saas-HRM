package com.zp.company.enums;

import lombok.Data;

/**
 * AuditStateEnum
 *
 * @author zhengpanone
 * @since 2022-03-29
 */
public enum AuditStateEnum implements NameValueEnum<String> {
    // 未审核
    UN_AUDIT_STATE("0", "未审核"),
    // 已审核
    AUDIT_STATE("1", "已审核");
    /**
     * 保存在数据库中的值
     */
    private final String value;
    /**
     * 一般页面显示的内容
     */
    private final String name;


    AuditStateEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }

}
