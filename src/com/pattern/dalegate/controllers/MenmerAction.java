package com.pattern.dalegate.controllers;

/**
 * @author jackChen
 * @date 2019/3/3
 */
public class MenmerAction {

    public String doSomthing(String name){
        System.out.println("memberAction"+name);
        return "menberAction";
    }
}
