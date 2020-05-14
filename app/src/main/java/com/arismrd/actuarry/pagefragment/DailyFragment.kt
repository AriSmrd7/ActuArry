package com.arismrd.actuarry.pagefragment

import com.arismrd.actuarry.model.ModelDaily
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.arismrd.actuarry.R
import com.arismrd.actuarry.adapter.AdapterDaily
import kotlinx.android.synthetic.main.fragment_daily.*

class DailyFragment : Fragment() {
    private val mListDaily = listOf(
        ModelDaily("Mandi", "04.00",R.drawable.ic_favorite),
        ModelDaily("Sholat Shubuh", "04.30",R.drawable.photos8),
        ModelDaily("Sarapan Pagi", "06.30",R.drawable.photos10),
        ModelDaily("Pergi Kuliah", "08.00",R.drawable.photos6),
        ModelDaily("Sholat Dzuhur", "12.10",R.drawable.ic_favorite),
        ModelDaily("Makan Siang", "13.30",R.drawable.ic_favorite),
        ModelDaily("Mandi", "15.00", R.drawable.ic_nav_galery),
        ModelDaily("Sholat Ashar", "15.30", R.drawable.ic_fhome_food),
        ModelDaily("Ngegame", "16.00", R.drawable.photos1),
        ModelDaily("Sholat Maghrib", "18.00",  R.drawable.photos2),
        ModelDaily("Makan Malam", "18.30",  R.drawable.photos3),
        ModelDaily("Sholat Isya", "19.30", R.drawable.photos4),
        ModelDaily("Belajar", "20.00",  R.drawable.photos7),
        ModelDaily("Tidur", "22.30",  R.drawable.photos9)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_daily, container, false)

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        list_recycler_daily.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = AdapterDaily(mListDaily)
        }
    }

    companion object {
        fun newInstance(): DailyFragment =
            DailyFragment()
    }
}