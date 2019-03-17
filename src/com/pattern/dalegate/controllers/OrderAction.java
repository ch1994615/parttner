package com.pattern.dalegate.controllers;

/**
 * @author jackChen
 * @date 2019/3/3
 */
public class OrderAction {
    public String doSomthing(String name){
        System.out.println("orderAction"+name);
        return "orderAction";
    }
}
