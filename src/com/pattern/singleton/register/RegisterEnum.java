package com.pattern.singleton.register;

/**
 * @author jackChen
 * @date 2019/2/18
 * 注册式单例之枚举式
 */
public enum  RegisterEnum {
    instance(){
        private int r = 100;
        private int g = 100;
        private int b = 100;
    },color,white;
    public void getInstance(){

    }

    public static void main(String[] args) {
        System.out.println(RegisterEnum.instance);
    }
}
