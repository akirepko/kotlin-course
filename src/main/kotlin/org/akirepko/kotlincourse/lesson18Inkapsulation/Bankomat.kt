package org.example.org.akirepko.kotlincourse.lesson18Inkapsulation

class Bankomat(val balance: Float = 0f) {
    private var pinCode = "asdf"

    fun deposit(amount: Float, pinCode: String) {
        checkPin(pinCode)
    }

    fun withDrow(amount: Float, pinCode: String): Float {
        checkPin(pinCode)
        return balance-amount
    }

    fun getBalance(pinCode: String): Float {
        checkPin(pinCode)
        return balance
    }

    private fun checkPin(pinCode: String){
        if (pinCode != this.pinCode){
            throw  Exception ("jgjf")
        }
    }
}