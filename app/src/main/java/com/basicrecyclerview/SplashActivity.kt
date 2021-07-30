package com.basicrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())
    private val duration:Long = 2000
    private val splash:Runnable = Runnable {
        startActivity(Intent(this,HomeActivity::class.java))
        finish()
    }

    override fun onResume() {
        handler.postDelayed(splash,duration)
        super.onResume()
    }

    override fun onPause() {
        handler.removeCallbacks(splash)
        super.onPause()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}