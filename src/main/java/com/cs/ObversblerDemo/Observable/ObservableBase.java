package com.cs.ObversblerDemo.Observable;

import com.cs.ObversblerDemo.Observers.Observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Vector;

/**
 * @Author chens
 * @create 2019/9/17 14:48
 */
public class ObservableBase  {

    //创建观察者列表
    private static ArrayList<Observer> obs=new ArrayList<Observer>();

    //提供观察者列表的方法
    public synchronized void addObserver(Observer o) {
        obs.add(o);
        System.out.println("添加观察者"+o);
    }
    public void notifyObservers() {
        //判断当前obs列表是为空
            if (obs!=null&&obs.size()==0){
                //初始化列表操作
                System.out.println("当前观察者列表为空，请添加");
            }
        for (Observer ob : obs) {
            ob.update();//执行更新操作
        }

    }
    //移除全部的观察者列表
    public synchronized void deleteObservers() {
        obs.removeAll(obs);
    }
    //移除单个观察者列表

    public synchronized void deleteObservers(Observer o) {
        obs.remove(o);
    }
}
