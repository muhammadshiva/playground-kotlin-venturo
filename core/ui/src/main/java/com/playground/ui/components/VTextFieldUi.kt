package com.playground.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.playground.ui.theme.LightGray

@Composable
fun VTextFieldUi(
        value: String = "",
        onTyping: (String) -> Unit = {},
        visualTransformation: VisualTransformation = VisualTransformation.None,
        keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
) {
    BasicTextField(
            value = value,
            onValueChange = { onTyping.invoke(it) },
            modifier =
                    Modifier.fillMaxWidth()
                            .padding(14.dp)
                            .border(
                                    width = 1.dp,
                                    color = LightGray,
                                    shape = RoundedCornerShape(6.dp)
                            )
                            .background(Color.White)
                            .padding(8.dp),
            textStyle =
                    TextStyle(
                            color = Color.Black,
                            fontSize = 14.sp,
                    ),
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
    )
}

@Preview
@Composable
fun EmailPreview() {
    VTextFieldUi(
            value = "Email",
            onTyping = {},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}

@Preview
@Composable
fun PasswordPreview() {
    VTextFieldUi(
            value = "Password",
            onTyping = {},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}

@Composable
fun VTextRow(
        checked: Boolean = true,
        onCheckedChange: (Boolean) -> Unit = {},
        onTextClick: () -> Unit = {},
        textLeft: String = "Remember me",
        textRight: String = "Forgot Password ?"
) {
    Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        VCheckboxUi(
                checked = checked,
                onCheckedChange = onCheckedChange,
                label = textLeft,
                modifier = Modifier.padding(vertical = 8.dp).weight(1f)
        )

        val annotatedString = buildAnnotatedString { append(textRight) }

        ClickableText(
                text = annotatedString,
                modifier = Modifier.padding(horizontal = 16.dp),
                style =
                        TextStyle(
                                fontSize = 12.sp,
                                lineHeight = 14.sp,
                                textAlign = TextAlign.Left,
                                fontWeight = FontWeight.Normal
                        ),
                onClick = { _ -> onTextClick() }
        )
    }
}

@Preview
@Composable
fun VTextRowPreview() {
    VTextRow()
}
