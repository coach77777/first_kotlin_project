package com.example.control_flow_statements_in_kotlin

fun main(args: Array<String>) {
     print("Please Enter a Number: ")

    var num:Int = readLine()!!.toInt()

    if (num % 2 == 0){
        println("$num Is an Even Number.")
    }
    else{
        println("$num Is an Odd Number.")
    }
}