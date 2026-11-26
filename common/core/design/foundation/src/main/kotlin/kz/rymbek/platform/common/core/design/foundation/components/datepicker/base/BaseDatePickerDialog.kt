package kz.rymbek.platform.common.core.design.foundation.components.datepicker.base

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.DatePickerColors
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.DialogProperties
import kz.rymbek.platform.common.core.design.foundation.components.button.AppTextButton
import kz.rymbek.platform.common.core.design.foundation.components.button.base.ButtonContent

@Composable
internal fun BaseDatePickerDialog(
    onDismissRequest: () -> Unit,
    onConfirmClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = DatePickerDefaults.shape,
    tonalElevation: Dp = DatePickerDefaults.TonalElevation,
    colors: DatePickerColors = DatePickerDefaults.colors(),
    properties: DialogProperties = DialogProperties(usePlatformDefaultWidth = false),
    content: @Composable ColumnScope.() -> Unit,
) {
    DatePickerDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            AppTextButton(
                onClick = {
                    onConfirmClick()
                    onDismissRequest()
                },
                content = { ButtonContent(text = "ОК") }
            )
        },
        modifier = modifier,
        dismissButton = {
            AppTextButton(
                onClick = { onDismissRequest() },
                content = {
                    ButtonContent(text = "Отмена")
                }
            )
        },
        shape = shape,
        tonalElevation = tonalElevation,
        colors = colors,
        properties = properties,
        content = content
    )
}
