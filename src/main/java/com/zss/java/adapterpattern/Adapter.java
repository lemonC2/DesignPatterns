package com.zss.java.adapterpattern;

/**
 * 适配器类
 * @author lemon
 * @date 2018/4/17 16:10
 */
public class Adapter implements Target {
    @Override
    public void request() {
        Adapterd adapterd = new Adapterd();
        adapterd.specificRequest(); //将target中的方法转掉用其他的方法
    }
}
