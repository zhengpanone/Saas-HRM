package com.zp.company.enums;

/**
 * ValueEnum
 *
 * @author zhengpanone
 * @since 2022-03-29
 */
public interface ValueEnum<T> {
    /**
     * 获取枚举值
     * @return 枚举值
     */
    T getValue();
}
