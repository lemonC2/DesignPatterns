package com.zss.java.proxypattern;

/**
 * 代理模式：定义了realSubject和proxy的公用接口，目的是为了在任何使用realSubject的地方都能使用proxy
 * @author lemon
 * @date 2018/4/16 15:53
 */
public interface Subject {
    public void request();
}
