package com.rx.cn.rxandroid.bean;

import java.util.List;

/**
 * Created by jian.shui on 2019/1/4
 */
public class Student {
    private String name;
    private List<String> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
