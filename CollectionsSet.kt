package com.example.first_kotlin_project

fun main(args: Array<String>) {

    var mySetArray = arrayListOf<Any>("Kotlin",2,2.5,'M',true,"Kotlin")

    println(mySetArray.size)
    println(mySetArray.last())

    println("-------------------------------")

    var mySetArray2 = setOf<Any>("Kotlin",2,2.5,'M',true,"Kotlin")

    println(mySetArray2.size)
    println(mySetArray2.last())

    println("-------------------------------")


}