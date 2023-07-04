package com.example.first_kotlin_project

fun main(args: Array<String>) {


   /*
   for (num in 1..10)
    {
        println(num)

    }
    */

   /*
   var sum:Int = 0
    for (x in 0..5)
    {
        println(x)
        sum +=x
    }
    println("Sum of numbers = $sum")
    */


   /*
   var sum:Int = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sum += x
        }
    }
        println("Sum of the even numbers = $sum")
}
*/

   /*
   var myNumArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (y in 0..(myNumArray.size)-1)
    {
        println("myNumArray[$y] = ${myNumArray[y]}")
    }
    */

    /*var myNumArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (y in myNumArray.indices)
    {
        println("myNumArray[$y] = ${myNumArray[y]}")
    }
    */

    //for each

    var myNumArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

  myNumArray.forEach {println(it) }
}

