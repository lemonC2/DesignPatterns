package com.zss.java.prototypePattern;

/**
 * 原型模式：具体原型类
 * @author lemon
 * @date 2018/4/16 19:12
 */
public class ConcretePrototypeOne implements Prototype {

    @Override
    public Object clone() {
        //最基本的克隆方式，新建一个自身对象
        Prototype prototype = new ConcretePrototypeOne();
        return prototype;
    }
}
