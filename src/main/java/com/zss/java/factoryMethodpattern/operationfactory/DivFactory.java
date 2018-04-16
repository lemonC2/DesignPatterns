package com.zss.java.factoryMethodpattern.operationfactory;

import com.zss.java.factoryMethodpattern.model.AbstractOperation;
import com.zss.java.factoryMethodpattern.IFactory;
import com.zss.java.factoryMethodpattern.operation.OperationDiv;

/**
 * 工厂方法模式：除法工厂
 * @author lemon
 * @date 2018/4/16 17:26
 */
public class DivFactory implements IFactory {
    @Override
    public AbstractOperation createOperation() {
        return new OperationDiv();
    }
}
