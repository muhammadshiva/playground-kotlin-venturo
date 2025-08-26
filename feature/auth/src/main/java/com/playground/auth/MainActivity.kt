package com.playground.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.playground.auth.ui.signin.SigninScreen
import com.playground.auth.ui.signup.SignupScreen
import com.playground.ui.theme.PlaygroundVenturoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlaygroundVenturoTheme {
                Scaffold(containerColor = Color.White, modifier = Modifier.fillMaxSize()) {
                        innerPadding ->
                    //                    Greeting(
                    //                        name = "Muhammad Shiva",
                    //                        modifier = Modifier.padding(innerPadding)
                    //                    )
                    SignupScreen(
                            modifier =
                                    Modifier.fillMaxSize()
                                            .padding(innerPadding)
                                            .background(Color.White)
                                            .padding(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlaygroundVenturoTheme { Greeting("Android") }
}
