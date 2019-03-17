package com.pattern.decorator.impl;

import com.pattern.decorator.IStudentService;
import com.pattern.decorator.IStudentServiceNew;
import com.pattern.decorator.ResultMsg;

/**
 * @author jackChen
 * @date 2019/3/4
 */
public class StudentServiceImplNew implements IStudentServiceNew {


    private IStudentService studentService;
    public StudentServiceImplNew(IStudentService studentService){
        this.studentService = studentService;
    }

    @Override
    public ResultMsg login() {
        return studentService.login();
    }

    @Override
    public ResultMsg register() {
        return studentService.register();
    }

    @Override
    public ResultMsg wechatLogin() {
        return new ResultMsg().setCode(3).setMsg("微信登录成功").build();
    }
}
