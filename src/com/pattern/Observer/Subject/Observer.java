package com.pattern.Observer.Subject;

import com.pattern.Observer.core.Event;

/**
 * @author jackChen
 * @date 2019/3/5
 *
 * 观察者（observer）
 */
public class Observer {

    public void add(Event e){
        System.out.println("==============增加================\n"+e);
    }

    public void move(Event e){
        System.out.println("==============删除================\n"+e);
    }
}
