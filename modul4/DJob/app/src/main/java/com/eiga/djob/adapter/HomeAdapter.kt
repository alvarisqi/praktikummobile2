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
import com.eiga.djob.model.HomeData
import com.eiga.djob.ui.home.HomeViewModel
import com.eiga.djob.ui.home.HomeDetailActivity

class HomeAdapter(
    private val context: Context,
    private val dataset: List<HomeData>
): RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    private val viewModel = HomeViewModel()

    class HomeViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.newsimage)
        val nameText: TextView = view.findViewById(R.id.newsTitle)
        val dateText: TextView = view.findViewById(R.id.newsDesc)
        val descText: TextView = view.findViewById(R.id.homeTextDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.home_item, parent,false)
        return HomeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = dataset[position]
        holder.nameText.text = context.resources.getString(item.nameResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.descText.text = context.resources.getString(item.descriptionResourceId)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, HomeDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("name", viewModel.name.value)
                putExtra("desc", viewModel.desc.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size

}