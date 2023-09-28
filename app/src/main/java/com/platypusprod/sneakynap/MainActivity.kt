package com.platypusprod.sneakynap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.platypusprod.sneakynap.components.SplashScreen
import com.platypusprod.sneakynap.ui.theme.SneakyNapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SneakyNapTheme {
                // A surface container using the 'background' color from the theme
                SplashScreen()
            }
        }
    }
}
