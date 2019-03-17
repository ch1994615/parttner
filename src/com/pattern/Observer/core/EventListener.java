package com.pattern.Observer.core;

import com.pattern.Observer.EventType;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jackChen
 * @date 2019/3/5
 */
public class EventListener {

    Map<Enum,Event> events = new HashMap<Enum,Event>();

    public void addListener(EventType eventType, Object target, Method callback){

        events.put(eventType,new Event(target, callback));
    }


    public void trigger(Event event){
        try {
            event.setObjSource(this);
            event.getCallback().invoke(event.getTarget(),event);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public void trigger(EventType call){
        if(!events.containsKey(call)){
            return;
        }
        trigger(events.get(call).setTrigger(call.toString()));
    }

}
