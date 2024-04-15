package com.example.kotlinspringbootboston.model

class Bank {

    private val accountNumber: String
        get() = field // This is not necessary, since if you have a val, Kotlin will generate a default getter for you
//        set(value) { field = value }
    private val trust: Double
    private val transactionFee: Int

    constructor(accountNumber: String, trust: Double, transactionFee: Int) {
        this.accountNumber = accountNumber
        this.trust = trust
        this.transactionFee = transactionFee
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Bank

        if (accountNumber != other.accountNumber) return false
        if (trust != other.trust) return false
        if (transactionFee != other.transactionFee) return false

        return true
    }

    override fun hashCode(): Int {
        var result = accountNumber.hashCode()
        result = 31 * result + trust.hashCode()
        result = 31 * result + transactionFee
        return result
    }

    override fun toString(): String {
        return "Bank(accountNumber='$accountNumber', trust=$trust, transactionFee=$transactionFee)"
    }



}