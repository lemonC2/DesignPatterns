package com.zss.java.abstractfactorypattern.model;

/**
 * 实体类 Department
 * @author lemon
 * @date 2018/4/17 14:45
 */
public class Department {

    private String departId;
    private String departName;

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departId='" + departId + '\'' +
                ", departName='" + departName + '\'' +
                '}';
    }
}
