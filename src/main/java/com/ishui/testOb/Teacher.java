package com.ishui.testOb;

import java.util.Observable;

/**
 * @Description: [一句话描述该类的功能]
 * @Author: [李晓晖]
 */
public class Teacher extends Observable {
    String name;
    public Teacher(String name) {
        this.name = name;
    }

    public void say(){
        setChanged();
        notifyObservers("要交作业了...");
    }
}
