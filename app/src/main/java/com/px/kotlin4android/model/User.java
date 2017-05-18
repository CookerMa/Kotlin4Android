package com.px.kotlin4android.model;

import android.util.Log;

import demo.Teacher;

/**
 * Created by Administrator on 2017/5/17.
 */

public class User {
    private String name ;
    private String age ;
    private boolean isStu;

    public boolean isStu() {
        return isStu;
    }

    public void setStu(boolean stu) {
        isStu = stu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setStuName()
    {
//        Student student = new Student();
//        student.setName();
//        Log.e("User","---------"+student.getName());
        new demo.Teacher();
        demo.TeacherKt.clazz();
    }

    @Override
    public String toString() {


        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", isStu='" + isStu + '\''+
                '}';
    }
}
