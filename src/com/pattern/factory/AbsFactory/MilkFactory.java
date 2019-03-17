package com.pattern.factory.AbsFactory;

import com.pattern.factory.Milk;
import com.pattern.factory.Telunsu;

/**
 * Created by admin on 2019/1/29.
 */
public class MilkFactory extends MilkAbsFactory{
    @Override
    public Telunsu getTelunsu() {
        return new Telunsu();
    }

    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMilk();
    }
}
