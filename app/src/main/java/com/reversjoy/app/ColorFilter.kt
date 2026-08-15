package com.reversjoy.app

import android.graphics.Bitmap
import android.graphics.Color
import kotlin.math.max
import kotlin.math.min

object ColorFilter {

    fun apply(
        source: Bitmap,
        brightness: Float = 0f,
        contrast: Float = 1f,
        saturation: Float = 1f,
        vibrance: Float = 0f
    ): Bitmap {

        val result = source.copy(Bitmap.Config.ARGB_8888, true)

        for (y in 0 until result.height) {
            for (x in 0 until result.width) {

                val pixel = result.getPixel(x, y)

                var r = Color.red(pixel).toFloat()
                var g = Color.green(pixel).toFloat()
                var b = Color.blue(pixel).toFloat()

                // Brightness
                r += brightness
                g += brightness
                b += brightness

                // Contrast
                r = ((r - 128f) * contrast) + 128f
                g = ((g - 128f) * contrast) + 128f
                b = ((b - 128f) * contrast) + 128f

                // Saturation
                val gray =
                    (0.299f * r) +
                    (0.587f * g) +
                    (0.114f * b)

                r = gray + (r - gray) * saturation
                g = gray + (g - gray) * saturation
                b = gray + (b - gray) * saturation

                // Vibrance
                val average = (r + g + b) / 3f
                val maximum = max(r, max(g, b))
                val amount = (maximum - average) / 255f

                val boost = 1f + (vibrance * (1f - amount))

                r = average + (r - average) * boost
                g = average + (g - average) * boost
                b = average + (b - average) * boost

                r = min(255f, max(0f, r))
                g = min(255f, max(0f, g))
                b = min(255f, max(0f, b))

                result.setPixel(
                    x,
                    y,
                    Color.rgb(
                        r.toInt(),
                        g.toInt(),
                        b.toInt()
                    )
                )
            }
        }

        return result
    }
}
