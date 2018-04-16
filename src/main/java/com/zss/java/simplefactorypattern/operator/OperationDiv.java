package com.zss.java.simplefactorypattern.operator;

import com.zss.java.simplefactorypattern.model.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 除法运算类
 * @author lemon
 * @date 2018/4/16 10:01
 */
public class OperationDiv extends Operation {
    private static final Logger LOG = LoggerFactory.getLogger(OperationDiv.class);
    @Override
    public double getResult() {
        double result = 0L;
        if (numberB != 0){
            result = numberA / numberB;
        }else{
            System.exit(0);
            LOG.info("除数不能为0");
        }
        return result;
    }
}
