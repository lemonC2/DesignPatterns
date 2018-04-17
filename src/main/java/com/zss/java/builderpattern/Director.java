package com.zss.java.builderpattern;

/**
 * 指挥者类：组合产品创建
 * @author lemon
 * @date 2018/4/17 11:01
 */
public class Director {
    private Builder builder;

    //初始化建造者
    public Director(Builder builder){
        this.builder = builder;
    }

    //构建产品方法
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
