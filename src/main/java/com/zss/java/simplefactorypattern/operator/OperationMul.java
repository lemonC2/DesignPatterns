package com.zss.java.simplefactorypattern.operator;

import com.zss.java.simplefactorypattern.model.Operation;

/**
 * 乘法运算类
 * @author lemon
 * @date 2018/4/16 10:06
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0L;
        result = numberA * numberB;
        return result;
    }
}
