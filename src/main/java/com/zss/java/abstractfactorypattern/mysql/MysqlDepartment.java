package com.zss.java.abstractfactorypattern.mysql;

import com.zss.java.abstractfactorypattern.abstracts.AbstractDepartment;
import com.zss.java.abstractfactorypattern.model.Department;

/**
 * MysqlDepartment 类，类似 ProductB1 类
 * @author lemon
 * @date 2018/4/17 14:45
 */
public class MysqlDepartment extends AbstractDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在MySQL中插入一条department记录");
    }

    @Override
    public Department query(String id) {
        System.out.println("在mysql中查询一条department记录");
        return null;
    }
}
