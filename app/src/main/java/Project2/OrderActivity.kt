package Project2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoapp.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderBinding

    companion object {
        const val KEY_ = "order.key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
        binding.etName.append("\n• ")
        binding.etOrder.append("\n• ")
        binding.etNo.append("\n• ")
        binding.etTable.append("• ")
        val orderPlaced = binding.etName.text.toString() + "" +
                binding.etOrder.text.toString() + " " +
                binding.etNo.text.toString() + " " +
                binding.etTable.text.toString()

            intent = Intent(this, SendActivity::class.java)
            intent.putExtra(KEY_, orderPlaced)
            startActivity(intent)

        }
    }
}