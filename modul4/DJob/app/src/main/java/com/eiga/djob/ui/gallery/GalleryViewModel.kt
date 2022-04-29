package com.eiga.djob.ui.gallery

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eiga.djob.R
import com.eiga.djob.R.drawable.job9
import com.eiga.djob.model.GalleryData

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    fun loadData(): List<GalleryData>{
        return listOf(
            GalleryData(R.drawable.job1),
            GalleryData(R.drawable.job2),
            GalleryData(R.drawable.job3),
            GalleryData(R.drawable.job4),
            GalleryData(R.drawable.job5),
            GalleryData(R.drawable.job6),
            GalleryData(R.drawable.job7),
            GalleryData(R.drawable.job8),
            GalleryData(R.drawable.job9),
            GalleryData(R.drawable.job10)
        )
    }

    fun setData(data: GalleryData){
        _image.value = data.imageResourceId
    }
}