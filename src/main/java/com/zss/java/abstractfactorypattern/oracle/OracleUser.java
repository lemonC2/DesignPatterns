package com.zss.java.abstractfactorypattern.oracle;

import com.zss.java.abstractfactorypattern.abstracts.AbstractUser;
import com.zss.java.abstractfactorypattern.model.User;

/**
 * OracleUser 类，类似 ProductA2 类
 * @author lemon
 * @date 2018/4/17 14:44
 */
public class OracleUser extends AbstractUser {
    @Override
    public void insert(User user) {
        System.out.println("在oracle 中插入一条user记录");
    }

    @Override
    public User query(String id) {
        System.out.println("在oracle中查询一条user记录");
        return null;
    }
}
