package com.pattern.singleton;

import com.pattern.singleton.register.RegisterSingleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author jackChen
 * @date 2019/2/18
 * 单例测试(线程安全测试)
 */
public class SingletonTest {

    public static void main(String[] args) {
        int count = 200;
        CountDownLatch latch = new CountDownLatch(count);//发令枪 保证该线程等待当 count == 0时 同时执行

        for (int i = 0;i<count;i++){
            new Thread(){//线程跑起来
                @Override
                public void run() {
                    try {
                        latch.await();
                        Object obj =  RegisterSingleton.getInstance();
                        System.out.println(System.currentTimeMillis()+":"+obj);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            latch.countDown();
        }
    }
}
