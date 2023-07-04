package com.example.first_kotlin_project

import kotlin.random.Random

fun main(args: Array<String>) {
  /*
  var i = 5
    while (i > 0){
        println(i)
        i--
    }
    */

    /*
    var k = 1
    var fact = 1

    while (k < 6)
    {

        fact *=k // fact = fact * k
        println("$k! = $fact")
        k++
    }
    */

    //infinite loop

    val number = Random.nextInt(0,100)

    println("Please enter a Number: ")
    while(2 > 1) {
        val userGuess:Int = readLine()!!.toInt()
        if (userGuess == number) {
            println("Congratulations, You are Correct!! ")
            break
        }
        else if (userGuess < number)
        {
            println("To Low, Try a Higher number. ")
        }
        else
        {
            println("To High, Try a Lower number. ")
        }
    }


}