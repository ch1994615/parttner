package com.pattern.decorator.impl;

import com.pattern.decorator.IStudentService;
import com.pattern.decorator.ResultMsg;

/**
 * @author jackChen
 * @date 2019/3/4
 */
public class StudentServiceImpl implements IStudentService{
    @Override
    public ResultMsg login() {
        return new ResultMsg().setCode(1).setMsg("登录成功").build();
    }

    @Override
    public ResultMsg register() {
        return new ResultMsg().setCode(2).setMsg("注册成功").build();
    }
}
