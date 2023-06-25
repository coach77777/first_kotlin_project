package com.example.first_kotlin_project

fun main(args: Array<String>) {
    var a:String = "Hello Kotlin"
    var b:String = "Language"
    var age:Int = 62

    println("Your age is = " + age)

    var x:String = "Kotlin"
    var i:Int = x.length
    println("Length of Kotlin = " + i)

    var c:Boolean =  x.equals("java")
    println(c)

    println(x.isEmpty())

    println(x.plus(" language"))

    println(x.lowercase())
    println(("*********************"))
    println(x.uppercase())

    var t:String = "   Android   "
    println(x + t.trim())
    println(x + t)




}