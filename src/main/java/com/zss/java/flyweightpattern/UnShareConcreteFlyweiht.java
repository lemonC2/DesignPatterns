package com.zss.java.flyweightpattern;

/**
 * 非享元具体享元类
 * @author lemon
 * @date 2018/4/19 17:19
 */
public class UnShareConcreteFlyweiht extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("非享元的具体Flyweight:"+extrinsicstate);
    }
}
