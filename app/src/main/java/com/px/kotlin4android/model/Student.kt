package com.px.kotlin4android.model
/**
 * Created by Administrator on 2017/5/17.
 */

open class Student {
    var name :String ? =null;    //问号对Null 不作处理 ！！处理异常
    var sex :Int? =0;

    constructor(name: String?, sex: Int?) {
        this.name = name
        this.sex = sex
    }

    constructor() {
    }
    override fun toString(): String {
        return "Student(name=$name, sex=$sex)"
    }
    fun setName()
    {
        name = "王五"
    }

    operator fun component1(): String {
        return name.toString();
    }


    operator fun  component2(): Int {
        return sex as Int;
    }

}