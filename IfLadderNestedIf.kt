package com.example.control_flow_statements_in_kotlin

fun main(args: Array<String>) {

    print("Please enter 3 numbers : ")

    var num1:Int = readLine()!!.toInt()
    var num2:Int = readLine()!!.toInt()
    var num3:Int = readLine()!!.toInt()

    var largestNum:Int

    if(num1 >= num2) {
        if (num1 >= num3){
            largestNum = num1
        }
        else{
            largestNum = num3
        }
    }
    else {
        if (num2 >= num3){
            largestNum = num2}
        else {
            largestNum = num3
        }
        }
    println("The largest number is : $largestNum ")








    /*
    println("Please Enter Your Age : ")

    var yourAge: Int = readLine()!!.toInt()

    if (yourAge < 13) {
        println("You are a child. ")

    } else if (yourAge < 19) {
        println("You are a teenager. ")

    } else {
        if (yourAge < 65) {
            println("You are an adult. ")

        } else {
            println("You are an senoir. ")
        }

    }
    */

}