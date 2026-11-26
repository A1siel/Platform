package kz.rymbek.platform.common.core.design.foundation.components.container

import androidx.compose.foundation.layout.FlexBox
import androidx.compose.foundation.layout.FlexBoxConfig
import androidx.compose.foundation.layout.FlexBoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppFlexBox(
    modifier: Modifier = Modifier,
    config: FlexBoxConfig = FlexBoxConfig,
    content: @Composable FlexBoxScope.() -> Unit,
) {
    FlexBox(
        modifier = modifier,
        config = config,
        content = content,
    )
}