package com.eiga.djob.ui.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Gallery
import androidx.lifecycle.ViewModelProvider
import com.eiga.djob.R
import com.eiga.djob.databinding.ActivityGalleryBinding


class GalleryDetailActivity : AppCompatActivity() {
    private var _binding: ActivityGalleryBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityGalleryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.detailImage
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))
    }
}