package com.cs.ObversblerDemo.Observable;

import java.util.Observable;

/**
 * @Author chens
 * @create 2019/9/17 17:08
 */
public class Observatory extends ObservableBase {
    @Override
    public void notifyObservers() {
        System.out.println("执行通知方法-----");
        System.out.println("天气发生改变-----");
        super.notifyObservers();
    }
}
