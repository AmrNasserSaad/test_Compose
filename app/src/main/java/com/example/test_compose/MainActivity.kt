package com.example.test_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            BoxTest()
        }

    }


    @Composable
    fun BoxTest() {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)

        ) {

            Row(
                modifier = Modifier
                    .background(Color.LightGray)
                    .align(Alignment.Center)
                    .padding(10.dp)
            ) {

                MyItem()
            }

        }
    }

     @Composable
    fun RowScope.MyItem() {
        Text(text = "Amr Nasser")
    }

}


