package com.zss.java.abstractfactorypattern.abstracts;

import com.zss.java.abstractfactorypattern.model.User;

/**
 * 抽象类 AbstractUser,类似 AbstractProductA 类
 * @author lemon
 * @date 2018/4/17 14:45
 */
public abstract class AbstractUser {

    public abstract void insert(User user);
    public abstract User query(String id);
}
