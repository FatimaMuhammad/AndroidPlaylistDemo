package com.example.demoapp.Basics

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoapp.R

class ImplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val webBtn = findViewById<CardView>(R.id.cardWeb)
        val camBtn = findViewById<CardView>(R.id.cardCam)
        val msgBtn = findViewById<CardView>(R.id.cardmsg)
        val callBtn = findViewById<CardView>(R.id.cardcall)
        val payBtn = findViewById<CardView>(R.id.cardPay)
        val photoBtn = findViewById<CardView>(R.id.cardphotos)

        webBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data =
                Uri.parse("https://pk.linkedin.com/in/fatima-m-yousuf?original_referer=https%3A%2F%2Fwww.google.com%2F")
            startActivity(intent)
        }
        camBtn.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }
        msgBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_APP_MESSAGING)
            startActivity(intent)
        }
        callBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
        photoBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivity(intent)

        }
        payBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_APP_CONTACTS)
            startActivity(intent)


        }
    }
}