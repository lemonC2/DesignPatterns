package com.zss.java.proxypattern;

/**
 * 代理模式：报错一个引用使得代理可以访问实体，并提供一个与subject的接口相同的接口，这样代理就可用来代替实体
 * @author lemon
 * @date 2018/4/16 15:55
 */
public class Proxy implements Subject{
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public void request() {
        System.out.println("调用真实对象");
        realSubject.request();
    }
}
