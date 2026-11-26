package kz.rymbek.platform.common.core.design.foundation.components.datepicker.daterange

import androidx.compose.material3.DatePickerColors
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DateRangePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.DialogProperties
import kz.rymbek.platform.common.core.design.foundation.components.datepicker.base.BaseDatePickerDialog

@Composable
fun AppDateRangePickerDialog(
    onDismissRequest: () -> Unit,
    onDateRangeSelected: (Pair<Long?, Long?>) -> Unit,
    modifier: Modifier = Modifier,
    dateRangePickerState: DateRangePickerState = rememberDateRangePickerStateCustom(),
    shape: Shape = DatePickerDefaults.shape,
    tonalElevation: Dp = DatePickerDefaults.TonalElevation,
    colors: DatePickerColors = DatePickerDefaults.colors(),
    properties: DialogProperties = DialogProperties(usePlatformDefaultWidth = false),
) {
    BaseDatePickerDialog(
        onDismissRequest = onDismissRequest,
        onConfirmClick = {
            onDateRangeSelected(
                Pair(
                    dateRangePickerState.selectedStartDateMillis,
                    dateRangePickerState.selectedEndDateMillis
                )
            )
        },
        modifier = modifier,
        shape = shape,
        tonalElevation = tonalElevation,
        colors = colors,
        properties = properties,
        content = {
            AppDateRangePicker(
                dateRangePickerState = dateRangePickerState,
            )
        },
    )
}
