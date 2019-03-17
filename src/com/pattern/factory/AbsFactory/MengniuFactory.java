package com.pattern.factory.AbsFactory;

import com.pattern.factory.Mengniu;
import com.pattern.factory.Milk;

/**
 * Created by admin on 2019/1/29.
 */
public class MengniuFactory implements Factorys{
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
