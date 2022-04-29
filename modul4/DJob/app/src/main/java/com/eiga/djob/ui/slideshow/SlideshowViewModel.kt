package com.eiga.djob.ui.slideshow


import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eiga.djob.R
import com.eiga.djob.model.SlideshowData

class SlideshowViewModel : ViewModel() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc


    fun loadData(): List<SlideshowData>{
        return listOf(
            SlideshowData(R.string.joby1, R.drawable.image1),
            SlideshowData(R.string.joby2, R.drawable.image2),
            SlideshowData(R.string.joby3, R.drawable.image3),
            SlideshowData(R.string.joby4, R.drawable.image4),
            SlideshowData(R.string.joby5, R.drawable.image5),
            SlideshowData(R.string.joby6, R.drawable.image6),
            SlideshowData(R.string.joby7, R.drawable.image7),
            SlideshowData(R.string.joby8, R.drawable.image8),
            SlideshowData(R.string.joby9, R.drawable.image9),
            SlideshowData(R.string.joby10, R.drawable.image10),
        )
    }

    fun setData(data: SlideshowData, context: Context){
        _desc.value = context.getString(data.description)
        _image.value = data.image
    }

}
