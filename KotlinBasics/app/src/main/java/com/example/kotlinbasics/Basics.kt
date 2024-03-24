package com.example.kotlinbasics

fun main(){
    /* var myAge = 30;
    myAge = 18;
    println(myAge);
    println("Hello World!") */

    /* var pi = 3.14f;
    println(pi);
    pi = 3.1425926535f; */

    /* val myTrue: Boolean = true;
    val myFalse: Boolean = false;
    println(myTrue || myFalse) //OR
    println(myTrue && myFalse) //AND
    println(!myTrue) */

    /* val myChar = '\u00AE' //UNICODE
    println(myChar) */

    /* var name = "Szymon"
    //name = "Very long paragraphs can be stored inside of strings"
    println(name.uppercase())
    println(name + "Szymon") */

    /* var age = 0;
    println("Please enter your age as a number:")
    //Wczytanie danej od uzytkownika
    val enteredValue = readln();
    //Parsowanie na int
    age = enteredValue.toInt();
    if(age >= 40){
        println("You can not go into the club, go home")
    }
    else if(age >= 18){
        println("You can go to the club")
    }else{
        println("You cant go to the club")
    } */

    /* var count = 0;
    while (count < 3){
        println("Count is $count")
        count++
    }
    println("Loop is done") */

    var userInput = readln();
    while (userInput == "1"){
        println("While loop executed")
        userInput = readln()
    }
    println("Loop is done")
}
