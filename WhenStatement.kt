package com.example.control_flow_statements_in_kotlin

fun main(args: Array<String>) {

    print("Please Enter a day number of week : ")

    var dayNum: Int = readLine()!!.toInt()
    var day: String

    when (dayNum) {
        1 -> day = "Monday"
        2 -> day = "Tuesday"
        3 -> day = "Wednesday"
        4 -> day = "Thursday"
        5 -> day = "Friday"
        6 -> day = "Saturday"
        7 -> day = "Sunday"
        else -> day = "Invalid Choice"
    }
    println(" Day is $day")
}