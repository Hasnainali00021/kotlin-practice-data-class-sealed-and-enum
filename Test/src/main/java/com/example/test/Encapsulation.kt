package com.example.test

class Calculation() {

    // data members
    private var num1 = 34;
//    internal var num2 = 45 // internal pkg ka bahir nahi use kar sakta
     var num2 = 45
    //member functions

    fun add() {
        println("Sum of these numbers is = ${num1 + num2}")
    }

    fun multiply() {
        println("Product of these numbers is = ${num1 * num2}")
    }
}

    fun main(){
        val obj1 = Calculation()
        obj1.num2 = 22
        obj1.add()
        obj1.multiply()
        println(obj1.num2)
    }
