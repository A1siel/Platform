package kz.rymbek.platform.common.core.design.foundation.components.time

import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimeInputColors
import androidx.compose.material3.TimeInputDefaults
import androidx.compose.material3.TimePickerShapes
import androidx.compose.material3.TimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppTimeInput(
    state: TimePickerState,
    modifier: Modifier = Modifier,
    colors: TimeInputColors = TimeInputDefaults.colors(),
) {
    TimeInput(
        state = state,
        modifier = modifier,
        colors = colors,
    )
}

@Composable
fun AppTimeInput(
    state: TimePickerState,
    shapes: TimePickerShapes,
    modifier: Modifier = Modifier,
    colors: TimeInputColors = TimeInputDefaults.vibrantColors(),
) {
    TimeInput(
        state = state,
        shapes = shapes,
        modifier = modifier,
        colors = colors,
    )
}

@Composable
fun AppTimeInput(
    state: TimePickerState,
    shapes: TimePickerShapes,
    toggle: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    colors: TimeInputColors = TimeInputDefaults.vibrantColors(),
) {
    TimeInput(
        state = state,
        shapes = shapes,
        toggle = toggle,
        modifier = modifier,
        colors = colors,
    )
}

