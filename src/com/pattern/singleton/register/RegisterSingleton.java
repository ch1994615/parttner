package com.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jackChen
 * @date 2019/2/18
 * 注册式单例（map型）
 */
public class RegisterSingleton {


    private RegisterSingleton(){

    }
    private static Map<String,Object> registerMap = new ConcurrentHashMap<String,Object>();//线程安全的

    public static RegisterSingleton getInstance(){
        String name = RegisterSingleton.class.getName();
        if(registerMap.get(name) == null){//map里面不存在这样的实例
            try {
                registerMap.put(name,Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return (RegisterSingleton) registerMap.get(name);

    }
}
