package com.zss.java.bridgepattern;

/**
 * 具体实现B类
 * @author lemon
 * @date 2018/4/17 19:42
 */
public class ImplementorB  extends Implementor{
    @Override
    public void operationImp() {
        System.out.println("具体实现B方法执行！");
    }
}
