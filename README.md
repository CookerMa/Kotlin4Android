kotlin 最新版为1.1.2


java调用新建一个kotlin类 可以指定包名，也可以不指定

---------------------------------------------
指定包名
新建一个kotlin类 可以自己指定包名  如package demo
然后写类名
```
class XXX
fun test
{
 // do sth
}

java中调用
  new demo.XXX();
  demo.XXXKt.test();
XXX 指的是类名 ，XXXKt文件会生成在 app ->build->intermediates->classes->debug->demo 包下
-----------------------------------------------
不修改包名 就像java一样调用
var x =  XXX();
x.test();
----------------------------------------------
```

@file:JvmName("XX") 可以修改生成的类名

@file:JvmMultifileClass
具有相同生成的Java类名称（相同的包和相同名称或相同的@JvmName注释）的多个文件通常是一个错误。
然而，编译器能够生成一个具有指定名称的Java外观类，并包含所有具有该名称的文件的声明。
为了生成这样的立面，在所有文件中使用@JvmMultifileClass注释。
