package com.eiga.djob.adapter


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eiga.djob.R
import com.eiga.djob.model.SlideshowData
import com.eiga.djob.ui.slideshow.SlideshowDetailActivity
import com.eiga.djob.ui.slideshow.SlideshowViewModel


class SlideshowAdapter(
    private val context: Context,
    private val dataset: List<SlideshowData>
): RecyclerView.Adapter<SlideshowAdapter.NewsViewHolder>() {
    private val viewModel = SlideshowViewModel()

    class NewsViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.newsimage)
        val nameText: TextView = view.findViewById(R.id.newsTitle)
        val descText: TextView = view.findViewById(R.id.newsDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.slideshow_item, parent,false)
        return NewsViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.image)
        holder.descText.text = context.resources.getString(item.description)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, SlideshowDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("desc", viewModel.desc.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size

}