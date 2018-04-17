package com.zss.java.abstractfactorypattern.oracle;

import com.zss.java.abstractfactorypattern.abstracts.AbstractDepartment;
import com.zss.java.abstractfactorypattern.model.Department;

/**
 * OracleDepartment 类，类似 ProductB2 类
 * @author lemon
 * @date 2018/4/17 14:44
 */
public class OracleDepartment extends AbstractDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在oracle 中掺入一条department记录");
    }

    @Override
    public Department query(String id) {
        System.out.println("在oracle 中查询一条department记录");
        return null;
    }
}
