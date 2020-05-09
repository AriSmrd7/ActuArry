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
        ModelDaily("Mandi", 4),
        ModelDaily("Sholat Shubuh", 4),
        ModelDaily("Sarapan Pagi", 6)
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