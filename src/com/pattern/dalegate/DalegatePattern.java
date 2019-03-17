package com.pattern.dalegate;

import com.pattern.dalegate.controllers.MenmerAction;
import com.pattern.dalegate.controllers.OrderAction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jackson Chen
 * @date 2019/3/3
 * 委派模式
 * 是 静态代理和 策略模式的整合
 * 非23种设计模式行列
 * 策略模式  重过程
 * 委派模式  重结果
 *
 * 静态代理 和 委派模式 有点像
 */
public class DalegatePattern{

    List<Handler> handlers;


    public DalegatePattern(){
        handlers = new ArrayList<Handler>();

        try {
            Class<?> clazz = MenmerAction.class;
            handlers.add(new Handler()
                    .setUrl("/getMemberById.do")
                    .setObj(clazz.newInstance())
                    .setMethod(clazz.getMethod("doSomthing",new Class[]{String.class})));
            clazz = OrderAction.class;
            handlers.add(new Handler()
                    .setUrl("/getOrderById.do")
                    .setObj(clazz.newInstance())
                    .setMethod(clazz.getMethod("doSomthing",new Class[]{String.class})));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void doService(String url){
//        doDispatch(request,response);
        doDispatch(url);
    }

    public void doDispatch(String url){
//        String url = request.getRequestURI();
        Handler handler = null;
        for (Handler handler1 : handlers){
            if(url.equals(handler1.getUrl())){
                handler = handler1;
                break;
            }
        }
        try {
            handler.getMethod().invoke(handler.getObj(),url);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
//        doDispatchHandler();
    }


    class Handler{
        private String url;
        private Object obj;
        private Method method;

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }

        public Object getObj() {
            return obj;
        }

        public Handler setObj(Object obj) {
            this.obj = obj;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }
    }
}
