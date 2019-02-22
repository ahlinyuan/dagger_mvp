package com.ahlinyuan.dagger.model;

/**
 * creataed by ahlinyuan
 * on 2019/2/21
 */
public class BaseModel {

    int code;
    String status;
    String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isOk() {
        return code == 0;
    }
}
