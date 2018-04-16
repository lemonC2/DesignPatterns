package com.zss.java.factoryMethodpattern.operation;

import com.zss.java.factoryMethodpattern.model.AbstractOperation;

/**
 * 工厂方法模式：除法计算类
 * @author lemon
 * @date 2018/4/16 17:23
 */
public class OperationDiv extends AbstractOperation {

    @Override
    public double getResult() {
        double result = 0L;
        if (numberB != 0){
            result = numberA / numberB;
        }else {
            System.out.println("被除数不能为0");
        }
        return result;
    }
}
