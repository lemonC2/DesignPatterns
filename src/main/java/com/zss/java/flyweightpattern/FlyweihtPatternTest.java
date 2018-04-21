package com.zss.java.flyweightpattern;

/**
 * 测试类
 * @author lemon
 * @date 2018/4/19 17:21
 */
public class FlyweihtPatternTest {
    public static void main(String[] args) {

        int extrinsicstate = 22;

        FlyweihtFactory factory = new FlyweihtFactory();

        Flyweight f1 = factory.create("X");
        f1.operation(21);

        Flyweight f2 = factory.create("Y");
        f2.operation(20);

        Flyweight f3 = factory.create("X");
        f3.operation(19);

        boolean flag = false;
        //判断对象实例是否共享
        if (f1 == f3) {
            flag = true;
        }
        System.out.println("内部状态是否可以共享：" + flag);

        Flyweight uf1 = new UnShareConcreteFlyweiht();
        uf1.operation(18);

    }
}
