package com.manuelduarte077.noteapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.manuelduarte077.noteapp.R


val RedHatFont = FontFamily(
    Font(R.font.redhatdisplay_regular, FontWeight.Normal),
    Font(R.font.redhatdisplay_medium, FontWeight.Medium),
    Font(R.font.redhatdisplay_semibold, FontWeight.SemiBold),
    Font(R.font.redhatdisplay_bold, FontWeight.Bold),
    Font(R.font.redhatdisplay_italic, FontWeight.Normal, style = FontStyle.Italic),
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = RedHatFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)