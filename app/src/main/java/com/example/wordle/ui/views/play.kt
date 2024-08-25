package com.example.wordle.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.wordle.ui.components.ans
import com.example.wordle.ui.components.title
import com.example.wordle.ui.viewModel.PlayViewModel

@Composable
fun play(navController: NavController, playViewModel: PlayViewModel) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    var text by remember { mutableStateOf("") }
    var colors: IntArray = IntArray(5)
    var showNextButton by remember { mutableStateOf(false) }
    var editText by remember { mutableStateOf(true) }
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Column {
                Text(text = "Drawer content")
                Button(onClick = { navController.navigate("home") }) {
                    Text(text = "Exit")
                }
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF2C2C2C))
        ) {
            if(editText) {
                TextField(
                    value = text,
                    onValueChange = { newText ->
                        if (newText.length <= 5) {
                            text = newText
                        }
                    },
                    modifier = Modifier
                        .alpha(0f)
                        .fillMaxSize()
                )
            }
            Column {
                Box(
                    modifier = Modifier
                        .padding(top = 60.dp)
                        .fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.Center)
                    ) {
                        title()
                    }
                }
                ans(playViewModel.booleanList[0], text, colors)
                Spacer(modifier = Modifier.height(20.dp))
                ans(playViewModel.booleanList[1], text, colors)
                Spacer(modifier = Modifier.height(20.dp))
                ans(playViewModel.booleanList[2], text, colors)
                Spacer(modifier = Modifier.height(20.dp))
                ans(playViewModel.booleanList[3], text, colors)
                Spacer(modifier = Modifier.height(20.dp))
                ans(playViewModel.booleanList[4], text, colors)
                Spacer(modifier = Modifier.height(20.dp))
                ans(playViewModel.booleanList[5], text, colors)
                Spacer(modifier = Modifier.height(20.dp))
                if(editText) {
                    Button(
                        onClick = {
                            if (playViewModel.verlong(text)) {
                                colors = playViewModel.verify(text.toLowerCase())
                                text = ""
                                showNextButton = true
                                editText = false
                                if(playViewModel.won(colors)){
                                    navController.navigate("won")
                                }
                            }
                        },
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .width(150.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White
                        )
                    ) {
                        Text(
                            text = "Verify",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        )
                    }
                }
                if (showNextButton) {
                    Button(
                        onClick = {
                            playViewModel.NextValue()
                            colors = playViewModel.resetColors()
                            showNextButton = false
                            editText = true
                            if(playViewModel.booleanList[6] == true) {
                                navController.navigate("lost")
                            }
                        },
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .width(150.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White
                        )
                    ) {
                        Text(
                            text = "Next",
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
}
