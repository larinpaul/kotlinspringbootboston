package com.example.kotlinspringbootboston.datasource

import com.example.kotlinspringbootboston.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
 
    fun retrieveBank(accountNumber: String): Bank

}