package com.zss.java.templateMethodPattern;

/**
 * @author lemon
 * @date 2018/4/16 20:06
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new ConcreteTemplateA();
        abstractTemplate.templateMethod();

        abstractTemplate = new ConcreteTemplateB();
        abstractTemplate.templateMethod();
    }
}
