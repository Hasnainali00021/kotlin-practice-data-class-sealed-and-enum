package com.example.test



fun main(){

    // Lecture 8   --  Functions
//task()
//println("Day 2:")

//task()

//    var a = task2()
//    println(a)

//task3(22,33)

//println(task4(34,22))
//println(task())

              // Lamda Functions

    var lamda = {a:Int,b:Int -> a+b}

    println(lamda(23, 24))
}

// Function type 1    --  No argument and no return type

//fun task(){
//    var a = 34
//    var b = 22
//    var c = a + b
//    println("Sum of a and b is $c")
//}

// Function type 2   -- value returned

//fun task2():Int{
//    var a = 34
//    var b = 22
//    var c = a + b
//    return c
//
//}

// Function type 3 --  Argument is taking but value is not returned

//fun task3(a:Int, b:Int){
//    var c = a + b
//    println("Sum of a and b is $c")
//}

// Function 4  --  Value is taking & returning  as well

//fun task4(a:Int, b: Int): Int{
//
//    var c = a + b
//    return c
//}

