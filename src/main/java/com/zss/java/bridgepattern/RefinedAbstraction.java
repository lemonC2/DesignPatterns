package com.zss.java.bridgepattern;

/**
 * 被提炼的抽象化类
 * @author lemon
 * @date 2018/4/17 19:43
 */
public class RefinedAbstraction extends Abstraction{

    protected RefinedAbstraction(Implementor ipml) {
        super(ipml);
    }

    @Override
    public void operation() {
        ipml.operationImp();
    }
}
