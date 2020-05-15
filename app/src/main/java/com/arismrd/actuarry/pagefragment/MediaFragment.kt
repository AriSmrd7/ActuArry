package com.arismrd.actuarry.pagefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.FragmentContainer
import androidx.recyclerview.widget.LinearLayoutManager
import com.arismrd.actuarry.R
import com.arismrd.actuarry.adapter.AdapterMusic
import com.arismrd.actuarry.model.ModelMusic
import kotlinx.android.synthetic.main.fragment_media.*

class MediaFragment : Fragment() {
    /**
     * NAMA  : ARI SUMARDI
     * NIM   : 10117162
     * KELAS : IF-4
     * TUGAS UTS
     */

        private val mListMusic = listOf(
            ModelMusic("Take Me Away", "Alan Walker", R.drawable.img_takemeaway),
            ModelMusic("Alone", "Marshmello", R.drawable.img_alone),
            ModelMusic("After The After Party", "Charli XCX", R.drawable.img_afterparty),
            ModelMusic("By My Side", "Acejax", R.drawable.img_bymyside),
            ModelMusic("Let Me Down Slowly", "Alec Benjamin", R.drawable.img_letmedown),
            ModelMusic("In Your Arms", "iLLenium", R.drawable.img_inyour),
            ModelMusic("Hold On", "iLLenium", R.drawable.img_holdon),
            ModelMusic("Million Days", "Sabai ft. Claire Ridgely", R.drawable.img_million)
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
                layoutManager = LinearLayoutManager(activity)
                adapter = AdapterMusic(mListMusic)
            }

        }

        companion object {
            fun newInstance(): MediaFragment =
                MediaFragment()
        }
    }