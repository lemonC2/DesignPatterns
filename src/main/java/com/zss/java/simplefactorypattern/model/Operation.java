package com.zss.java.simplefactorypattern.model;

/**
 * 计算器运算类
 * @author lemon
 * @date 2018/4/16 9:54
 */
public class Operation {
    protected double numberA;
    protected double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
    //计算结果获取
    public double getResult(){
        double result = 0L;   //注意：浮点数计算陷阱
        return result;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "numberA=" + numberA +
                ", numberB=" + numberB +
                '}';
    }
}
