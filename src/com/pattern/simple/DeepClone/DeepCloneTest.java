package com.pattern.simple.DeepClone;

/**
 * @author jackChen
 * @date 2019/2/24
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QitianDaSheng q = new QitianDaSheng();
        System.out.println(q.getBirthday());

        try {
            QitianDaSheng q1 = (QitianDaSheng) q.clone();
            System.out.println(q.j);
            System.out.println(q1.j);
            System.out.println(q.j == q1.j);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
