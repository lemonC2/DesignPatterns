package com.zss.java.builderpattern;

/**
 * 具体建造者类
 * @author lemon
 * @date 2018/4/17 10:59
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("建造产品部件1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("建造产品部件2");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
