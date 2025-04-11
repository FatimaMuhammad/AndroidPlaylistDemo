package com.example.demoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
      val buttonUpload = findViewById<Button>(R.id.btnUpload)
      val buttonDownload = findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext, "Uploading", Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext, "Download in Progress", Toast.LENGTH_SHORT).show()
        }
      val btnIntent = findViewById<Button>(R.id.Next)
        btnIntent.setOnClickListener {
            intent = Intent(applicationContext, LinearLayout::class.java)
            startActivity(intent)
        }

    }
}