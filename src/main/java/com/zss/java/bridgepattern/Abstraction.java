package com.zss.java.bridgepattern;

/**
 * 抽象化类
 * @author lemon
 * @date 2018/4/17 19:42
 */
public abstract class Abstraction {

    protected Implementor ipml;

    protected Abstraction(Implementor ipml) {
        this.ipml = ipml;
    }
    public abstract void operation();
}
