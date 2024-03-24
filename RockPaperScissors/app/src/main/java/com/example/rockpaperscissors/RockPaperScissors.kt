package com.example.rockpaperscissors

fun main(){
    var computerChoice ="";
    var playerChoice="";
    println("Rock Paper or Scissors? Enter your choice")
    playerChoice = readln();

    val randomNumer = (1..3).random();
    //1 -rock 2 - paper 3 - scissors
    if(randomNumer == 1){
        computerChoice = "Rock";
    }else if(randomNumer == 2) {
        computerChoice = "Paper";
    }else if(randomNumer == 3){
        computerChoice = "Scissors";
    }
    println(computerChoice)

    var winner = "";
    if(playerChoice == computerChoice){
        winner = "Tie";
        println(winner)
    }else if (playerChoice == "Rock" && computerChoice == "Paper"){
        winner = "Computer won"
        println(winner);
    }else if(playerChoice == "Rock" && computerChoice=="Scissors"){
        winner = "Player won"
        println(winner)
    }else if (computerChoice == "Rock" && playerChoice == "Paper"){
        winner = "Player won"
        println(winner);
    }else if(computerChoice == "Rock" && playerChoice=="Scissors"){
        winner = "Computer won"
        println(winner)
    }else if(playerChoice == "Paper" && computerChoice=="Scissors"){
        winner = "Computer won"
        println(winner)
    }else if(playerChoice == "Scissors" && computerChoice == "Paper"){
        winner = "Player won"
        println(winner);
    }
}