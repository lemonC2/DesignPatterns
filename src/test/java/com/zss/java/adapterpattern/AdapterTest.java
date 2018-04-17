package com.zss.java.adapterpattern;

/**
 * @author lemon
 * @date 2018/4/17 16:14
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
