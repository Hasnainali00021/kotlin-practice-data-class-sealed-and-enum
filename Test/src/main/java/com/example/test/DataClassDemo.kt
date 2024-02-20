package com.example.test

// Data Classes sirf data rakhna ka lia ya Store rakhna ka lia kam aata ha

fun main() {
    val obj1 = User("Hasnain", "123455")
//    println( obj1.toString() )
//    println( obj1.hashCode() )
    val obj2 = obj1.copy()    //Agar koi change karna ho obj2 ma hi sirf then this, us ka affect nai hoga object 1 pa
    obj2.name = "NeatRoots"
    println(obj1)
    println(obj2)                //V.Imp Run kar ka daikho
    println(obj2.component1())   //Same
    // Decompile
    var(name,pass) = obj2
    println(pass)

}

 data class User(var name: String, var password:String){

 }
