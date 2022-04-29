package com.eiga.djob.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eiga.djob.R
import com.eiga.djob.model.HomeData

class HomeViewModel : ViewModel() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc

    fun loadData(): List<HomeData>{
        return listOf(
            HomeData(R.string.desc1, R.string.nama1, R.drawable.job1),
            HomeData(R.string.desc2, R.string.nama2, R.drawable.job2),
            HomeData(R.string.desc3, R.string.nama3, R.drawable.job3),
            HomeData(R.string.desc4, R.string.nama4, R.drawable.job4),
            HomeData(R.string.desc5, R.string.nama5, R.drawable.job5),
            HomeData(R.string.desc6, R.string.nama6, R.drawable.job6),
            HomeData(R.string.desc7, R.string.nama7, R.drawable.job7),
            HomeData(R.string.desc8, R.string.nama8, R.drawable.job8),
            HomeData(R.string.desc9, R.string.nama9, R.drawable.job9),
            HomeData(R.string.desc10, R.string.nama10, R.drawable.job10)
        )
    }

    fun setData(data: HomeData, context: Context) {
        _name.value = context.getString(data.nameResourceId)
        _image.value = data.imageResourceId
        _desc.value = context.getString(data.descriptionResourceId)
    }
}