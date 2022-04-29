package com.eiga.djob.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eiga.djob.R
import com.eiga.djob.databinding.ActivityGalleryBinding
import com.eiga.djob.databinding.ActivityHomeBinding


class HomeDetailActivity : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"
        const val EXTRA_DESCRIPTION = "description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageHomeDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.nameHomeDetail
        name.text = intent.getStringExtra(EXTRA_NAME)


        val description = binding.descHomeDetail
        description.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}