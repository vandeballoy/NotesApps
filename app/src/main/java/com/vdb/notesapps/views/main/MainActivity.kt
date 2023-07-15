package com.vdb.notesapps.views.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vdb.notesapps.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        btmNavMain.setOnNavigationItemSelectedListener {
            when(it.itemId){

            }
            return@setOnNavigationItemSelectedListener false
        }
    }
}