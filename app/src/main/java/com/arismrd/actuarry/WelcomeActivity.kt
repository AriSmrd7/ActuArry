package com.arismrd.actuarry

import PreferenceHelper
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class WelcomeActivity : AppCompatActivity() {
    /**
     * NAMA  : ARI SUMARDI
     * NIM   : 10117162
     * KELAS : IF-4
     * TUGAS UTS
     */
    private fun setupNavigation() {
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    Toast.makeText(this, "Home selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_daily -> {
                    Toast.makeText(this, "Daily selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_galery -> {
                    Toast.makeText(this, "Galery selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_video -> {
                    Toast.makeText(this, "Video selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_profile -> {
                    Toast.makeText(this, "Profile selected", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> true
            }
        }
    }

    private var preferenceHelper: PreferenceHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        preferenceHelper = PreferenceHelper(this)
    }
}