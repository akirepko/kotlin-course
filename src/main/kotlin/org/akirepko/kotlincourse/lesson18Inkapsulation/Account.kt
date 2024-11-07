package org.example.org.akirepko.kotlincourse.lesson18Inkapsulation

class Account(private var balance: Double) {
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }
}