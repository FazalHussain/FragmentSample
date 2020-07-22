package com.example.fragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.replaceFragment(R.id.container, PostFragment(), true)
    }

    fun setDetailFragment() {
        supportFragmentManager.replaceFragment(R.id.container, DetailFragment(), true)
    }


}