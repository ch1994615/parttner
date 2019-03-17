package com.pattern.Adapter.Login;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public class Login {
     ResultMsg login(String userName,String pwd){
         System.out.println("普通登录");
        return new ResultMsg();
     }

}
