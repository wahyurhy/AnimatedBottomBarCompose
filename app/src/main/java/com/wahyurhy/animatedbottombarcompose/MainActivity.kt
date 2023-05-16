package com.wahyurhy.animatedbottombarcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.wahyurhy.animatedbottombarcompose.ui.theme.AnimatedBottomBarComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedBottomBarComposeTheme {
                MainScreen()
            }
        }
    }
}