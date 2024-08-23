package com.example.wordle.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.wordle.ui.components.ans
import com.example.wordle.ui.components.title
import androidx.compose.foundation.background
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding

@Composable
fun play(navController: NavController){
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val textState = rememberSaveable { mutableStateOf("") }
    val focusRequester = remember { FocusRequester() }

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
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF2C2C2C))
        ) {
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
                ans(true)
                Spacer(modifier = Modifier.height(20.dp))
                ans(false)
                Spacer(modifier = Modifier.height(20.dp))
                ans(false)
                Spacer(modifier = Modifier.height(20.dp))
                ans(false)
                Spacer(modifier = Modifier.height(20.dp))
                ans(false)
                Spacer(modifier = Modifier.height(20.dp))
                ans(false)
            }
        }
    }
}