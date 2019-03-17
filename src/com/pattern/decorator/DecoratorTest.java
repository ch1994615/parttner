package com.pattern.decorator;

import com.pattern.decorator.impl.StudentServiceImpl;
import com.pattern.decorator.impl.StudentServiceImplNew;

/**
 * @author jackChen
 * @date 2019/3/4
 * 装饰者模式（覆盖和扩展）
 * 他和适配器模式很像（adapter）
 * 适配器模式重在兼容
 */
public class DecoratorTest {
    public static void main(String[] args) {
        StudentServiceImplNew iStudentServiceImplNew = new StudentServiceImplNew(new StudentServiceImpl());

        System.out.println(iStudentServiceImplNew.wechatLogin());
    }

}
