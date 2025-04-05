package com.ywy144.ywyMallCommon.object;

import lombok.Data;
import java.io.Serializable;

@Data
public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = 8288018387500965228L;
    private String code;
    private String msg;
    private T data;

    // constructor
    public BaseResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    // factory
    public static <T> BaseResult<T> success() {
        return new BaseResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
    }

    public static <T> BaseResult<T> success(T data) {
        return new BaseResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> BaseResult<T> success(String msg, T data) {
        return new BaseResult<>(ResultCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> BaseResult<T> failure(String code, T data) {
        ResultCode resultCode = ResultCode.getByCode(code);
        return new BaseResult<T>(code, resultCode.getMessage(), data);
    }

    public static <T> BaseResult<T> failure(String code, String msg, T data) {
        return new BaseResult<T>(code, msg, data);
    }

    public boolean isSuccess() {
        return ResultCode.SUCCESS.getCode().equals(this.code);
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
