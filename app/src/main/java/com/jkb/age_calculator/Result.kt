package com.jkb.age_calculator

import android.app.DatePickerDialog
import android.graphics.Paint.Style
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jkb.age_calculator.ui.theme.AccentColor
import com.jkb.age_calculator.ui.theme.DarkBackgroundColor
import com.jkb.age_calculator.ui.theme.DarkContentColor
import com.jkb.age_calculator.ui.theme.DarkForegroundColor
import com.jkb.age_calculator.ui.theme.DarkTextColor

private val shortDescription =
    "The Age Calculator app allows you to quickly and easily calculate your age in years, months, and days. Simply enter your date of birth, and get instant results, including age differences between multiple individuals. User-friendly and efficient, it's perfect for planning birthdays and exploring age-related milestones!"

@Preview
@Composable
fun ResultPage() {

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
            text = "So you are 30 years old.",
            color = Color.White,
            style = MaterialTheme.typography.headlineSmall,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light
        )
        BodyOfResult(
            modifier = Modifier.align(Alignment.Center),
        )
    }
}

@Composable
fun BodyOfResult(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(14.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(DarkContentColor), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "details".uppercase(),
            color = DarkTextColor,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light,
            textDecoration = TextDecoration.Underline
        )
        Spacer(modifier = Modifier.height(30.dp))
        Column {
            Text(
                text = "Years: 30",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Month: 30",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Days: 30",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Minutes: 30",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Light
            )
        }
        Text(
            modifier = Modifier.padding(35.dp),
            text = shortDescription,
            color = Color.White,
            style = MaterialTheme.typography.bodySmall
        )


    }
}

