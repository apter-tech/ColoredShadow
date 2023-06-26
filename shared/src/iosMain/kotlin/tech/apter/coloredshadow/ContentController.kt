package tech.apter.coloredshadow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

// Called from Swift code.
@Suppress("unused")
fun createContentController(): UIViewController =
    ComposeUIViewController {
        Box(
            modifier = Modifier.background(Color.LightGray).fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            ColoredShadowButton()
        }
    }
