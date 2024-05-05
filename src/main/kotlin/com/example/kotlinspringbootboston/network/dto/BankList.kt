package com.example.kotlinspringbootboston.network.dto

import com.example.kotlinspringbootboston.model.Bank

data class BankList {

    val results: Collection<Bank>

}