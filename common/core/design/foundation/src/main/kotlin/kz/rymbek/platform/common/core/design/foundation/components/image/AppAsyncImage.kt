package kz.rymbek.platform.common.core.design.foundation.components.image

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import coil3.compose.AsyncImage
import coil3.compose.AsyncImagePainter.Companion.DefaultTransform
import coil3.compose.AsyncImagePainter.State
import coil3.compose.LocalPlatformContext
import coil3.request.ImageRequest
import coil3.video.VideoFrameDecoder
import coil3.video.videoFramePercent

@Composable
fun AppAsyncImage(
    model: Any?,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    placeholder: Painter? = AppImageDefaults.placeholder(),
    error: Painter? = AppImageDefaults.error(),
    fallback: Painter? = error,
    onLoading: ((State.Loading) -> Unit)? = null,
    onSuccess: ((State.Success) -> Unit)? = null,
    onError: ((State.Error) -> Unit)? = null,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Crop,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null,
    filterQuality: FilterQuality = DefaultFilterQuality,
    clipToBounds: Boolean = true,
) {
    AsyncImage(
        model = model,
        contentDescription = contentDescription,
        modifier = modifier,
        placeholder = placeholder,
        error = error,
        fallback = fallback,
        onLoading = onLoading,
        onSuccess = onSuccess,
        onError = onError,
        alignment = alignment,
        contentScale = contentScale,
        alpha = alpha,
        colorFilter = colorFilter,
        filterQuality = filterQuality,
        clipToBounds = clipToBounds,
    )
}

@Composable
@NonRestartableComposable
fun AppAsyncImage(
    model: Any?,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    transform: (State) -> State = DefaultTransform,
    onState: ((State) -> Unit)? = null,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null,
    filterQuality: FilterQuality = DefaultFilterQuality,
    clipToBounds: Boolean = true,
) {
    AsyncImage(
        model = model,
        contentDescription = contentDescription,
        modifier = modifier,
        transform = transform,
        onState = onState,
        alignment = alignment,
        contentScale = contentScale,
        alpha = alpha,
        colorFilter = colorFilter,
        filterQuality = filterQuality,
        clipToBounds = clipToBounds,
    )
}

/**
 * Кадр из видео как модель для [AppAsyncImage]. Запрос строится один раз на (source, framePercent).
 *
 * Декодер указан явно: Coil сам включает видео-декодер только если MIME начинается с `video/`
 * (определяется, в том числе по расширению), а для URL без расширения / с неверным Content-Type
 * без явного декодера кадр не достанется. Только для видео: картинку через эту модель не декодировать.
 */
@Composable
fun rememberVideoFrameModel(source: Any?, framePercent: Double = 0.1): ImageRequest {
    val context = LocalPlatformContext.current
    return remember(context, source, framePercent) {
        ImageRequest.Builder(context)
            .data(source)
            .videoFramePercent(framePercent)
            .decoderFactory { result, options, _ -> VideoFrameDecoder(result.source, options) }
            .build()
    }
}

/**
 * Painter'ы вместо постоянного `Modifier.background(...)`: цвет виден только пока грузится / при ошибке
 * и не просвечивает под готовой картинкой (PNG с прозрачностью, ContentScale.Fit).
 */
object AppImageDefaults {
    @Composable
    fun placeholder(): Painter = rememberColorPainter(MaterialTheme.colorScheme.outline)

    @Composable
    fun error(): Painter = rememberColorPainter(MaterialTheme.colorScheme.errorContainer)

    @Composable
    private fun rememberColorPainter(color: Color): Painter =
        remember(color) { ColorPainter(color) }
}

