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
    /**
     * NAMA  : ARI SUMARDI
     * NIM   : 10117162
     * KELAS : IF-4
     * TUGAS UTS
     */
    private val mListDaily = listOf(
        ModelDaily("Mandi", "04.00",R.drawable.img_bath),
        ModelDaily("Sholat Shubuh", "04.30",R.drawable.img_pray),
        ModelDaily("Sarapan Pagi", "06.30",R.drawable.img_breakfast),
        ModelDaily("Pergi Kuliah", "08.00",R.drawable.img_campuss),
        ModelDaily("Sholat Dzuhur", "12.10",R.drawable.img_pray),
        ModelDaily("Makan Siang", "13.30",R.drawable.img_lunch),
        ModelDaily("Mandi", "15.00", R.drawable.img_bath),
        ModelDaily("Sholat Ashar", "15.30", R.drawable.img_pray),
        ModelDaily("Ngegame", "16.00", R.drawable.img_game),
        ModelDaily("Sholat Maghrib", "18.00",  R.drawable.img_pray),
        ModelDaily("Makan Malam", "18.30",  R.drawable.img_dinner),
        ModelDaily("Sholat Isya", "19.30", R.drawable.img_pray),
        ModelDaily("Belajar", "20.00",  R.drawable.img_study),
        ModelDaily("Tidur", "22.30",  R.drawable.img_sleep)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_daily, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list_recycler_daily.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL ,false)
            adapter = AdapterDaily(mListDaily)
        }

    }

    companion object {
        fun newInstance(): DailyFragment =
            DailyFragment()
    }
}