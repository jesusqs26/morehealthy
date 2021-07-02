package quintero.jesus.morehealthy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var signup_btn = findViewById<Button>(R.id.signin_btn)

        signup_btn.setOnClickListener {
            setContentView(R.layout.activity_signup2)
        }
    }
}