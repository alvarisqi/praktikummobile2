package com.eiga.djob.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class HomeData(
    @StringRes val descriptionResourceId: Int,
    @StringRes val nameResourceId: Int,
    @DrawableRes val imageResourceId: Int
)