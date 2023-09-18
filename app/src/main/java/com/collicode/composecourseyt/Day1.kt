package com.collicode.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class Day1  : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column( modifier= Modifier
                .fillMaxSize(0.5f)
                .background(Color.LightGray ) ,horizontalAlignment = Alignment.CenterHorizontally
                , verticalArrangement = Arrangement.SpaceAround) {
                Text(text = "Hello")
                Text(text = "World")
                Text(text = "Hello")
            }
        }
    }
}