package com.zss.java.abstractfactorypattern.mysql;

import com.zss.java.abstractfactorypattern.abstracts.AbstractDepartment;
import com.zss.java.abstractfactorypattern.AbstractFactory;
import com.zss.java.abstractfactorypattern.abstracts.AbstractUser;

/**
 * MysqlFacory 类，类似 ConcreteFactory1 类，用于实例化 MysqlUser 和 MysqlDepartment
 * @author lemon
 * @date 2018/4/17 14:45
 */
public class MysqlFactory extends AbstractFactory {
    @Override
    public AbstractUser createUser() {
        return new MysqlUser();
    }

    @Override
    public AbstractDepartment createDepartment() {
        return new MysqlDepartment();
    }
}
