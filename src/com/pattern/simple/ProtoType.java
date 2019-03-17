package com.pattern.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackChen
 * @date 2019/2/24
 * 原型模式(浅拷贝 只是把属性的地址拷贝过来了 浅拷贝)
 */
public class ProtoType implements Cloneable{

    public String name;

    public List list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
