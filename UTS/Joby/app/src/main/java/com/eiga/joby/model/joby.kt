package com.eiga.joby.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class joby(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int) {
}