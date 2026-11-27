package kz.rymbek.platform.common.core.design.foundation.components.time

import androidx.compose.material3.TimePicker
import androidx.compose.material3.TimePickerColors
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.TimePickerLayoutType
import androidx.compose.material3.TimePickerShapes
import androidx.compose.material3.TimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppTimePicker(
    state: TimePickerState,
    modifier: Modifier = Modifier,
    colors: TimePickerColors = TimePickerDefaults.colors(),
    layoutType: TimePickerLayoutType = TimePickerDefaults.layoutType(),
) {
    TimePicker(
        state = state,
        modifier = modifier,
        colors = colors,
        layoutType = layoutType,
    )
}


@Composable
fun AppTimePicker(
    state: TimePickerState,
    shapes: TimePickerShapes,
    modifier: Modifier = Modifier,
    colors: TimePickerColors = TimePickerDefaults.vibrantColors(),
    layoutType: TimePickerLayoutType = TimePickerDefaults.layoutType(),
) {
    TimePicker(
        state = state,
        shapes = shapes,
        modifier = modifier,
        colors = colors,
        layoutType = layoutType,
    )
}
