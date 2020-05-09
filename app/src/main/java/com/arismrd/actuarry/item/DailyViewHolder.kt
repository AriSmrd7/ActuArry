package com.arismrd.actuarry.item

import com.arismrd.actuarry.model.ModelDaily
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arismrd.actuarry.R

class DailyViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null


    init {
        mTitleView = itemView.findViewById(R.id.list_title)
        mYearView = itemView.findViewById(R.id.list_description)
    }

    fun bind(movie: ModelDaily) {
        mTitleView?.text = movie.title
        mYearView?.text = movie.hour.toString()
    }

}