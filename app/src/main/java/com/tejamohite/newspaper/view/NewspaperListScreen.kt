package com.tejamohite.newspaper.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import com.tejamohite.newspaper.viewmodel.NewspaperViewModel

@Composable
fun NewspaperListScreen(viewModel: NewspaperViewModel, navController: NavController) {
    val newspapers by viewModel.newspapers.observeAsState(emptyList())
    LazyColumn {
        items(newspapers) { newspaper ->
            NewspaperItemRow(newspaper, navController)
        }
    }
}
