package com.zss.java.builderpattern;

/**
 * 抽象建造者类
 * @author lemon
 * @date 2018/4/17 10:56
 */
public interface Builder {

    //建造产品部件1
    public void buildPart1();
     //建造产品部件2
    public void buildPart2();
    //返回产品
    public Product getProduct();

}
