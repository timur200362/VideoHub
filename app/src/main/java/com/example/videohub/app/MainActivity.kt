package com.example.videohub.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.videohub.presentations.screens.ListVideoScreen
import com.example.videohub.ui.theme.VideoHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VideoHubTheme {
                Surface(modifier = Modifier.Companion.fillMaxSize()) {
                    ListVideoScreen()
                }
            }
        }
    }
}