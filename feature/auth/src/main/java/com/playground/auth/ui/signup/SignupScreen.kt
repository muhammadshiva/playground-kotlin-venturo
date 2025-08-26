package com.playground.auth.ui.signup

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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.playground.ui.components.VButtonPrimary
import com.playground.ui.components.VImageViewClick
import com.playground.ui.components.VTextFieldUi
import com.playground.ui.components.VTextRegular
import com.playground.ui.components.VTextRegularWithClick
import com.playground.ui.components.VTextRow
import com.playground.ui.components.VTextUiHeader


@Composable
fun SignupScreen(
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
                text = "Create your account",
            )

            Spacer(modifier = Modifier.height(10.dp))

            VTextRegularWithClick(
                text = "Do you already have account ? ",
                textClick = "Sign In",
                onClick = {
                    navController.popBackStack()
                }
            )

            Spacer(modifier = Modifier.height(25.dp))

            // Name
            VTextRegular(
                text = "Name",
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))

            VTextFieldUi(
                value = "Name",
                onTyping = {}
            )

            Spacer(modifier = Modifier.height(10.dp))


            // Phone Field
            VTextRegular(
                text = "Phone",
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))

            VTextFieldUi(
                value = "Phone",
                onTyping = {}
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Email Field
            VTextRegular(
                text = "Email",
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))

            VTextFieldUi(
                value = "Email",
                onTyping = {}
            )

            // Password Field
            Spacer(modifier = Modifier.height(10.dp))

            VTextRegular(
                text = "Password",
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            VTextFieldUi(
                value = "Password",
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onTyping = {}
            )


            // Confirm Password
            Spacer(modifier = Modifier.height(10.dp))

            VTextRegular(
                text = "Confirm Password",
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            VTextFieldUi(
                value = "Confirm Password",
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onTyping = {}
            )


            // Button Field
            VButtonPrimary(
                text = "Create Account",
                onClick = {}
            )
        }
    }
}

@Preview(showBackground = true, device = Devices.NEXUS_5)
@Composable
fun SignupScreenPreview(){
    SignupScreen()
}