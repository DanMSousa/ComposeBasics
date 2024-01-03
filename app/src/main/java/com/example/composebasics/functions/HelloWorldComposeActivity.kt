package com.example.composebasics.functions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class HelloWorldComposeActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Text("Hello World Compose")
            MessageCard(name = "Android compose")
        }
    }
    
    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello $name")
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard(name = "Test Preview")
    }
}