package com.playground.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.playground.ui.theme.StrongGreen

@Composable
fun VCheckboxUi(
        checked: Boolean = false,
        onCheckedChange: (Boolean) -> Unit = {},
        label: String = "Remember me",
        modifier: Modifier = Modifier
) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier) {
        Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
                colors =
                        CheckboxDefaults.colors(
                                checkedColor = StrongGreen,
                        )
        )

        Text(
                label,
                modifier = modifier,
                style =
                        TextStyle(
                                fontSize = 12.sp,
                                lineHeight = 14.sp,
                                textAlign = TextAlign.Left,
                                fontWeight = FontWeight.Normal
                        ),
        )
    }
}

@Preview
@Composable
fun VCheckboxUiPreview() {
    VCheckboxUi()
}
