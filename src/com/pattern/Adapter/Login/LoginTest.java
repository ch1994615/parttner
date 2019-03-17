package com.pattern.Adapter.Login;

import com.pattern.Adapter.adapters.LoginForQQAdapter;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public class LoginTest {
    public static void main(String[] args) {
        LoginServiceImplAdapter loginServiceImplAdapter = new LoginServiceImplAdapter();


        loginServiceImplAdapter.login("chenhao","123");
        loginServiceImplAdapter.loginForQQ("1179605246","15021108624");
        loginServiceImplAdapter.loginForWx("1179605246chwx");
    }
}
