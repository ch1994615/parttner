package com.pattern.factory.MilkFactory;


import com.pattern.factory.Mengniu;
import com.pattern.factory.Milk;
import com.pattern.factory.Telunsu;
import com.pattern.factory.Yili;

/**
 * Created by admin on 2019/1/29.
 */
public class MilkFactory {
    public Milk getMilk(String objName){
        if("telunsu".equals(objName)){
            return new Telunsu();
        }else if("mengniu".equals(objName)){
            return new Mengniu();
        }else if ("yili".equals(objName)){
            return new Yili();
        }else{
            return null;
        }
    }
}
