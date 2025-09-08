package com.example.fooddelivery.ui.theme.screen.components

import android.app.ActionBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.runtime.internal.rememberComposableLambdaN
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun ProductPreviewSection(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
    ) {
        Content(
            modifier = Modifier.statusBarsPadding()
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier
) {
    ConstraintLayout(
        modifier = modifier.fillMaxWidth()
    ) {
        val (actionBar, highlights, productImg) = createRefs()
        ActionBar(
            headLine = "Mr. Cheezy",
            modifier = Modifier
                .padding(horizontal = 18.dp)
                .constrainAs(actionBar) {
                    top.linkTo(parent.top)
                },

            )
    }
}

@Composable
private fun ActionBar(
    modifier: Modifier = Modifier,
    headLine: String
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = headLine,
            style = AppTheme.typography.headLine,
            color = AppTheme.colors.onSecondarySurface,
        )
        CloseButton()
    }
}

@Composable
private fun CloseButton(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.size(44.dp),
        shape = RoundedCornerShape(16.dp),
        color = AppTheme.colors.actionSurface,
        contentColor = AppTheme.colors.secondarySurface
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}