package com.example.composebasics.lists_animations

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebasics.layouts.MessageCard
import com.example.composebasics.material_design.SampleData
import com.example.composebasics.model.Message

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    MaterialTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}