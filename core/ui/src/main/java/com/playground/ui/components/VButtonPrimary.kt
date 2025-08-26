package com.playground.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun VButtonPrimary(
    text: String = "Login",
    onClick: () -> Unit = {}
){
    VBaseButton(
        text = text,
        onClick = onClick,
        enabled = true,
        modifier = Modifier.fillMaxWidth().padding(16.dp).height(56.dp),
        color = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.White,
        )
    )
}

@Preview
@Composable
fun VButtonPrimaryPreview() {
    VButtonPrimary()
}