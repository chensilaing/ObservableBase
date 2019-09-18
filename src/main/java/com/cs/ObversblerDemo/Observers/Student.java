package com.cs.ObversblerDemo.Observers;

/**
 * @Author chens
 * @create 2019/9/17 17:23
 */
public class Student implements Observer {
    public void update() {
        System.out.println("执行Student动作");
    }

    @Override
    public String toString() {
        return "Student";
    }
}
