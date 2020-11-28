package uk.co.dcfhosting.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<TextView>(R.id.roll_button)
        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultTV: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6) + 1
        resultTV.text = randomInt.toString()
    }
}