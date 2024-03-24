package com.example.kotlinbasics

data class CoffeeDetails(val sugarCount : Int, val name : String, val size:String, val creamAmount:Int){

}
fun main(){
    val coffeeForSzymon = CoffeeDetails(0, "Szymon", "Small", 0)
    makeCoffees(coffeeForSzymon);
}

fun coffeeDetailss(){
    print("Please enter your name: ")
    var name = readln();
    println("How many spoons of sugar? ")
    var sugarString = readln();
    var sugarAmount = sugarString.toInt();

    makeCoffee(sugarAmount, name);
}
fun makeCoffees(coffeeDetails: CoffeeDetails){
    //println("Grind beans")
    //println("Coffee with $sugarCount spoons of sugar")
    if(coffeeDetails.sugarCount == 0){
        println("Coffee with no sugar for ${coffeeDetails.name} and ${coffeeDetails.creamAmount} cream")
    }
    else if(coffeeDetails.sugarCount == 1){
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar and ${coffeeDetails.creamAmount} cream for ${coffeeDetails.name}")
    }else{
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar and ${coffeeDetails.creamAmount} cream for ${coffeeDetails.name}")
    }
}
