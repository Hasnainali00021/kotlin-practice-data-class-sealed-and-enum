package com.example.test

open class A {
    open fun hello1(){
        println("Hi this is base class")
    }
    fun add(num1:Int, num2:Int): Int {     // : -> 2 Purposes inherit + Type defining
        hello1()
        return num1 + num2
    }
}

class B: A() {

    fun add(num1:Int, num2:Int, num3:Int): Int {
        hello()
        return num1 + num2 + num3
    }
    fun hello(){                        // Override lagana sa runtime polymorphism achieve hota
        println("Hi this is sub class")
//        super.hello()
    }
}

fun main(){
    val obj = B()
    val ans=obj.add(34,26, )
    println(ans)
}