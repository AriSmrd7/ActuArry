package com.arismrd.actuarry.item

import com.arismrd.actuarry.model.ModelDaily
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arismrd.actuarry.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item.view.*

class DailyViewHolder (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {

    fun bind(daily: ModelDaily) {
        itemView.apply {
            list_title?.text = daily.title
            list_description?.text = daily.hour
            Picasso.get().load(daily.photo).into(imgList)
        }
    }

}