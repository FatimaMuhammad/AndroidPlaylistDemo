package Project2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoapp.R
import com.example.demoapp.databinding.ActivityMainBinding
import com.example.demoapp.databinding.ActivityWelcomeScreenBinding

class WelcomeScreen : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWelcome.setOnClickListener{
        intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }

    }
}