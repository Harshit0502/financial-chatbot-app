package com.example.finance_chatbot.data


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class data(private val service: FinancialDataService) {

    suspend fun fetchFinancialData(): String {
        return withContext(Dispatchers.IO) {
            service.getFinancialData()
        }
    }
}

