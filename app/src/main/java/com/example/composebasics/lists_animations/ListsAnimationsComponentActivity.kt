package com.example.composebasics.lists_animations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import com.example.composebasics.material_design.SampleData

class ListsAnimationsComponentActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            MaterialTheme {
                Conversation(messages = SampleData.conversationSample)
            }
        }
    }

}