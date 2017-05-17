package com.px.kotlin4android.model

/**
 * Created by Administrator on 2017/5/17.
 */
class Student {
    var name :String ? =null;
    var sex :Int? =0;
    override fun toString(): String {
        return "Student(name=$name, sex=$sex)"
    }

}