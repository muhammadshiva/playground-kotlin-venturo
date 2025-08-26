package com.playground.auth.ui.signin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.playground.auth.MainActivity
import com.playground.ui.components.VButtonPrimary
import com.playground.ui.components.VImageViewClick
import com.playground.ui.components.VTextFieldUi
import com.playground.ui.components.VTextRegular
import com.playground.ui.components.VTextRegularWithClick
import com.playground.ui.components.VTextRow
import com.playground.ui.components.VTextUiHeader

@Composable
fun SigninScreen(
        navController: NavController = rememberNavController(),
) {

    Scaffold(containerColor = Color.White, modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
                modifier = Modifier.padding(innerPadding).padding(16.dp),
        ) {
            // Header
            VImageViewClick(
                    onClick = {
                        navController.popBackStack()
                    },
            )

            Spacer(modifier = Modifier.height(30.dp))

            VTextUiHeader(
                    text = "Welcome to Sequre App",
            )

            Spacer(modifier = Modifier.height(10.dp))

            VTextRegularWithClick(
                    text = "Please fill e-mail and password to login you account. Or ",
                    textClick = "Sign Up",
                    onClick = { navController.navigate(MainActivity.Screen.AuthSignup.route) }
            )

            Spacer(modifier = Modifier.height(25.dp))

            // Email Field
            VTextRegular(text = "Email", modifier = Modifier.padding(horizontal = 16.dp))

            Spacer(modifier = Modifier.height(10.dp))

            VTextFieldUi(value = "Email", onTyping = {})

            // Password Field
            Spacer(modifier = Modifier.height(20.dp))

            VTextRegular(text = "Password", modifier = Modifier.padding(horizontal = 16.dp))

            VTextFieldUi(
                    value = "Password",
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    onTyping = {}
            )

            // Remember Me & Forgot Password
            VTextRow(
                    textLeft = "Remember me",
                    textRight = "Forgot Password ?",
                    checked = false,
                    onCheckedChange = {},
                    onTextClick = {}
            )

            // Button Field
            VButtonPrimary(text = "Login", onClick = {})
        }
    }
}

@Preview(showBackground = true, device = Devices.NEXUS_5)
@Composable
fun SigninScreenPreview() {
    SigninScreen()
}
