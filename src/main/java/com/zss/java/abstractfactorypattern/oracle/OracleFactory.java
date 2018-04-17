package com.zss.java.abstractfactorypattern.oracle;

import com.zss.java.abstractfactorypattern.abstracts.AbstractDepartment;
import com.zss.java.abstractfactorypattern.AbstractFactory;
import com.zss.java.abstractfactorypattern.abstracts.AbstractUser;

/**
 * OracleFacory 类，类似 ConcreteFactory2 类，用于实例化 OracleUser 和 OracleDepartment
 * @author lemon
 * @date 2018/4/17 14:44
 */
public class OracleFactory extends AbstractFactory {
    @Override
    public AbstractUser createUser() {
        return new OracleUser();
    }

    @Override
    public AbstractDepartment createDepartment() {
        return new OracleDepartment();
    }
}
