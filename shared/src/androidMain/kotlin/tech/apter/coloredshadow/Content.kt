package tech.apter.coloredshadow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Content() {
    Box(
        modifier = Modifier.background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        ColoredShadowButton()
    }
}
