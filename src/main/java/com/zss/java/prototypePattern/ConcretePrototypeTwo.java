package com.zss.java.prototypePattern;

/**
 * 原型模式：具体原型类
 * @author lemon
 * @date 2018/4/16 19:12
 */
public class ConcretePrototypeTwo implements Prototype {
    @Override
    public Object clone() {

        Prototype prototype = new ConcretePrototypeTwo();
        return prototype;
    }
}
