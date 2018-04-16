package com.zss.java.factoryMethodpattern;

import com.zss.java.factoryMethodpattern.model.AbstractOperation;
import com.zss.java.factoryMethodpattern.operation.OperationAdd;
import com.zss.java.factoryMethodpattern.operationfactory.AddFactory;

/**
 * @author lemon
 * @date 2018/4/16 17:31
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        AbstractOperation add = new OperationAdd(); // 需要修改其他计算方法，修改这里就可以
        add = factory.createOperation();
        add.setNumberA(12);
        add.setNumberB(12);
        add.getNumberA();
        add.getNumberB();
        double result = add.getResult();
        System.out.println(result);
    }
}
