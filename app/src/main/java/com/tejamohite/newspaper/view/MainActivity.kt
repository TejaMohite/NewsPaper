package com.tejamohite.newspaper.view
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.tejamohite.newspaper.api.RetrofitInstance
import com.tejamohite.newspaper.repository.NewspaperRepository
import com.tejamohite.newspaper.viewmodel.NewspaperViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = NewspaperRepository(RetrofitInstance.api)
        val viewModel = NewspaperViewModel(repository)
        setContent {
            val navController = rememberNavController()
            NavigationGraph(navController, viewModel)
        }
    }
}

