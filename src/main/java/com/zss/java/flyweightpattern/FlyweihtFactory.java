package com.zss.java.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类，管理享元抽象类
 * @author lemon
 * @date 2018/4/19 17:19
 */
public class FlyweihtFactory {
    //存储多个抽象享元类的具体类实例
    private Map<String,Flyweight> map = new HashMap<>();

    public Flyweight create(String intrinsicstate){
        //抽象享元类的具体实例存在则直接返回，否则创建实例
        if (!map.containsKey(intrinsicstate)){
            map.put(intrinsicstate,new ConcreteFlyweiht(intrinsicstate));
        }
        return map.get(intrinsicstate);
    }
}
