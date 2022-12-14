package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    // make a classwide static constant in kotlin
    companion object {
        // all your static constants go here
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
    }

}