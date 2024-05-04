package com.example.kotlinspringbootboston.datasource

import com.example.kotlinspringbootboston.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
 
    fun retrieveBank(accountNumber: String): Bank

    fun createBank(bank: Bank): Bank

    fun updateBank(bank: Bank):  Bank

    fun deleteBank(accountNumber: String)

}