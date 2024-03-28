package com.example.kotlinbasics

fun main(){
    val fruitsList = mutableListOf("Apple", "Orange", "Banana", "Grapes","Tomato")
    println(fruitsList);
    fruitsList.add("Kiwi")
    println(fruitsList)
    fruitsList.remove("Tomato")
    val hasBanana = fruitsList.contains("Banana")
    if(hasBanana){
        println("There is a banana in the list")
    }else{
        println("There is not a banana in the list")
    }
}