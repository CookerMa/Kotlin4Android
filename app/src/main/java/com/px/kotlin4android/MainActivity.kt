package com.px.kotlin4android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.px.kotlin4android.model.Student
import com.px.kotlin4android.model.User
import com.px.kotlin4android.model.Worker
import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_main.view.* ;
class MainActivity : AppCompatActivity() {
    var TAG :String ="MainActivity"
    var age :Int = 23;
    var name :String ="haha";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setText("hello world")
//        var intent =  Intent(this,MainActivity::class.java)
//         a()

        var user = User();
        user.age = "23";
        user.name = "Test"
        user.isStu = true;
        user.setStuName();

        var stu =Student();
        stu.name ="张三"
        stu.sex =1

        var work  = Worker();
        work.setName()

        var arr1 =  arrayOfNulls<String>(5); // 空数组
        var arr = arrayOf("A","B","C")
        var intArr = intArrayOf(1,2,23,4) //IntArray
        var  arr2 = Array(4,{i-> i+i});  //构造方法
//         testWhen(arr)
//        printArr(arr2)
        age shl 2 //位运算

//        try {
//            var num = "23"
//
//            Log.e(TAG,"int"+num.toInt())
//        } catch(e: Exception) {
//        }
        for (i in arr)
            Log.e(TAG,"$i")
        Log.e(TAG,"---------------------")
        for (i in arr.indices)
            Log.e(TAG,arr[i])

        for (a in 1..5)
            print("${a} ")

        val(a,b) = Student("马六",1)

        Log.e(TAG,"$a"+"---------------------"+b)

        val(c,d) =getUse();
        Log.e(TAG,"$c"+"---------------------$d")
        /**     map **/
        var map = hashMapOf<String,Any>()
        map.put("name","赵云")
        map.put("age",28)

        for ((key,value) in map)
        {
            Log.e(TAG,"key = $key,value = $value")
        }
    }

  data  class User1(var name:String,var age:Int)
    fun getUse():User1
    {
        return User1("张飞",23)
    }


//    fun printArr(array: Array<Int>)
//    {
//        for (i in array)
//            Log.e(TAG,"$i")
//    }
    /**
     * when用法
     */
    fun testWhen(array:Array<String>)
    {

        val value = if(array.size == 0)"is null" else array[0]
        val s = when (value) {
            "Array" -> "Hello 1"
            "B" -> "Hello 2!"
            "C" -> "Hello 3!"
            else -> "Sorry, I can't greet you in $value yet"
        }
        Log.e(TAG,s)

    }



    fun MainActivity.a()
    {
        this.textView.setText("nice to meet you!")
    }


}
