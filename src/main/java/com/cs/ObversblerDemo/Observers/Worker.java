package com.cs.ObversblerDemo.Observers;

import com.cs.ObversblerDemo.Observable.ObservableBase;
import com.cs.ObversblerDemo.Observable.Observatory;

import java.util.ArrayList;

/**
 * @Author chens
 * @create 2019/9/17 17:23
 */
public class Worker implements Observer {
    public void update() {
        System.out.println("执行Worker动作");
    }

    @Override
    public String toString() {
        return "Student";
    }


}
