package com.playground.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.playground.auth.ui.signin.SigninScreen
import com.playground.auth.ui.signup.SignupScreen
import com.playground.ui.theme.PlaygroundVenturoTheme

class MainActivity : ComponentActivity() {

    sealed class Screen(val route: String){
        object AuthSignin : Screen("auth/signin")

        object AuthSignup : Screen("auth/signup")

        object Home : Screen("feature/home")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlaygroundVenturoTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.AuthSignin.route
                ){
                    composable(Screen.AuthSignin.route){
                        SigninScreen(
                            navController = navController
                        )
                    }

                    composable(Screen.AuthSignup.route){
                        SignupScreen(
                            navController = navController
                        )
                    }

//                    composable(Screen.Home.route){
//                        HomeScreen(navController = navController)
//                    }
                }
            }
        }
    }
}