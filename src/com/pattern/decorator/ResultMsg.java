package com.pattern.decorator;

/**
 * @author jackChen
 * @date 2019/3/4
 */
public class ResultMsg {
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public ResultMsg setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultMsg setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public ResultMsg build(){
        return this;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
