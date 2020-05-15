package com.arismrd.actuarry.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arismrd.actuarry.R
import com.arismrd.actuarry.model.ModelGallery
import kotlinx.android.synthetic.main.view_gallery.view.*

class AdapterGallery(val items: List<ModelGallery>) : RecyclerView.Adapter<AdapterGallery.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_gallery, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: ModelGallery) {
            itemView.view_img.setImageResource(item.photoRes)
            itemView.view_item_title.text = item.title
        }
    }
}