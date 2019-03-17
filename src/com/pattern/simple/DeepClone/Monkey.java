package com.pattern.simple.DeepClone;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jackChen
 * @date 2019/2/24
 * 深度克隆模式实现 原型模式 采用序列化与反系列化的方式  但是 原型模式 还可以使用反射 使用循环方式实现原型模式
 */
public class Monkey implements Serializable{
    private Date birthday;

    public Monkey(){
        this.birthday = new Date();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
