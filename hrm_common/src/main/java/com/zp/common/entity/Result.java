package com.zp.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhengpanone
 * @Description: 返回结果实体类
 * @Date:Created in 2021/07/06 20:21.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
@Data
@NoArgsConstructor
// 非空数据不显示
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {
    private boolean success; //是否成功
    private Integer code; // 返回码
    private String message; // 返回信息
    private T data; // 返回数据

    public Result(ResultCode code) {
        this.success = code.success;
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public Result(ResultCode code, T data) {
        this.success = code.success;
        this.code = code.getCode();
        this.message = code.getMessage();
        this.data = data;
    }

    public Result(Integer code, String message, boolean success) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static Result SUCCESS() {
        return new Result(ResultCode.SUCCESS);
    }

    public static Result ERROR() {
        return new Result(ResultCode.SERVER_ERROR);
    }

    public static Result FAIL() {
        return new Result(ResultCode.FAIL);
    }


}
