package com.example.kotlinbasics

fun main(){

    //Immutable List - cannot work with this list
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD");
    //Mutable List
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX3060", "SSD")
    //Adding items to the list
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX3060")
    shoppingList.add("Graphics Card RTX 4090")
    println(shoppingList)
    shoppingList.removeAt(2)
    shoppingList.add(2,"SSD")

    shoppingList.set(3, "Water Cooling")

    val hasRAM  = shoppingList.contains("RAM")
    if(hasRAM){
        println("Has RAM in the list")
    }else{
        println("Has not RAM in the list")
    }

    /*for(item in shoppingList){
        println(item);
        if(item == "RAM"){
            shoppingList.removeLast()
            break
        }
    }*/

    //We are getting indexes of the list
    for(index in 0 until shoppingList.size){
        println("item ${shoppingList[index]} is at index $index")
    }
}