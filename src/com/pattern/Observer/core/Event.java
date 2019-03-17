package com.pattern.Observer.core;

import java.lang.reflect.Method;

/**
 * @author jackChen
 * @date 2019/3/5
 */
public class Event {
    private Object objSource;//调用对象 事件源
    private Method callback;//回调方法
    private Object target;//目标对象（观察者）
    private String trigger; //触发条件

    public Event(Object target,Method callback) {
        this.callback = callback;
        this.target = target;
    }

    public Object getObjSource() {
        return objSource;
    }

    public Event setObjSource(Object objSource) {
        this.objSource = objSource;
        return this;
    }

    public Method getCallback() {
        return callback;
    }

    public Event setCallback(Method callback) {
        this.callback = callback;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public Event setTarget(Object target) {
        this.target = target;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "objSource=" + objSource +
                ", callback=" + callback +
                ", target=" + target +
                ", trigger='" + trigger + '\'' +
                '}';
    }
}
