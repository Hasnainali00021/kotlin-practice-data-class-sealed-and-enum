package com.example.test

abstract class A1 {              // abstract class or abstract function dono abstract ka sath resemble hota
    abstract fun hello()           // 1 Function ka abstract hona must in abstraction
        fun hello2(){
            println("This is hello from hello 2 function")
        }

}

class B1: A1(){                            // Second method ka ap is B1 wali class ko b abstract kar do
    override fun hello() {
        println("This is hello from abstract function")
    }

}

fun main(){
//    val obj = A1()        // abstract class ka koi b object nahi bana sakta
    val obj = B1()
    //As seen ka abstract ko direct call nahi kar sakta so B1 ka object banaya
    // or usi ka through B1 wala b call And ALSO abstract wala first class b call
    obj.hello()
    obj.hello2()
}