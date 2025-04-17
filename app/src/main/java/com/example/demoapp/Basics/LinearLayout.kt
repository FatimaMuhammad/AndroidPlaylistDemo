package com.example.demoapp.Basics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.demoapp.R

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
        val btnIntent = findViewById<Button>(R.id.btnNext)

        btnIntent.setOnClickListener {
            intent = Intent(applicationContext, Layout::class.java)
            startActivity(intent)
        }
    }
}