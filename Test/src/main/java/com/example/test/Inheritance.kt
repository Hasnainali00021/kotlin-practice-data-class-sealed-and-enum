package com.example.test
// Five Types of inheritance
// 1.Single Inheritance
//2. Multi-level Inheritance
//3. Hirerichal Inheritance
//4. Hybrib Inheritance
//5. Multiple Inheritance

// 1.Single Inheritance
open class Father {
  open protected var car = "BMW"
//    fun carName(){
//        println(car)
//    }

}

class Child : Father() {
    override var car = "Audi"
    fun carName(){
        println(super.car)                     // super keyword
    }
}

//2. Multi-level Inheritance
//class Child1 : Child(){
//    fun carName(){
//        println(car)
//    }
//
//}
//3. Hierarchical Inheritance
//open class Child1 : Father(){
//    fun carName(){
//        println(car)
//    }
//
//}
//// 4.
//class Child2:Child(){
//    fun carName(){
//        println(car)
//    }
//}
fun main() {
//    val obj = Child1()
//    obj.carName()

    val obj1 = Child()              //3. Hierarchical Inheritance
    obj1.carName()
}


