package com.pattern.simple;

/**
 * @author jackChen
 * @date 2019/2/24
 *
 */
public class CloneTest {
    public static void main(String[] args) {
        ProtoType p = new ProtoType();
        p.name = "tome";
        p.list.add(123);

        System.out.println(p);
        System.out.println("p.list:"+p.list);
        try {
            ProtoType p1 = (ProtoType) p.clone();
            System.out.println(p1);
            System.out.println("p1.list:"+p1.list);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
