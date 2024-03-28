package com.example.bankaccountprogram

class BankAccount(var accountHolder: String, var balance:Double) {
    private val transactionHistory = mutableListOf<String>();
    fun deposit(amount:Double){
        balance += amount;
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount: Double){
        if(amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrawed $$amount")
        }else{
            println("You don't have the funds to withdrew $$amount")
        }
    }
    fun acctBalance(){
        println("$accountHolder's balance is $balance")
    }
    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for (messages in transactionHistory){
            println(messages);
        }
    }
}