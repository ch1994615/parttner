package com.pattern.factory.AbsFactory;

import com.pattern.factory.Milk;
import com.pattern.factory.Yili;

/**
 * Created by admin on 2019/1/29.
 */
public class YiliFactory implements Factorys{
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
