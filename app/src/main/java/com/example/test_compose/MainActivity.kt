package com.example.test_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier

            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Red)

                        .padding(20.dp)


                ) {
                    Text(text = "تحيا مصر ")
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(20.dp)


                ) {
                    Text(text = "تحيا مصر ")

                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Black)
                        .padding(20.dp)


                ) {
                    Text(text = "تحيا مصر ", color = Color.White, textAlign = TextAlign.Center)
                }
            }

        }
    }
}


