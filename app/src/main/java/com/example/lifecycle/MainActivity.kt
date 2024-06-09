package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Android", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Android", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Android", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Android" , "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Android", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Android", "onRestart")
    }
}