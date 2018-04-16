package com.zss.java.proxypattern;

/**
 * 代理模式：定义proxy代表的真实实体
 * @author lemon
 * @date 2018/4/16 15:56
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求！");
    }
}
