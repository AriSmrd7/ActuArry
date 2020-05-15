package com.arismrd.actuarry.pagefragment


import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.arismrd.actuarry.R
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {
    /**
     * NAMA  : ARI SUMARDI
     * NIM   : 10117162
     * KELAS : IF-4
     * TUGAS UTS
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_profile, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object{
        fun newInstance(): ProfileFragment = ProfileFragment()
    }
}
