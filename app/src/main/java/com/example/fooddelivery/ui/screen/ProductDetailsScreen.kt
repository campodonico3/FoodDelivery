package com.example.fooddelivery.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fooddelivery.data.ProductPreviewState
import com.example.fooddelivery.ui.screen.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState()
) {
    ProductPreviewSection(
        state = productPreviewState
    )
}