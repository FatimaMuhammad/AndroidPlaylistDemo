package Project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoapp.R
import java.security.Key

class CourseHistory : AppCompatActivity() {
    //companion Obj
    companion object{
        const val KEY_ = "course.key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_course_history)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val etName = findViewById<EditText>(R.id.etName)
        val etCourse = findViewById<EditText>(R.id.etCourse)
        val etNO = findViewById<EditText>(R.id.etNo)
        val etEmail = findViewById<EditText>(R.id.etEmail)

       btnOrder.setOnClickListener {
           val course = etName.text.toString() + " " +
                   etEmail.text.toString() + " " +
                   etNO.text.toString() + " " +
                   etCourse.text.toString()

           intent = Intent(this, CourseList::class.java)
           intent.putExtra(KEY_, course)
           startActivity(intent)

       }
    }
}