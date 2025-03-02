package com.jkb.age_calculator

import android.graphics.Paint.Style
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jkb.age_calculator.ui.theme.DarkBackgroundColor
import com.jkb.age_calculator.ui.theme.DarkContentColor
import com.jkb.age_calculator.ui.theme.DarkTextColor

private val shortDescription =
    "The Age Calculator app allows you to quickly and easily calculate your age in years, months, and days. Simply enter your date of birth, and get instant results, including age differences between multiple individuals. User-friendly and efficient, it's perfect for planning birthdays and exploring age-related milestones!"

@Preview
@Composable
fun HomePage() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DarkBackgroundColor)
            .padding(12.dp)
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
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .background(DarkContentColor), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "date of birth".uppercase(),
            color = DarkTextColor,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier = Modifier.padding(35.dp),
            text = shortDescription,
            color = Color.White,
            style = MaterialTheme.typography.bodySmall
        )


    }
}