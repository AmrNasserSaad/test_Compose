package com.example.test_compose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // BoxTest()

            // FoodApp()

            // testALotOfThing()

           // testConitionAndLoops(team = listOf("Ahmed", "Ahmed", "Amr", "Ahmed", "Ahmed", "Ahmed"))

        }
    }

//    @Composable
//    private fun testConitionAndLoops(team: List<String>) {
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceEvenly
//        ) {
//            team.forEach {
//                if (it == "Amr") {
//                    Button(
//                        modifier = Modifier.width(200.dp),
//                        onClick = { /*TODO*/ }) {
//                        Text(
//                            text = "$it"
//                        )
//                    }
//                } else {
//                    Text(
//                        text = "$it"
//                    )
//                }
//
//            }
//        }
//    }

//    @Composable
//    private fun testALotOfThing() {
//        Column(
//            modifier = Modifier
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceEvenly
//        ) {
//
//            Text(
//                modifier = Modifier
//                    .background(color = Color.Cyan),
//                fontSize = 66.sp,
//                text = "Amr Naser"
//            )
//
//            Button(
//                modifier = Modifier.width(200.dp),
//                onClick = { /*TODO*/ }) {
//                Text(
//                    text = "Click me"
//                )
//            }
//        }
//    }

}


