package quintero.jesus.morehealthy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        var splash = findViewById<RelativeLayout>(R.id.splash)
        var signin_btn = findViewById<Button>(R.id.signin_btn)
        var registro_btn = findViewById<TextView>(R.id.registro_btn)
        splash.setOnClickListener {
            setContentView(R.layout.activity_main)
        }
        signin_btn.setOnClickListener {
            setContentView(R.layout.activity_main)
        }
        registro_btn.setOnClickListener {
            setContentView(R.layout.activity_signup)
        }
    }
}