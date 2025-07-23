package com.aravind.kotlinbasicsanddatastructures

fun main() {
    // string
    val god = "Muruga"
    val name = "Aravind"

    // double and float for decimals
    var float: Float = 3.14234234892883234234F
    var double: Double = 3.14234234892883234234
    println("double: $double")
    println("float: $float")

    //unsigned numbers
    var e: UShort = 1212U
    var E: UInt = 123182391U
    println("UShort: $e")
    println("UInt: $E")

    //Bool
    var ans: Boolean = false
    var me: Boolean = true
    var range = 1..2
    println(ans || me)
    coffeMaker(2,"Ridhanya")
}

fun coffeMaker(sugar: Int = 0, name: String) {
    when {
        sugar > 1 -> {
            println("$sugar spoons of sugar for $name")
        }
        else -> {
            println("$sugar spoon of sugar for $name")
        }
    }
}

