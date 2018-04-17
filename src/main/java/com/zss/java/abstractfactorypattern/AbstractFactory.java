package com.zss.java.abstractfactorypattern;

import com.zss.java.abstractfactorypattern.abstracts.AbstractDepartment;
import com.zss.java.abstractfactorypattern.abstracts.AbstractUser;

/**
 * AbstractFactory 类，定义访问两个实体对象的的抽象工厂类
 * @author lemon
 * @date 2018/4/17 14:45
 */
public abstract class AbstractFactory {

    public abstract AbstractUser createUser();
    public abstract AbstractDepartment createDepartment();
}
