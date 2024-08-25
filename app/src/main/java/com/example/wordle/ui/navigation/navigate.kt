package com.example.wordle.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wordle.ui.viewModel.PlayViewModel
import com.example.wordle.ui.views.home
import com.example.wordle.ui.views.lost
import com.example.wordle.ui.views.play
import com.example.wordle.ui.views.won

@Composable
fun navigate(){
    val navController = rememberNavController()
    val playViewModel = PlayViewModel()

    NavHost(navController = navController, startDestination = "home"){
        composable("home"){
            home(navController, playViewModel)
        }
        composable("play"){
            play(navController, playViewModel)
        }
        composable("won"){
            won(navController, playViewModel)
        }
        composable("lost"){
            lost(navController, playViewModel)

        }
    }
}