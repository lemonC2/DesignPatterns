package com.zss.java.abstractfactorypattern.abstracts;

import com.zss.java.abstractfactorypattern.model.Department;

/**
 * 抽象类AbstractDepartment ,类似AbstractProductB类
 * @author lemon
 * @date 2018/4/17 14:45
 */
public  abstract class AbstractDepartment {

    public abstract void insert(Department department);
    public abstract Department query(String id);

}
