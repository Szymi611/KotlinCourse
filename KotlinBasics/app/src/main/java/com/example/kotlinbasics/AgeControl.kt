package com.example.kotlinbasics

fun main(){

    println("Enter your age as a whole number")
    val enteredValue = readln();
    var age = enteredValue.toInt();

    if(age in 18..40){
        println("You cannot go into the club, please go home")
    }
    else if(age >= 18) {
        println("You can enter the club")
    }else{
        println("Age not verified. Pleas contact support")
    }


}