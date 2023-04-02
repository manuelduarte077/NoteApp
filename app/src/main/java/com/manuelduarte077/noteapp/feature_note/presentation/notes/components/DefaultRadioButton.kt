package com.manuelduarte077.noteapp.feature_note.presentation.notes.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.manuelduarte077.noteapp.ui.theme.RedHatFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultRadioButton(
    text: String,
    selected: Boolean,
    onSelect: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = selected, onClick = onSelect,
            colors = RadioButtonDefaults.colors(
                selectedColor = MaterialTheme.colorScheme.primary,
                unselectedColor = MaterialTheme.colorScheme.onBackground
            ),
            modifier = Modifier.semantics {
                contentDescription = text
            },
        )
        Text(
            text = text, style = TextStyle(
                fontFamily = RedHatFont,
                fontWeight = FontWeight.Normal,
                fontSize = MaterialTheme.typography.labelLarge.fontSize,

            )
        )
    }
}