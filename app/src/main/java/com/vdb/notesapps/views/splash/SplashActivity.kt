package com.vdb.notesapps.views.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.vdb.notesapps.R
import com.vdb.notesapps.views.main.MainActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
           startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            finish()
        },5200)

    }
}