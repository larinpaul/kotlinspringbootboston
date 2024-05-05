package com.example.kotlinspringbootboston.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Bank(
    @JsonProperty("account_number") // It is very common on DTOs to specify the name os the json property...
    val accountNumber: String,

    @JsonProperty("trust")
    val trust: Double,

    @JsonProperty("default_transaction_fee")
    val transactionFee: Int
) // Now our serializer knows how to handle these...
