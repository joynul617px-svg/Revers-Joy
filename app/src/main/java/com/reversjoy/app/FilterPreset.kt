package com.reversjoy.app

data class FilterPreset(
    val name: String,
    val brightness: Float = 0f,
    val contrast: Float = 1f,
    val saturation: Float = 1f,
    val vibrance: Float = 0f
)

object FilterPresets {

    val natural = FilterPreset(
        name = "Natural"
    )

    val vivid = FilterPreset(
        name = "Vivid",
        contrast = 1.08f,
        saturation = 1.18f,
        vibrance = 0.20f
    )

    val iphone = FilterPreset(
        name = "iPhone",
        brightness = 5f,
        contrast = 1.05f,
        saturation = 1.08f,
        vibrance = 0.25f
    )

    val warm = FilterPreset(
        name = "Warm",
        brightness = 4f,
        contrast = 1.03f,
        saturation = 1.10f,
        vibrance = 0.15f
    )

    val cool = FilterPreset(
        name = "Cool",
        contrast = 1.05f,
        saturation = 1.05f,
        vibrance = 0.12f
    )

    val cinematic = FilterPreset(
        name = "Cinematic",
        contrast = 1.15f,
        saturation = 0.92f,
        vibrance = 0.10f
    )

    val portrait = FilterPreset(
        name = "Portrait",
        brightness = 3f,
        contrast = 1.04f,
        saturation = 1.06f,
        vibrance = 0.18f
    )

    val vintage = FilterPreset(
        name = "Vintage",
        brightness = 3f,
        contrast = 0.95f,
        saturation = 0.82f,
        vibrance = 0.05f
    )

    val blackWhite = FilterPreset(
        name = "B&W",
        saturation = 0f,
        contrast = 1.08f
    )

    val all = listOf(
        natural,
        vivid,
        iphone,
        warm,
        cool,
        cinematic,
        portrait,
        vintage,
        blackWhite
    )
}
