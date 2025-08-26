package com.playground.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.playground.ui.R

@Composable
fun VBaseButton(
        modifier: Modifier = Modifier,
        text: String = "Default Text",
        onClick: () -> Unit = {},
        enabled: Boolean = true,
        shape: Shape = RoundedCornerShape(8.dp),
        color: ButtonColors =
                ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White,
                )
) {
    Button(
            modifier = modifier,
            onClick = onClick,
            enabled = enabled,
            shape = shape,
            colors = color
    ) { Text(text) }
}

@Composable
fun VBaseIconButton(
        modifier: Modifier = Modifier,
        text: String = "Default Text",
        onClick: () -> Unit = {},
        enabled: Boolean = true,
        shape: Shape = RoundedCornerShape(8.dp),
        colors: ButtonColors =
                ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White,
                ),
        color: Color = Color.White,
        srcIcon: Int = R.drawable.ic_login,
        descIcon: String = "Default"

) {
    Button(
            modifier = modifier,
            onClick = onClick,
            enabled = enabled,
            shape = shape,
            colors = colors
    ) {
        Icon(
                painter = painterResource(srcIcon),
                contentDescription = descIcon,
                modifier = Modifier.size(24.dp),
                tint = color
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(text)
    }
}

@Preview
@Composable
fun VBaseButtonPreview() {
    VBaseButton()
}

@Preview
@Composable
fun VBaseIconButtonPreview() {
    VBaseIconButton()
}
