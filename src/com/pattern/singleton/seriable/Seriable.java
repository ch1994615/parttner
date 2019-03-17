package com.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @author jackChen
 * @date 2019/2/18
 * 序列化与反序列化之间的线程安全问题
 */
public class Seriable implements Serializable{
    private static final Seriable s = new Seriable();

    private Seriable(){

    }
    public  static Seriable getInstance(){
        return s;
    }

    private Object readResolve(){
        return s;
    }
}
