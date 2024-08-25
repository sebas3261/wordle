package com.example.wordle.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wordle.R

@Composable
fun ans(Active: Boolean, text: String, colors: IntArray) {
    // Almacena el texto solo si el estado activo es true
    var savedText by remember { mutableStateOf("") }
    var savedColors by remember { mutableStateOf(IntArray(5)) }
    if (Active && text.isNotEmpty()) { savedText = text }
    if (Active && colors.isNotEmpty()) { savedColors = colors}

    val activeColor = Color(0xFFFFFFFF)
    val inactiveColor = Color(0xFF787C7F)
    val geologicaFont = FontFamily(Font(R.font.font))
    val charArray = savedText.toCharArray()
    val color = if (Active) activeColor else inactiveColor

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.align(Alignment.Center)
        ) {
            for (i in 0 until 5) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .border(2.dp, color = color)
                        .background(if(savedColors[i] == 1) Color(0xFF6BAA65) else if(savedColors[i] == 2) Color(0xFFC9B457) else if(savedColors[i] == 3) Color(0xFF787C7F) else Color.Transparent)
                ) {
                    if (i < charArray.size) {
                        Text(
                            text = charArray[i].toString().toUpperCase(),
                            style = TextStyle(
                                fontFamily = geologicaFont,
                                fontWeight = FontWeight.Medium,
                                fontSize = 40.sp,
                                color = Color.White
                            ),
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
                if (i < 4) Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }
}
