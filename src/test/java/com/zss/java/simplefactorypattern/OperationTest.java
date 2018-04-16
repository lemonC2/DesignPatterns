package com.zss.java.simplefactorypattern;

import com.zss.java.simplefactorypattern.factory.OperationFactory;
import com.zss.java.simplefactorypattern.model.Operation;
import com.zss.java.simplefactorypattern.operator.OperationAdd;

/**
 * 简单工程模式运算测试
 * @author lemon
 * @date 2018/4/16 10:14
 */
public class OperationTest {
    public static void main(String[] args) {
        Operation operation = new OperationAdd();
        operation = OperationFactory.createOperate("+");
        operation.setNumberA(3);
        operation.setNumberB(1);
        double result = operation.getNumberA() + operation.getNumberB();
        System.out.println("加法计算结果："+result);
    }
}
