package com.zss.java.factoryMethodpattern;

import com.zss.java.factoryMethodpattern.model.AbstractOperation;

/**
 * 工厂方法模式：工厂接口
 * @author lemon
 * @date 2018/4/16 17:19
 */
public interface IFactory {
    AbstractOperation createOperation();
}
