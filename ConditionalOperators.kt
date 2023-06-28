package com.example.first_kotlin_project

fun main(args: Array<String>) {

    var num1:Int = 5
    var num2:Int = 8
    var num3:Int = 12

    var result:Boolean = false

    //Conditional Operator (&&)

    result = (num1 > num2) && (num3 > num2)
    println("Result: " + result)

    //Conditional Operator (||)

    result = (num1 > num2) || (num3 > num2)
    println("Result: " + result)

}