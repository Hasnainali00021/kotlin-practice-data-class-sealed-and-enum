package com.example.test
// class > sealed > enum

    // Enum Class
//enum class Color {
//    RED,
//    BLACK,
//    BlUE
//}
//
//fun main(){
////    val value = Color.BLACK       // ordinal for their sequence number and name
//                                   //    for their exact name in compiler
////  println(value.ordinal)
//    val value = Color.values()
//    value.forEach {println( it.name) }
//}

   // Sealed Class

sealed class Color(code:Int) {              // sealed classes classes ka hi group contain karti
    class RED(var code:Int):Color(code)     // Variable bana ka
    class BLACK
    class BlUE
}

fun main(){
//    val value = Color.BLACK       // ordinal for their sequence number and name
    //    for their exact name in compiler
//  println(value.ordinal)
    val value = Color.RED(23)
    println(value.code)
}
