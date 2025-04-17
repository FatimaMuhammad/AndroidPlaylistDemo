package Project2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoapp.R
import com.example.demoapp.databinding.ActivitySendBinding
import com.example.demoapp.databinding.ActivityWelcomeScreenBinding

class SendActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val order = intent.getStringExtra(OrderActivity.KEY_)
        binding.TxtOrder.text = order.toString()

    }
}