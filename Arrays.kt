package com.example.first_kotlin_project

fun main(args: Array<String>) {

    var age = arrayOf(1,2,3)

    println("First Element of Array = " + age[0])
    println("Second Element of Array = " + age.get(1))
    println("Third Element of Array = " + age[2])

    var cars = arrayOf("Mercedes","BMW","Opel")

    println("------------------------------------------------------")

    println("First Element of Array = " + cars[0])
    println("Second Element of Array = " + cars.get(1))
    println("Third Element of Array = " + cars[2])

    cars.set(2,"Ford")

    println("------------------------------------------------------")

    println("First Element of Array = " + cars[0])
    println("Second Element of Array = " + cars.get(1))
    println("Third Element of Array = " + cars[2])
    println("------------------------------------------------------")

    println("Size of Cars Array = " + cars.size)

    var carAndAge = arrayOf("Mercedes",5,"Opel",10)
    println("------------------------------------------------------")

    println("First Element of Array = " + carAndAge[0])
    println("Second Element of Array = " + carAndAge.get(1))
    println("Third Element of Array = " + carAndAge[2])
    println("Fourth Element of Array = " + carAndAge[3])


}