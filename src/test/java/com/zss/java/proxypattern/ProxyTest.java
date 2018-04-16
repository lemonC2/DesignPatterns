package com.zss.java.proxypattern;

/**
 * 代理模式：客户端测试类
 * @author lemon
 * @date 2018/4/16 16:01
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = new Proxy(realSubject);
        subject.request();
    }
}
