package com.arismrd.actuarry.item

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arismrd.actuarry.R
import com.arismrd.actuarry.model.ModelMusic
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.list_music.view.*

class MusicViewHolder (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_music, parent, false)) {

    fun bind(music: ModelMusic) {
        itemView.apply {
            list_judul?.text = music.title
            list_artist?.text = music.artist
            Picasso.get().load(music.albumphoto).into(imgMusic)
        }
    }

}