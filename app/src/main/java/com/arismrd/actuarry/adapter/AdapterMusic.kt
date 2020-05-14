package com.arismrd.actuarry.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arismrd.actuarry.item.MusicViewHolder
import com.arismrd.actuarry.model.ModelMusic

class AdapterMusic(private val list: List<ModelMusic>)
    : RecyclerView.Adapter<MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MusicViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music: ModelMusic = list[position]
        holder.bind(music)
    }

    override fun getItemCount(): Int = list.size

}