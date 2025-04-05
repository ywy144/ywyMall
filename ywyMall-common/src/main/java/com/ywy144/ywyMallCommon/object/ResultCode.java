package com.ywy144.ywyMallCommon.object;

import lombok.Getter;

@Getter
public enum ResultCode {
    FAILED("-1", "操作失败"),
    SUCCESS("200", "成功"),
    ERROR("500", "服务器内部错误"),
    BAD_REQUEST("400", "请求参数错误"),
    UNAUTHORIZED("401", "未授权"),
    FORBIDDEN("403", "禁止访问"),
    NOT_FOUND("404", "资源未找到"),
    TIMEOUT("408", "超时"),
    OTHER("999", "其他错误");

    private final String code;
    private final String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultCode getByCode(String code) {
        for (ResultCode result : ResultCode.values()) {
            if (result.code.equals(code)) {
                return result;
            }
        }
        return OTHER;
    }
}
