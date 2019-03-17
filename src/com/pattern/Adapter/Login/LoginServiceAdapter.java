package com.pattern.Adapter.Login;

/**
 * Created by admin on 2019/3/16.
 */
public interface LoginServiceAdapter {
    ResultMsg loginForQQ(String qq,String tel);
    ResultMsg loginForWx(String wx);
}
