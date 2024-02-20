package com.example.test

fun main() {

    // Lecture 6  -- when & range
//    val age = 99
//    //range  or Until sa last value consider nai hoti like 100
//    val result = age in 1..100
//    when(age){
//        18 -> println("Not Eligible.Too young to Vote")
//        40 -> println("You can Vote.Are you excited for Elections")
//        55 -> println("You can Vote. Choose Your Favourite leader")
//        70-> println("You can Vote. Senior Citizen")
//        else -> println ("Your Vote is not listed yet")
//    }

    val value = 4
    when (value) {
        1 -> println("1 milgiya")
        2 -> println("2 milgiya")
        3 -> println("3 milgiya")
        4 -> println("4 milgiya")
        else -> println("Choose options between 1 to 4 ")
    }
}