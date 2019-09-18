package com.cs.ObversblerDemo.Observers;

/**
 * @Author chens
 * @create 2019/9/17 17:47
 */
public class Io {
    private String name = "hjkfn";

    public void Tes(){
        System.out.println("测试");
    }

    @Override
    public String toString() {
        return "Io{" +
                "name='" + name + '\'' +
                '}';
    }
}
