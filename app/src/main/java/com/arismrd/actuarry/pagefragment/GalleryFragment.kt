package com.arismrd.actuarry.pagefragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.arismrd.actuarry.R
import com.arismrd.actuarry.adapter.MyAdapter
import com.arismrd.actuarry.model.ModelGallery
import kotlinx.android.synthetic.main.fragment_gallery.*


class GalleryFragment : Fragment() {

        private val items = mutableListOf<ModelGallery>()

        private lateinit var adapter: MyAdapter

        private lateinit var layoutManager: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_gallery, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        // 初始化資料
        initItems()

        // 設定 RecyclerView 屬性
        view_list.setHasFixedSize(true)

        // 設定 Adapter
        adapter = MyAdapter(items)
        view_list.adapter = adapter

        // 設定 LayoutManager
        layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        view_list.layoutManager = layoutManager
    }


        private fun initItems() {

            for (n in 1..8) {
                val photoRes = when (n % 8) {
                    0 -> R.drawable.photos1
                    1 -> R.drawable.photos2
                    2 -> R.drawable.photos3
                    3 -> R.drawable.photos4
                    4 -> R.drawable.photos5
                    5 -> R.drawable.photos6
                    6 -> R.drawable.photos7
                    7 -> R.drawable.photos8
                    else -> Color.TRANSPARENT
                }
                items.add(ModelGallery("Foto $n", photoRes))
            }
        }
    companion object {
        fun newInstance(): GalleryFragment =
            GalleryFragment()
    }
    }