package com.zss.java.factoryMethodpattern.operationfactory;

import com.zss.java.factoryMethodpattern.model.AbstractOperation;
import com.zss.java.factoryMethodpattern.IFactory;
import com.zss.java.factoryMethodpattern.operation.OperationSub;

/**
 * 工厂方法模式：减法工厂
 * @author lemon
 * @date 2018/4/16 17:26
 */
public class SubFactory implements IFactory {
    @Override
    public AbstractOperation createOperation() {
        return new OperationSub();
    }
}
