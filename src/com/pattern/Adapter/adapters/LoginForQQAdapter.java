package com.pattern.Adapter.adapters;

import com.pattern.Adapter.Login.ResultMsg;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public class LoginForQQAdapter implements LoginAdapter{

    @Override
    public boolean support(Object adapter) {

        if(adapter instanceof LoginForQQAdapter){
            return true;
        }
        return false;
    }

    @Override
    public ResultMsg login(Object [] values) {
        System.out.println("qq登录");
        return new ResultMsg();
    }
}
