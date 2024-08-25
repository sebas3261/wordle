package com.example.wordle.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wordle.ui.viewModel.PlayViewModel
import com.example.wordle.ui.views.home
import com.example.wordle.ui.views.play

@Composable
fun navigate(){
    val navController = rememberNavController()
    val playViewModel = PlayViewModel()

    NavHost(navController = navController, startDestination = "home"){
        composable("home"){
            home(navController)
        }
        composable("play"){
            play(navController, playViewModel)
        }

    }
}