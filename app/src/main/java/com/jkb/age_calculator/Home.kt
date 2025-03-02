package com.jkb.age_calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jkb.age_calculator.ui.theme.DarkBackgroundColor

@Preview
@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DarkBackgroundColor)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 100.dp),
            text = "Let's Find Out \n Your Real Age",
            color = Color.White,
            style = MaterialTheme.typography.headlineSmall,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light
        )
        BodySection(modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun BodySection(modifier: Modifier = Modifier) {
    
}