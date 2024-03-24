package com.example.kotlinbasics

fun main(){

}

fun coffeeDetails(){
    print("Please enter your name: ")
    var name = readln();
    println("How many spoons of sugar? ")
    var sugarString = readln();
    var sugarAmount = sugarString.toInt();

    makeCoffee(sugarAmount, name);
}
fun makeCoffee(sugarCount : Int, name : String){
    //println("Grind beans")
    //println("Coffee with $sugarCount spoons of sugar")
    if(sugarCount == 0){
        println("Coffee witho no sugar for $name")
    }
    else if(sugarCount == 1){
        println("Coffee with 1 spoon of sugar for $name")
    }else{
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}




fun arithmeticalBasics(){

    print("Please enter first number: ")
    var number1 = readln().toInt();
    print("Please enter second number: ")
    var number2 = readln().toInt();


    var myResult = add(number1, number2)
    println("The result of $number1 + $number2 is $myResult")
}
fun divide(num1: Int,num2: Int):Double{
    val result = num1/num2.toDouble()
    return result
}
fun add(num1:Int,num2:Int):Int {
    var result = num1 + num2;
    return result;
}
