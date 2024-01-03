package com.example.composebasics.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebasics.model.Message


class SeveralTextsActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        Message("Daniel", "Dá uma olhada no Compose")
    )
}