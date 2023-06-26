package tech.apter.coloredshadow

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private const val WHITE_ALPHA = 0.8f
private const val SHADOW_ALPHA = 0.24f
private const val BUTTON_SIZE = 96
private const val ICON_SIZE = 32
private const val OFFSET = 16
private const val BLUR_RADIUS = 40f

@Composable
internal fun ColoredShadowButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .height(BUTTON_SIZE.dp)
            .width(BUTTON_SIZE.dp)
            .coloredShadow(
                color = Color.White
                    .copy(alpha = WHITE_ALPHA),
                offsetX = -OFFSET.dp,
                offsetY = -OFFSET.dp,
                blurRadius = BLUR_RADIUS,
            )
            .coloredShadow(
                color = Color.DarkGray
                    .copy(alpha = SHADOW_ALPHA),
                offsetX = OFFSET.dp,
                offsetY = OFFSET.dp,
                blurRadius = BLUR_RADIUS
            )
            .clip(CircleShape)
            .clickable { onClick() }
            .background(Color.LightGray),
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            modifier = Modifier
                .height(ICON_SIZE.dp)
                .width(ICON_SIZE.dp),
            contentDescription = null,
        )
    }
}
