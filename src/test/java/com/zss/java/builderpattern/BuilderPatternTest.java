package com.zss.java.builderpattern;

/**
 * 测试类
 * @author lemon
 * @date 2018/4/17 11:04
 */
public class BuilderPatternTest {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getProduct();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }

}
