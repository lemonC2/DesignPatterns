package com.zss.java.factoryMethodpattern.operation;

import com.zss.java.factoryMethodpattern.model.AbstractOperation;
import com.zss.java.factoryMethodpattern.OperationFactory;

/**
 * 工厂方法模式：加法计算类
 * @author lemon
 * @date 2018/4/16 17:21
 */
public class OperationAdd extends AbstractOperation implements OperationFactory {
    @Override
    public double getResult() {

        double result = 0L;
        return numberA + numberB;

    }
}
