package com.example.test

class Dailytask{

    fun bath(){
        println("Taking bath")
    }
    fun ready(){
        println("Getting ready for college")
    }
    fun study(){
        println("Studying in college")
    }
    fun backToHome(){                    //Camel-Case
        println("Back to home")
    }
}

fun main(args:Array<String>){
    val person1 = Dailytask()
        person1.bath()
        person1.ready()
        person1.study()
        person1.backToHome()

    println("=========================================================")
    val person2 = Dailytask()
    person2.bath()
    person2.backToHome()
}