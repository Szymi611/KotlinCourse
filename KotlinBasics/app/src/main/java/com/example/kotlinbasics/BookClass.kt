package com.example.kotlinbasics

fun main(){
    var myBook = Book("Ocholera", "Szymon Domagała", 2019);
    var customBook = Book();

    println("The title is ${myBook.title}, the author is ${myBook.author} and it was published in ${myBook.yearPublished}")
    println("The title is ${customBook.title}, the author is ${customBook.author} and it was published in ${customBook.yearPublished}")
}