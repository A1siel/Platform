package kz.rymbek.platform.common.core.design.foundation.components.searchbar

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.ExpandedDockedSearchBarWithGap
import androidx.compose.material3.SearchBarColors
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.SearchBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.PopupProperties

@Composable
fun AppExpandedDockedSearchBarWithGap(
    state: SearchBarState,
    inputField: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = SearchBarDefaults.dockedShape,
    dropdownShape: Shape = SearchBarDefaults.dockedDropdownShape,
    dropdownGapSize: Dp = SearchBarDefaults.dockedDropdownGapSize,
    dropdownScrimColor: Color = SearchBarDefaults.dockedDropdownScrimColor,
    colors: SearchBarColors = SearchBarDefaults.colors(),
    tonalElevation: Dp = SearchBarDefaults.TonalElevation,
    shadowElevation: Dp = SearchBarDefaults.ShadowElevation,
    properties: PopupProperties = PopupProperties(focusable = true, clippingEnabled = false),
    content: @Composable ColumnScope.() -> Unit,
) {
    ExpandedDockedSearchBarWithGap(
        state = state,
        inputField = inputField,
        modifier = modifier,
        shape = shape,
        dropdownShape = dropdownShape,
        dropdownGapSize = dropdownGapSize,
        dropdownScrimColor = dropdownScrimColor,
        colors = colors,
        tonalElevation = tonalElevation,
        shadowElevation = shadowElevation,
        properties = properties,
        content = content,
    )
}