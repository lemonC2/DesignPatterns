package com.zss.java.observerpattern;

/**
 * @author lemon
 * @date 2018/4/17 11:45
 */
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
