package com.example.finance_chatbot

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.financialanalysis.repository.FinancialDataRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class FinancialDataViewModel(private val repository: FinancialDataRepository) : ViewModel() {

    private val _financialData = MutableStateFlow("")
    val financialData: StateFlow<String> get() = _financialData

    init {
        fetchFinancialData()
    }

    private fun fetchFinancialData() {
        viewModelScope.launch {
            try {
                _financialData.value = repository.fetchFinancialData()
            } catch (e: Exception) {
                _financialData.value = "Error fetching data"
            }
        }
    }
}
