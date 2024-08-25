package com.example.wordle.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.wordle.ui.components.title
import com.example.wordle.ui.viewModel.PlayViewModel

@Composable
fun home(navController: NavController, playViewModel: PlayViewModel){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF2C2C2C))
    ){
        Box(
            modifier = Modifier
                .align(Alignment.Center)
        ){
            Column(){
                title()
                Spacer(modifier = Modifier.height(70.dp))
                Button(
                    onClick = {  },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(150.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2C2C2C)
                    ),
                    border = ButtonDefaults.outlinedButtonBorder
                ){
                    Text(
                        text = "Suscribe",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Button(
                    onClick = {  },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(150.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2C2C2C)
                    ),
                    border = ButtonDefaults.outlinedButtonBorder
                ){
                    Text(
                        text = "Log In",
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
                        text = "Play",
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
}