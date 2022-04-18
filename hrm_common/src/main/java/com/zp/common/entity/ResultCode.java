package com.zp.common.entity;

//import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/06 20:24.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 * 公共返回码
 *  成功：10000
 *  失败：10001
 *  未登录：10002
 */
@Getter
public enum ResultCode {
    // 系统错误返回码
/*    SUCCESS(HttpStatus.OK, HttpStatus.OK.value(), "OK"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, 400, "Bad Request"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 500, "Internal Server Error");*/

    SUCCESS(true, 10000, "操作成功！"),
    //---系统错误返回码-----
    FAIL(false, 10001, "操作失败"),
    UNAUTHENTICATED(false, 10002, "您还未登录"),
    UNAUTHORISE(false, 10003, "权限不足"),
    SERVER_ERROR(false, 99999, "抱歉，系统繁忙，请稍后重试！");


    // 用户操作返回码
    // 企业操作返回码
    // 权限操作返回码
    // 其他操作返回码
    /**
     * 操作是否成功
     */
    boolean success;
    /**
     * 业务码
     */
    Integer code;
    /**
     * 业务信息描述
     */
    String message;

    ResultCode(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

}
