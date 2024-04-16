package com.example.kotlinspringbootboston.datasource.mock

import com.example.kotlinspringbootboston.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource {

    override fun getBanks(): Collection<Bank> {

    }

}