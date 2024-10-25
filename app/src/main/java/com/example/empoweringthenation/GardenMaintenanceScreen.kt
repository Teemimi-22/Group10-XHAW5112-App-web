package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GardenMaintenanceScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_maintenance_screen)

        val gardenTextView: TextView = findViewById(R.id.gardenTextView)
        val gMButton = findViewById<Button>(R.id.gMButton)
        gMButton.setOnClickListener {
            val intent = Intent(this, FormsScreen::class.java)
            intent.putExtra("autoCheckCourse7", true)  // Pass flag to auto-check course7
            startActivity(intent)
        }
        val backButton7 = findViewById<Button>(R.id.backButton7)
        backButton7.setOnClickListener {
            val intent = Intent(this, SixWeeksCourseScreen::class.java)
            startActivity(intent)
        }

        val bulletList = buildString {
            append("\u2022 Water restrictions and the watering of indigenous and exotic plants\n")
            append("\u2022 Pruning and  propagation of plants\n")
            append("\u2022 Planting techniques for different plant types\n")
        }
        gardenTextView.text = bulletList.trim()
    }
}