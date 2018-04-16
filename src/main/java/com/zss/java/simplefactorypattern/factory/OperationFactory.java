package com.zss.java.simplefactorypattern.factory;

import com.zss.java.simplefactorypattern.model.Operation;
import com.zss.java.simplefactorypattern.operator.OperationAdd;
import com.zss.java.simplefactorypattern.operator.OperationDiv;
import com.zss.java.simplefactorypattern.operator.OperationMul;
import com.zss.java.simplefactorypattern.operator.OperationSub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 运算工厂类
 * 用于添加新的运算方式
 *
 * @author lemon
 * @date 2018/4/16 10:08
 */
public class OperationFactory {
    private static final Logger LOG = LoggerFactory.getLogger(OperationFactory.class);

    public static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                LOG.info("运算类初始化！");
        }
        return oper;
    }
}
