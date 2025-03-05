package com.jkb.age_calculator

import android.R
import android.app.DatePickerDialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jkb.age_calculator.ui.theme.Age_calculatorTheme
import java.util.Calendar

class MainActivity : ComponentActivity() {
    private var dateText = ""
    private val datePicker: DatePickerDialog by lazy {
        DatePickerDialog(
            this,
            R.style.Theme_DeviceDefault_Dialog,
            { _, year, month, day -> dateText = "$day-${month + 1}-$year" },
            getCurrent(Calendar.YEAR),
            getCurrent(Calendar.MONTH),
            getCurrent(Calendar.DAY_OF_MONTH)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Age_calculatorTheme {
                var dateText: String by remember { mutableStateOf("DD-MM-YYYY") }
                datePicker.setOnDismissListener {
                    dateText = if (this@MainActivity.dateText.isBlank()) {
                        "DD-MM-YYYY"
                    } else {
                        this@MainActivity.dateText
                    }

                }


                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "homepage",
                    enterTransition = { slideInHorizontally(initialOffsetX = { it }) },
                    exitTransition = { slideOutHorizontally(targetOffsetX = { -it }) },
                    popExitTransition = { slideOutHorizontally(targetOffsetX = { it }) },
                    popEnterTransition = { slideInHorizontally(initialOffsetX = { -it }) }
                ) {
                    composable(route = "homepage") {
                        HomePage(
                            dateText = dateText,
                            onClick = { datePicker.show() },
                            onClickCalc = {
                                navController.navigate("result_page/$dateText")
                            })
                    }
                    composable(route = "result_page/{dateText}") {
                        ResultPage(dateText = it.arguments?.getString("dateText").toString())
                    }
                }
            }
        }
    }

    private fun getCurrent(type: Int): Int {
        return Calendar.getInstance().get(type)
    }
}

