package com.arismrd.actuarry.pagefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arismrd.actuarry.R


class HomeFragment : Fragment() {
    /**
     * NAMA  : ARI SUMARDI
     * NIM   : 10117162
     * KELAS : IF-4
     * TUGAS UTS
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_home, container, false)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}