package com.ishui.testOb;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: [一句话描述该类的功能]
 * @Author: [李晓晖]
 */
public class Study implements Observer {
    String name;

    public Study(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Teacher t=(Teacher)o;
        System.out.println(name + "正在交" + t.name+ " " + arg);
    }
}
