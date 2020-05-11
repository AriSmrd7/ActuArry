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
        ModelDaily("Mandi", "04.00"),
        ModelDaily("Sholat Shubuh", "04.30"),
        ModelDaily("Sarapan Pagi", "06.30"),
        ModelDaily("Pergi Kuliah", "08.00"),
        ModelDaily("Sholat Dzuhur", "12.10"),
        ModelDaily("Makan Siang", "13.30"),
        ModelDaily("Mandi", "15.00"),
        ModelDaily("Sholat Ashar", "15.30"),
        ModelDaily("Ngegame", "16.00"),
        ModelDaily("Sholat Maghrib", "18.00"),
        ModelDaily("Makan Malam", "18.30"),
        ModelDaily("Sholat Isya", "19.30"),
        ModelDaily("Belajar", "20.00"),
        ModelDaily("Tidur", "22.30"),
        ModelDaily(" ", " ")
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