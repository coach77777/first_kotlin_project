package com.example.first_kotlin_project


fun main(args: Array<String>) {

    var age = ArrayList<Int>()

    age.add(10)
    age.add(1, 15)
    age.add(20)

    println("First element of ArrayList = " + age[0])
    println("Second element of ArrayList = " + age.get(1))
    println("Third element of ArrayList = ${age[2]}")

    age.remove(15)

    println(age.size)

    println("First element of ArrayList = " + age[0])
    println("Second element of ArrayList = " + age.get(1))

    var cars = arrayListOf<String>("Opel", "BMW" )
    cars.add("Ford")

    var myMixArrayList = ArrayList<Any>()
    myMixArrayList.add("Ford")
    myMixArrayList.add(5)
    myMixArrayList.add(2.5)
    myMixArrayList.add(true)
    myMixArrayList.add('K')

    println(myMixArrayList[0])
    println(myMixArrayList[1])
    println(myMixArrayList[2])
    println(myMixArrayList[3])
    println(myMixArrayList[4])

}





