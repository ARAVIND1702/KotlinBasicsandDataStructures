package com.aravind.kotlinbasicsanddatastructures

import android.util.Range
import kotlin.random.Random


fun main() {
    println("Enter the input :")
    println("1 ---> Paper")
    println("2 ---> Rock ")
    println("3 ---> Scissor ")

    val userInput = readln().toInt()
    var computerInput = Random.nextInt(1,3) // one way to generate random
    computerInput = (1..3).random() // alter to generate

    println("You chosen: ")
    printMove(userInput)
    println()
    println("Computer chosen: ")
    printMove(move = computerInput)
    println()
    printResult(computerInput,userInput)

}

fun printMove(move: Int) {
    when(move) {
        1 -> println("Paper")
        2 -> println("Rock")
        3 -> println("Scissor")
    }
}


// What if you want to add one more condition like: 4 & 5 matches >?
// then you will be adding new else if rite.
// so when new new condition comes, then new else if going to added here?
// How to resolve this?

fun printResult(computerInput: Int,userInput: Int) {
    if( computerInput == userInput ) {
        println(" Its a Tie")
    }
    else if ( userInput == 1 && computerInput == 2 ) {
        println("Player won")
    }
    else if ( userInput == 2 && computerInput == 3 ) {
        println("Player won")
    }
    else if ( userInput == 3 && computerInput == 1 ) {
        println("Player won")
    }
    else {
        println("Computer won")
    }
}