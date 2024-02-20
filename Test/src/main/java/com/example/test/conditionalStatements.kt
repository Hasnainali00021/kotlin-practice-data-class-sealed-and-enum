package com.example.test

fun main(){

    // Lecture 5  --  if-else Condition

//    val aliHeight = 5.9
//    val hasnainHeight = 5.5
//
//    if(aliHeight > hasnainHeight) {
//        println("Ali is taller")
//    }
//        else {
//            println("Hasnain is taller")
//        }
//

    // Voting System

//    println("How Old are You?")
//    val age = readLine()!!.toInt()
//    println("Your age is $age")
//
//    if(age < 18)
//        println("You are not eligible to Vote.")
//    else if( age < 40)
//        println("You can Vote. Are You Excited for elections?" )

    //Logic for more than 40 like 100 down here

//    else
//        println("You can Vote Now")

    //If -else as a Expression

    val aliHeight = 5.9
    val hasnainHeight = 5.5

    val taller = if(aliHeight > hasnainHeight) {
         "Ali is taller"
    }
    else {
            "Hasnain is taller"
        }
    println(taller)



    }
