package com.zss.java.simplefactorypattern.operator;

import com.zss.java.simplefactorypattern.model.Operation;

/**
 * 加法运算类
 * @author lemon
 * @date 2018/4/16 9:58
 */
public class OperationAdd  extends Operation{

    @Override
    public double getResult() {
        double result = 0L;
        result = numberA + numberB;
        return result;
    }
}
