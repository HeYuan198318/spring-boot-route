package com.javatrip.exception;

import lombok.*;

/**
 * @Author 公众号：Java旅途
 * @Description 自定义枚举类，响应状态码
 * @Date 2020-08-18 11:07
 */
@Getter
public enum CodeEnum {

    SUCCESS(0,"请求成功"),
    ERROR(500,"未知异常"),
    ERROR_EMPTY_RESULT(1001,"查询结果为空"),
    ERROR_INCOMPLETE_RESULT(1002,"请求参数不合法");

    private int code;
    private String message;
    CodeEnum(int code,String message){
        this.code = code;
        this.message = message;
    }
}
