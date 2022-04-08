package com.eiga.joby.data

import com.eiga.joby.R
import com.eiga.joby.model.joby

class Datasource {

    fun loadAffirmations(): List<joby> {
        return listOf<joby>(
            joby(R.string.joby1, R.drawable.image1),
            joby(R.string.joby2, R.drawable.image2),
            joby(R.string.joby3, R.drawable.image3),
            joby(R.string.joby4, R.drawable.image4),
            joby(R.string.joby5, R.drawable.image5),
            joby(R.string.joby6, R.drawable.image6),
            joby(R.string.joby7, R.drawable.image7),
            joby(R.string.joby8, R.drawable.image8),
            joby(R.string.joby9, R.drawable.image9),
            joby(R.string.joby10, R.drawable.image10)
        )
    }
}