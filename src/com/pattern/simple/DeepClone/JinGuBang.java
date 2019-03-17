package com.pattern.simple.DeepClone;


import java.io.Serializable;

/**
 * @author jackChen
 * @date 2019/2/24
 */
public class JinGuBang implements Serializable{
    private int h;
    private int d;
    public void biger(){
        h *= 2;
        d *= 2;
    }

    public void smaller(){
        h /= 2;
        d /= 2;

    }
}
