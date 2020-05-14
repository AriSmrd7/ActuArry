package com.arismrd.actuarry.pagefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.arismrd.actuarry.R
import com.arismrd.actuarry.adapter.AdapterMusic
import com.arismrd.actuarry.model.ModelMusic
import kotlinx.android.synthetic.main.fragment_media.*

class MediaFragment : Fragment() {
        private val mListMusic = listOf(
            ModelMusic("Take Me Away", "Alan Walker", R.drawable.photos1),
            ModelMusic("Alone", "Marshmello", R.drawable.photos2),
            ModelMusic("When I Was Your Man", "Bruno Mars", R.drawable.photos3),
            ModelMusic("By My Side", "Acejax", R.drawable.photos4),
            ModelMusic("Said The Sky", "iLLenium", R.drawable.photos5),
            ModelMusic("In Your Arms", "iLLenium", R.drawable.photos6),
            ModelMusic("Hold On", "iLLenium", R.drawable.photos7)
        )

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            retainInstance = true
        }

        override fun onCreateView(inflater: LayoutInflater,
                                  container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_media, container, false)

        // populate the views now that the layout has been inflated
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            // RecyclerView node initialized here
            list_recycler_music.apply {
                // set a LinearLayoutManager to handle Android
                // RecyclerView behavior
                layoutManager = LinearLayoutManager(activity)
                // set the custom adapter to the RecyclerView
                adapter = AdapterMusic(mListMusic)
            }
        }

        companion object {
            fun newInstance(): MediaFragment =
                MediaFragment()
        }
    }