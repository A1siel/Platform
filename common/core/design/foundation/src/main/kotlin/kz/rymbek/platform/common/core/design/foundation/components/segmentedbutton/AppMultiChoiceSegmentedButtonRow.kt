package kz.rymbek.platform.common.core.design.foundation.components.segmentedbutton

import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.MultiChoiceSegmentedButtonRowScope
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun AppMultiChoiceSegmentedButtonRow(
    modifier: Modifier = Modifier,
    space: Dp = SegmentedButtonDefaults.BorderWidth,
    content: @Composable MultiChoiceSegmentedButtonRowScope.() -> Unit,
) {
    MultiChoiceSegmentedButtonRow(
        modifier = modifier,
        space = space,
        content = content,
    )
}

@Composable
fun <T : Any> AppMultiChoiceSegmentedButtonRow(
    items: List<T>,
    checkedItems: Set<T>,
    onItemCheckedChange: (item: T, checked: Boolean) -> Unit,
    label: @Composable (T) -> Unit,
    modifier: Modifier = Modifier,
    space: Dp = SegmentedButtonDefaults.BorderWidth,
) {
    AppMultiChoiceSegmentedButtonRow(
        modifier = modifier,
        space = space,
        content = {
            items.forEachIndexed { index, item ->
                AppSegmentedButton(
                    checked = item in checkedItems,
                    onCheckedChange = { checked -> onItemCheckedChange(item, checked) },
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = items.size,
                    ),
                    label = { label(item) },
                )
            }
        },
    )
}