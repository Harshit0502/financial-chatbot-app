package com.example.finance_chatbot.data

import retrofit2.http.GET

interface FinancialDataService {

    @GET("path/to/financial/data") // Replace with actual endpoint
    suspend fun getFinancialData(): String // Replace String with actual data model
}
