package com.pattern.Adapter.Login;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public class ResultMsg {
    int code;
    String msg;
    public ResultMsg(){

    }
    public ResultMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
