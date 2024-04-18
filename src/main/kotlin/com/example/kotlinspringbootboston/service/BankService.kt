package com.example.kotlinspringbootboston.service

import com.example.kotlinspringbootboston.datasource.BankDataSource
import com.example.kotlinspringbootboston.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> =  dataSource.retrieveBanks()


}