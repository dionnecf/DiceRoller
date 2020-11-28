package uk.co.dcfhosting.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<TextView>(R.id.roll_button)
        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}