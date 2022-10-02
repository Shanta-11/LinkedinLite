package com.example.linkedinlite.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedinlite.R

class HomeAdapter(
    private val dataset: List<homeData>
    ) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>()  {
    class  HomeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val contentView : TextView = view.findViewById(R.id.post_content)
        val imageView : ImageView = view.findViewById(R.id.post_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_layout, parent, false)
        return HomeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = dataset[position]
        holder.contentView.text = item.contentString
        holder.imageView.setImageResource(item.imageResourceID)
    }

    override fun getItemCount() = dataset.size

}