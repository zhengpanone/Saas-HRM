package com.zp.company.enums;

/**
 * NameValueEnum
 * 带有枚举值以及枚举名称的枚举接口(可以使用{@link EnumUtils}中的方法)
 *
 * @author zhengpanone
 * @since 2022-03-29
 */
public interface NameValueEnum<T> extends ValueEnum<T> {
    /**
     * 获取枚举名称
     * @return 枚举名
     */
    String getName();
}
