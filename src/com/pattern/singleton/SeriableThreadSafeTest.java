package com.pattern.singleton;

import com.pattern.singleton.seriable.Seriable;

import java.io.*;

/**
 * @author jackChen
 * @date 2019/2/18
 * 序列化线程安全测试
 */
public class SeriableThreadSafeTest {

    public static void main(String[] args) {
        Seriable s = null;
        Seriable s2 = Seriable.getInstance();

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream("seriable.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            System.out.println(s2);

            fis = new FileInputStream("seriable.obj");
            ois = new ObjectInputStream(fis);
            s = (Seriable) ois.readObject();
            System.out.println(s);
            System.out.println(s == s2);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                oos.close();
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
