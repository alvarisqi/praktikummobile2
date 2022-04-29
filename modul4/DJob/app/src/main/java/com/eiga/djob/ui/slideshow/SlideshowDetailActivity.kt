package com.eiga.djob.ui.slideshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eiga.djob.databinding.ActivitySlideshowBinding


class SlideshowDetailActivity : AppCompatActivity() {
    private var _binding: ActivitySlideshowBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_DESCRIPTION = "description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivitySlideshowBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))


        val description = binding.descriptionDetail
        description.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}