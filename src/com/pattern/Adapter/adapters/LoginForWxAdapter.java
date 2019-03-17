package com.pattern.Adapter.adapters;

import com.pattern.Adapter.Login.ResultMsg;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public class LoginForWxAdapter implements LoginAdapter{

    @Override
    public boolean support(Object adapter) {
        if(adapter instanceof LoginForWxAdapter){
            return true;
        }
        return false;
    }

    @Override
    public ResultMsg login(Object [] values) {
        System.out.println("微信登录");
        return new ResultMsg();
    }
}
