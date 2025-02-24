package com.tejamohite.newspaper.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tejamohite.newspaper.viewmodel.NewspaperViewModel

@Composable
fun NewspaperDetailScreen(lccn: String, viewModel: NewspaperViewModel) {
    val newspapers by viewModel.newspapers.observeAsState(emptyList())
    val newspaper = newspapers.find { it.lccn == lccn }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = newspaper?.title ?: "Loading...", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = "LCCN: ${newspaper?.lccn ?: "Unknown"}")
        Text(text = "State: ${newspaper?.state ?: "Unknown"}")
        Text(text = "More Info: ${newspaper?.url ?: "N/A"}")
    }
}