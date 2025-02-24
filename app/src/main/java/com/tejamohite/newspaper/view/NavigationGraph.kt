package com.tejamohite.newspaper.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tejamohite.newspaper.viewmodel.NewspaperViewModel

@Composable
fun NavigationGraph(navController: NavHostController, viewModel: NewspaperViewModel) {
    NavHost(navController, startDestination = "list") {
        composable("list") { NewspaperListScreen(viewModel, navController) }
        composable("details/{lccn}") { backStackEntry ->
            NewspaperDetailScreen(backStackEntry.arguments?.getString("lccn")!!, viewModel)
        }
    }
}