package com.zss.java.factoryMethodpattern.operation;

import com.zss.java.factoryMethodpattern.model.AbstractOperation;

/**
 * 工厂方法模式：减法计算类
 * @author lemon
 * @date 2018/4/16 17:23
 */
public class OperationMul extends AbstractOperation {

    @Override
    public double getResult() {
        double result = 0L;
        result = numberA - numberB;
        return result;
    }
}
