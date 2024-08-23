package com.example.wordle.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ans(Active: Boolean) {
    val activeColor = Color(0xFFFFFFFF)
    val inactiveColor = Color(0xFF787C7F)

    val color = if (Active) activeColor else inactiveColor

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.align(Alignment.Center)
        ) {
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .border(2.dp, color = color)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .border(2.dp, color = color)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .border(2.dp, color = color)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .border(2.dp, color = color)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .border(2.dp, color = color)
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}
