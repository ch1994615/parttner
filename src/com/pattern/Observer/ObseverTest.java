package com.pattern.Observer;

import com.pattern.Observer.Subject.Observer;
import com.pattern.Observer.Subject.Publish;
import com.pattern.Observer.core.Event;

import java.lang.reflect.Method;

/**
 * @author jackChen
 * @date 2019/3/5
 */
public class ObseverTest {

    public static void main(String[] args) {
        try {
            Observer observer = new Observer();
            Method callback = Observer.class.getMethod("add",new Class<?>[]{Event.class});//反射

            Publish publish = new Publish();
            publish.addListener(EventType.ON_ADD,observer,callback);

            publish.add();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
