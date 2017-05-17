package com.px.kotlin4android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.px.kotlin4android.model.Student
import com.px.kotlin4android.model.User
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
        Log.e(TAG,user.toString());

        var stu =Student();
        stu.name ="张三"
        stu.sex =1
        Log.e(TAG,stu.toString());

    }

    fun MainActivity.a()
    {
        this.textView.setText("nice to meet you!")
    }
}
