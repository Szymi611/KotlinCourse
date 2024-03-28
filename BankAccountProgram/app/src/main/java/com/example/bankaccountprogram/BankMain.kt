package com.example.bankaccountprogram

fun main(){

    val myBankAccount = BankAccount("Szymon", 1330.20)

    /*myBankAccount.deposit(200.0)
    myBankAccount.withdraw(1200.0)
    myBankAccount.deposit(3000.0)
    myBankAccount.deposit(500.60)
    myBankAccount.deposit(3315.15)
    myBankAccount.displayTransactionHistory()
    //println("${myBankAccount.accountHolder}'s balance is  ${myBankAccount.balance}")
    myBankAccount.acctBalance(); */

    val sarahAccount = BankAccount("Sarah", 0.0)
    sarahAccount.deposit(100.0)
    sarahAccount.withdraw(10.0)
    sarahAccount.deposit(300.0)
    sarahAccount.displayTransactionHistory()
    sarahAccount.acctBalance()
}