package com.example.kotlinspringbootboston.service

import com.example.kotlinspringbootboston.datasource.BankDataSource
import com.example.kotlinspringbootboston.model.Bank
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class BankService(@Qualifier("network") private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> =  dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)

    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)

    fun updateBank(bank: Bank): Bank {
        return dataSource.updateBank(bank)
    }

    fun deleteBank(accountNumber: String) = dataSource.deleteBank(accountNumber)

}