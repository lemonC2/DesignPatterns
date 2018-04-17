package com.zss.java.bridgepattern;

/**
 * 具体实现A类
 * @author lemon
 * @date 2018/4/17 19:42
 */
public class ImplementorA extends Implementor {
    @Override
    public void operationImp() {
        System.out.println("具体实现A方法执行！");
    }
}
