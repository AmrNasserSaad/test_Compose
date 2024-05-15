package com.example.test_compose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview()
@Composable
fun BoxTest() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue )

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
    var counter by remember {
        mutableStateOf(0)
    }
    Text(
        text = "Counter = $counter",
        modifier = Modifier.clickable {
            counter++
        }
    )
}