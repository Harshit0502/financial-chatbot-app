package com.example.finance_chatbot

import androidx.compose.ui.unit.dp

package com.example.financialanalysis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.financialanalysis.ui.theme.FinancialAnalysisTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinancialAnalysisTheme {
                FinancialDataScreen()
            }
        }
    }
}

@Composable
fun FinancialDataScreen(viewModel: FinancialDataViewModel = viewModel()) {
    val financialData by viewModel.financialData.collectAsState(initial = "")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Financial Data", style = MaterialTheme.typography.h5)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = financialData)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FinancialAnalysisTheme {
        FinancialDataScreen()
    }
}

