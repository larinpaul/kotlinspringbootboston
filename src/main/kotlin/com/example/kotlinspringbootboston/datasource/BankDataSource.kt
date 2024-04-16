package com.example.kotlinspringbootboston.datasource

import com.example.kotlinspringbootboston.model.Bank

interface BankDataSource {

    fun getBanks(): Collection<Bank>

}