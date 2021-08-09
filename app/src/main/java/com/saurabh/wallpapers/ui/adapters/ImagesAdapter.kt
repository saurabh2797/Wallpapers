package com.saurabh.wallpapers.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saurabh.wallpapers.R
import com.saurabh.wallpapers.databinding.ItemImageBinding
import com.saurabh.wallpapers.models.WallpaperResponseItem

class ImagesAdapter(
    private val images: ArrayList<WallpaperResponseItem>
) : RecyclerView.Adapter<ImagesAdapter.ArticleViewHolder>() {

    lateinit var binding: ItemImageBinding

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ImagesAdapter.ArticleViewHolder {
        return ArticleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_image,parent,false))
    }

    override fun onBindViewHolder(holder: ImagesAdapter.ArticleViewHolder, position: Int) {
        val image = images[position]
        holder.itemView.apply {
            Glide.with(this).load(image.urls.full).into(binding.ivImage)
        }
        Log.d("TAG", "onBindViewHolder: ${image.urls.full}")
    }

    override fun getItemCount(): Int {
        return images.size
    }
}