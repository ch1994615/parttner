package com.pattern.Observer.Subject;

import com.pattern.Observer.EventType;
import com.pattern.Observer.core.EventListener;

/**
 * @author jackChen
 * @date 2019/3/5
 * 观察者模式 （observer）
 */
public class Publish extends EventListener{

    public void add(){
        System.out.println("调用了增加的方法");
        trigger(EventType.ON_ADD);
    }

    public void move(){
        System.out.println("调用了删除掉的方法");
        trigger(EventType.ON_MOVE);
    }

}
