package com.example.volleyballapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", "SecondActivity создана")
        setContentView(R.layout.activity_second)
    }
}
