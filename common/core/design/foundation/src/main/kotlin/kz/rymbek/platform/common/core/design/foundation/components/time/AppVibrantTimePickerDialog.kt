package kz.rymbek.platform.common.core.design.foundation.components.time

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.TimePickerDialogDefaults
import androidx.compose.material3.VibrantTimePickerDialog
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.window.DialogProperties

@Composable
fun AppVibrantTimePickerDialog(
    onDismissRequest: () -> Unit,
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    properties: DialogProperties = DialogProperties(usePlatformDefaultWidth = false),
    modeToggleButton: @Composable (() -> Unit)? = null,
    dismissButton: @Composable (() -> Unit)? = null,
    shape: Shape = TimePickerDialogDefaults.vibrantShape,
    containerColor: Color = TimePickerDialogDefaults.vibrantContainerColor,
    content: @Composable ColumnScope.() -> Unit,
) {
    VibrantTimePickerDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = confirmButton,
        modifier = modifier,
        properties = properties,
        modeToggleButton = modeToggleButton,
        dismissButton = dismissButton,
        shape = shape,
        containerColor = containerColor,
        content = content,
    )
}
