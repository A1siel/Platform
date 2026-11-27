package kz.rymbek.platform.common.core.design.foundation.components.time

import androidx.compose.material3.TimePickerColors
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.TimePickerShapes
import androidx.compose.material3.TimePickerState
import androidx.compose.material3.TimeScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppTimeScroll(
    state: TimePickerState,
    shapes: TimePickerShapes,
    modifier: Modifier = Modifier,
    colors: TimePickerColors = TimePickerDefaults.vibrantColors(),
) {
    TimeScroll(
        state = state,
        shapes = shapes,
        modifier = modifier,
        colors = colors,
    )
}

@Composable
fun AppTimeScroll(
    state: TimePickerState,
    shapes: TimePickerShapes,
    toggle: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    colors: TimePickerColors = TimePickerDefaults.vibrantColors(),
) {
    TimeScroll(
        state = state,
        shapes = shapes,
        toggle = toggle,
        modifier = modifier,
        colors = colors,
    )
}