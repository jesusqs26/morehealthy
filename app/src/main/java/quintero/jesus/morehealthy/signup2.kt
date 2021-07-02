package quintero.jesus.morehealthy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup2)
        var signup2_btn = findViewById<Button>(R.id.signup2_btn)

        signup2_btn.setOnClickListener {
            setContentView(R.layout.activity_signup2)
        }
    }
}