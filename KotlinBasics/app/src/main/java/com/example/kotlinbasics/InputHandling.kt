package com.example.kotlinbasics

fun main(){
    print("Please enter a number: ")
    var userInput = readln()
    var number = userInput.toInt();
    val multiplier = 4;

    var result = number * multiplier
    println("The result of the operation is: $result")
}