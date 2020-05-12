package com.arismrd.actuarry.adapter


import com.arismrd.actuarry.model.ModelDaily
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arismrd.actuarry.item.DailyViewHolder

class AdapterDaily(private val list: List<ModelDaily>)
    : RecyclerView.Adapter<DailyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DailyViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: DailyViewHolder, position: Int) {
        val movie: ModelDaily = list[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = list.size

}