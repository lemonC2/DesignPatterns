package com.zss.java.factoryMethodpattern.operationfactory;

import com.zss.java.factoryMethodpattern.model.AbstractOperation;
import com.zss.java.factoryMethodpattern.IFactory;
import com.zss.java.factoryMethodpattern.operation.OperationAdd;

/**
 * 工厂方法模式：加法工厂
 * @author lemon
 * @date 2018/4/16 17:26
 */
public class AddFactory implements IFactory {
    @Override
    public AbstractOperation createOperation() {
        return new OperationAdd();
    }
}
