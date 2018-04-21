package com.zss.java.interpreterPattern;

/**
 * 非终结表达式类
 * @author lemon
 * @date 2018/4/21 10:07
 */
public class NonTerminalExpression extends AbstractExpresstion {
    @Override
    public void interpret(InterpreterContext context) {
        System.out.println("非终端解释器");
    }
}
