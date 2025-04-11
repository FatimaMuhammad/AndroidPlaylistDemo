package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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