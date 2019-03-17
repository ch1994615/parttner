package com.pattern.newtemplate;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public abstract class Template {
    boolean isOpen;
//    abstract boolean isOpen(boolean flag);
    final  void one(){
        System.out.println(1);
    }
    final void tow(){
        System.out.println(2);
    }
    abstract void three();

    void execute(){
        one();
        tow();
        if (isOpen) {
            three();
        }

    }
}
