package com.ht.allhere.common;

import lombok.Getter;

@Getter
public enum ResultCode {

    USER_PWD_EMPTY_ERROR(1001, "用户名或密码为空"),
    USER_PWD_WRONG_ERROR(1002, "用户名或密码错误"),

    USER_ADD_WRONG_ERROR(2001, "用户添加失败"),

    FILE_UPLOAD_ERROR(3001,"文件上传失败"),

    SUCCESS(1, "成功");
    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
