package Project1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoapp.R

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_selection)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnCall = findViewById<Button>(R.id.btnCall)
        val txtAndroid = findViewById<TextView>(R.id.txtAndroid)
        val txtWeb = findViewById<TextView>(R.id.txtWeb)

        btnCall.setOnClickListener {
            val phoneNo = "0215623232"
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$phoneNo")
            }
            startActivity(intent)
        }
        txtAndroid.setOnClickListener{
            intent = Intent(applicationContext, AndroidActivity::class.java)
            startActivity(intent)
        }
        txtWeb.setOnClickListener {
            intent = Intent(applicationContext, WebActivity::class.java)
            startActivity(intent)
        }
    }
}