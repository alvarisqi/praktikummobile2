package com.eiga.djob.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SlideshowData(
    @StringRes val description: Int,
    @DrawableRes val image: Int
)