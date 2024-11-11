package com.example.finance_chatbot.di


import com.example.financialanalysis.network.FinancialDataService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    private const val BASE_URL = "https://api.yourfinancialdata.com" // Replace with your base URL

    val retrofit: FinancialDataService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(retrofit::class.java)
    }
}
