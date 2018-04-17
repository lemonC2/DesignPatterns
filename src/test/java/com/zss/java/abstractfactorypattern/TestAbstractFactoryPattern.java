package com.zss.java.abstractfactorypattern;

import com.zss.java.abstractfactorypattern.abstracts.AbstractDepartment;
import com.zss.java.abstractfactorypattern.abstracts.AbstractUser;
import com.zss.java.abstractfactorypattern.model.Department;
import com.zss.java.abstractfactorypattern.model.User;
import com.zss.java.abstractfactorypattern.mysql.MysqlFactory;
import com.zss.java.abstractfactorypattern.oracle.OracleFactory;

/**
 * @author lemon
 * @date 2018/4/17 14:58
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        AbstractFactory mysqlFacory = new MysqlFactory();
        AbstractFactory oracleFactory = new OracleFactory();

        AbstractUser muser = mysqlFacory.createUser();
        muser.insert(user);
        muser.query("1");
        AbstractDepartment mdepartment = mysqlFacory.createDepartment();
        mdepartment.insert(department);
        mdepartment.query("1");

        AbstractUser ouser = oracleFactory.createUser();
        ouser.insert(user);
        ouser.query("2");
        AbstractDepartment odepartment = oracleFactory.createDepartment();
        odepartment.insert(department);
        odepartment.query("2");
    }
}
