package com.px.kotlin4android.model
/**
 * Created by Administrator on 2017/5/17.
 */

class Student {
    var name :String ? =null;    //问号对Null 不作处理 ！！处理异常
    var sex :Int? =0;
    override fun toString(): String {
        return "Student(name=$name, sex=$sex)"
    }
    fun setName()
    {
        name = "王五"
    }

}