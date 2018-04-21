package com.zss.java.interpreterPattern;

/**
 * 抽象表达式类
 * @author lemon
 * @date 2018/4/21 10:06
 */
public abstract class AbstractExpresstion {
    //以给定的环境为准，解释给定的任何一个表达式
    public abstract void interpret(InterpreterContext context);
}
