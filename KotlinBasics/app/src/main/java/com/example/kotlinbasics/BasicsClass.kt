package com.example.kotlinbasics

fun main(){

    var myDog = Dog("Efi", "Mixed", 1);
    println("${myDog.name} is a ${myDog.breed} and is ${myDog.age} years old")
    println("A year has passed")
    myDog.age = 2
}