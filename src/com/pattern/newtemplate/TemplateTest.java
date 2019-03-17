package com.pattern.newtemplate;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public class TemplateTest {


    public static void main(String[] args) {
        Template template = new ExecuteTemplate();
        template.isOpen = false;
        template.execute();

        System.out.println("----------------");
        Template template1 = new ExecuteTemplate();
        template1.isOpen = true;
        template1.execute();
    }
}
