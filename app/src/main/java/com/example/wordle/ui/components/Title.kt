package com.example.wordle.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wordle.R

@Composable
fun title(){
    val geologicaFont = FontFamily(
        Font(R.font.font)
    )
    Row(
        modifier = Modifier
            .height(100.dp)
    ) {
        Box(
            modifier = Modifier
                .background(color = Color(0xFF6BAA65))
                .size(60.dp)
        ) {
            Text(
                text = "W",
                style = TextStyle(
                    fontFamily = geologicaFont,
                    fontWeight = FontWeight.Medium,
                    fontSize =40.sp,
                    color = Color.White
                ),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFFC9B457))
                .size(60.dp)
        ) {
            Text(
                text = "O",
                style = TextStyle(
                    fontFamily = geologicaFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 40.sp,
                    color = Color.White
                ),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFF787C7F))
                .size(60.dp)
        ) {
            Text(
                text = "R",
                style = TextStyle(
                    fontFamily = geologicaFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 40.sp,
                    color = Color.White
                ),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFF6BAA65))
                .size(60.dp)
        ) {
            Text(
                text = "D",
                style = TextStyle(
                    fontFamily = geologicaFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 40.sp,
                    color = Color.White
                ),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFFC9B457))
                .size(60.dp)
        ) {
            Text(
                text = "L",
                style = TextStyle(
                    fontFamily = geologicaFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 40.sp,
                    color = Color.White
                ),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFF787C7F))
                .size(60.dp)
        ) {
            Text(
                text = "E",
                style = TextStyle(
                    fontFamily = geologicaFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 40.sp,
                    color = Color.White
                ),
                modifier = Modifier
                    .align(Alignment.Center)

            )
        }
    }
}