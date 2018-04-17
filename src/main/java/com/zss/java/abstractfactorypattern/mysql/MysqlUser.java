package com.zss.java.abstractfactorypattern.mysql;

import com.zss.java.abstractfactorypattern.abstracts.AbstractUser;
import com.zss.java.abstractfactorypattern.model.User;

/**
 * MysqlUser 类，类似 ProductA1 类
 * @author lemon
 * @date 2018/4/17 14:44
 */
public class MysqlUser extends AbstractUser {
    @Override
    public void insert(User user) {
        System.out.println("在mysql中插入一条user记录");
    }

    @Override
    public User query(String id) {
        System.out.println("在mysql中查询一条user记录");
        return null;
    }
}
