package com.example.demoapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Layout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)
        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.btnRead)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLay)

        buttonRead.setOnClickListener {

            //change theme to light
            linearLayout.setBackgroundResource(R.color.yellow)
            Toast.makeText(applicationContext, "WELCOME TO READ MODE", Toast.LENGTH_SHORT).show()
        }
        buttonDark.setOnClickListener {
            //change theme to Dark
            linearLayout.setBackgroundResource(R.color.purple)
            Toast.makeText(applicationContext, "Welcome to Dark", Toast.LENGTH_SHORT).show()
        }

    }
}