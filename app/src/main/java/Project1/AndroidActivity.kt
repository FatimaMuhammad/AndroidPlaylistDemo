package Project1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoapp.R

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_android)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val clickAndroid = findViewById<CardView>(R.id.ClickAnd)
        val purchase = findViewById<Button>(R.id.btnCall)

        clickAndroid.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data =
                Uri.parse("https://roadmap.sh/android")
                startActivity(intent)

        }
        purchase.setOnClickListener {
            intent = Intent(applicationContext, CourseHistory::class.java)
            startActivity(intent)
        }
    }
}