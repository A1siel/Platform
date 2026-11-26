package kz.rymbek.platform.common.core.design.foundation.components.datepicker.daterange

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePickerColors
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerFormatter
import androidx.compose.material3.DateRangePicker
import androidx.compose.material3.DateRangePickerDefaults
import androidx.compose.material3.DateRangePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import kz.rymbek.platform.common.core.design.foundation.constants.PlatformPaddings

@Composable
fun AppDateRangePicker(
    state: DateRangePickerState,
    modifier: Modifier = Modifier,
    dateFormatter: DatePickerFormatter = remember { DatePickerDefaults.dateFormatter() },
    colors: DatePickerColors = DatePickerDefaults.colors(),
    title: (@Composable () -> Unit)? = {
        DateRangePickerDefaults.DateRangePickerTitle(
            displayMode = state.displayMode,
            modifier = Modifier.padding(
                top = PlatformPaddings.default,
                start = PlatformPaddings.content,
            ),
            contentColor = colors.titleContentColor,
        )
    },
    headline: (@Composable () -> Unit)? = {
        DateRangePickerDefaults.DateRangePickerHeadline(
            selectedStartDateMillis = state.selectedStartDateMillis,
            selectedEndDateMillis = state.selectedEndDateMillis,
            displayMode = state.displayMode,
            dateFormatter,
            modifier = Modifier.padding(
                PaddingValues(
                    top = PlatformPaddings.default,
                    start = PlatformPaddings.default,
                    bottom = PlatformPaddings.default,
                )
            ),
            contentColor = colors.headlineContentColor,
        )
    },
    showModeToggle: Boolean = true,
    focusRequester: FocusRequester? = remember { FocusRequester() },
) {
    DateRangePicker(
        state = state,
        modifier = modifier,
        dateFormatter = dateFormatter,
        colors = colors,
        title = title,
        headline = headline,
        showModeToggle = showModeToggle,
        focusRequester = focusRequester,
    )
}
