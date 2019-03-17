package com.pattern.Adapter.Login;

import com.pattern.Adapter.adapters.LoginAdapter;
import com.pattern.Adapter.adapters.LoginForQQAdapter;
import com.pattern.Adapter.adapters.LoginForWxAdapter;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public class LoginServiceImplAdapter extends Login implements LoginServiceAdapter{
    @Override
    public ResultMsg loginForQQ(String qq,String tel) {
//        LoginAdapter loginAdapter = new LoginForQQAdapter();
//        if(loginAdapter.support(loginAdapter)){
//            return loginAdapter.login(new Object[]{qq,tel});
//        }
//        return null;
        return processLogin(new Object[]{qq,tel},LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWx(String wx) {
        LoginAdapter loginAdapter = new LoginForWxAdapter();
        if(loginAdapter.support(loginAdapter)){
            return loginAdapter.login(new Object[]{wx});
        }
        return null;
    }

    private ResultMsg processLogin(Object [] values,Class<? extends LoginAdapter> clazz){

        try{
            LoginAdapter loginAdapter = clazz.newInstance();
            if(loginAdapter.support(loginAdapter)){
                return loginAdapter.login(values);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
}
