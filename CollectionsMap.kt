package com.example.first_kotlin_project

fun main(args: Array<String>) {
//immutable
    var age = mapOf<String,Int>("dave" to 20, "Joe" to 30)

    println("Age of Dave : " + age["dave"])
    println("Age of Joe : " + age["Joe"])

    //mutable
    var mutAge = mutableMapOf<String,Int>("dave" to 20, "Joe" to 30)

    mutAge.put("Fred",40)

    println("----------------------")

    println("Age of Dave : " + age["dave"])
    println("Age of Joe : " + age["Joe"])
    println("Age of Fred : " + mutAge["Fred"])


}