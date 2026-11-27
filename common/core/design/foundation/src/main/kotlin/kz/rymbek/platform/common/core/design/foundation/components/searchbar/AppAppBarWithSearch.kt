package kz.rymbek.platform.common.core.design.foundation.components.searchbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.AppBarWithSearch
import androidx.compose.material3.AppBarWithSearchColors
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.SearchBarScrollBehavior
import androidx.compose.material3.SearchBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp

@Composable
fun AppAppBarWithSearch(
    state: SearchBarState,
    inputField: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable (() -> Unit)? = null,
    actions: @Composable (RowScope.() -> Unit)? = null,
    shape: Shape = SearchBarDefaults.inputFieldShape,
    colors: AppBarWithSearchColors = SearchBarDefaults.appBarWithSearchColors(),
    tonalElevation: Dp = SearchBarDefaults.TonalElevation,
    shadowElevation: Dp = SearchBarDefaults.ShadowElevation,
    contentPadding: PaddingValues = SearchBarDefaults.AppBarContentPadding,
    windowInsets: WindowInsets = SearchBarDefaults.windowInsets,
    scrollBehavior: SearchBarScrollBehavior? = null,
) {
    AppBarWithSearch(
        state = state,
        inputField = inputField,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        shape = shape,
        colors = colors,
        tonalElevation = tonalElevation,
        shadowElevation = shadowElevation,
        contentPadding = contentPadding,
        windowInsets = windowInsets,
        scrollBehavior = scrollBehavior,
    )
}
