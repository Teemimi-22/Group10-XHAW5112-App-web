package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LandScapingScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_land_scaping_screen)

        val landscapingTextView: TextView = findViewById(R.id.landscapingTextView)
        val lButton: Button = findViewById(R.id.lButton)
        lButton.setOnClickListener {
            val intent = Intent(this, FormsScreen::class.java)
            intent.putExtra("autoCheckCourse3", true)
            startActivity(intent)
        }
        val backButton3 = findViewById<Button>(R.id.backButton3)
        backButton3.setOnClickListener {
            val intent = Intent(this, SixMonthsCourseScreen::class.java)
            startActivity(intent)
        }

        val bulletList = buildString {
            append("\u2022 Indigenous and exotic plants and trees\n")
            append("\u2022 Fixed structures (fountains, statues, benches, tables, built-in braai\n")
            append("\u2022 Balancing of plants and trees in a garden\n")
            append("\u2022 Aesthetics of plant shapes and colours\n")
            append("\u2022 Garden layout\n")
        }
        landscapingTextView.text = bulletList.trim()
    }
}