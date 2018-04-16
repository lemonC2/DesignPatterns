package com.zss.java.prototypePattern;

/**
 * 原型模式：客户端类
 * @author lemon
 * @date 2018/4/16 19:12
 */
public class Client {
//申明一个原型接口的对象
    private Prototype prototype;

    /**
     * 构造方法，传入需要使用的原型接口对象
     * @param prototype
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public void operation(Prototype p){
        //需要创建原型接口的对象
        Prototype prototype = (Prototype) p.clone();
    }
}
