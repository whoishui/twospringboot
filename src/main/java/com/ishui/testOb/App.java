package com.ishui.testOb;

/**
 * @Description: [一句话描述该类的功能]
 * @Author: [李晓晖]
 */
public class App {
    public static void main(String[] args) {
        System.out.println("开始...");
        Study s1= new Study("张三");
        Study s2= new Study("李四");
        Teacher t = new Teacher("老王");
        t.addObserver(s1);
        t.addObserver(s2);
        t.say();
        System.out.println("我这里增加了一行");
    }
}
