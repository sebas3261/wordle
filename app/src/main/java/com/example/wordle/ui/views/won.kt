package com.example.wordle.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.wordle.R
import com.example.wordle.ui.viewModel.PlayViewModel

@Composable
fun won(navController: NavController, playViewModel: PlayViewModel){
    val geologicaFont = FontFamily(Font(R.font.font))
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.won))
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF2C2C2C)),
    ){
        Column(
            modifier = Modifier
                .align(Alignment.Center)
        ) {
            Text(
                text = "You Won",
                style = TextStyle(
                    fontFamily = geologicaFont,
                    fontWeight = FontWeight.Medium,
                    fontSize =40.sp,
                    color = Color.White
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            LottieAnimation(
                composition = composition,
                iterations = LottieConstants.IterateForever,
                modifier = Modifier
                    .size(600.dp)
            )
            Button(
                onClick = { navController.navigate("home") },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(150.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2C2C2C)
                ),
                border = ButtonDefaults.outlinedButtonBorder
            ){
                Text(
                    text = "Home",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Button(
                onClick = {
                    navController.navigate("play")
                    playViewModel.resetGame()
                          },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(150.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                border = ButtonDefaults.outlinedButtonBorder

            ){
                Text(
                    text = "Play again",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
            }
        }
    }
}