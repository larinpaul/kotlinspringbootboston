package com.example.kotlinspringbootboston.service;

import com.example.kotlinspringbootboston.datasource.BankDataSource
import io.mockk.MockKSettings.relaxed
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test;

internal class BankServiceTest {

    // Shall we mock the data? (a pure Unit test, we only test what the service class does)
    // Or do we want to have an integration test that will have the actual data from the data source?
    // Well, here we will just use the mock data, so it will be a unit test

    // We are not using any dependency injections
    // we are just using POJO, and creating the objects manually

    private val dataSource: BankDataSource = mockk(relaxed = true) // relaxed means that when it's called, it will return some default value
    // if you do care about what it retuns, you need to specify what it returns in the // every block instead of just using relaxed
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // when
        bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() } // this is a very fun method from mockk

    }


}