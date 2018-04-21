package com.zss.java.interpreterPattern;

/**
 * 终结符表达式类
 * @author lemon
 * @date 2018/4/21 10:07
 */
public class TerminalExpression extends AbstractExpresstion {
    @Override
    public void interpret(InterpreterContext context) {
        System.out.println("终端解释器");
    }
}
