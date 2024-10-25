package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstAidScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid_screen)

        val firstAidTextView: TextView = findViewById(R.id.firstAidTextView)
        val fAButton: Button = findViewById(R.id.fAButton)
        fAButton.setOnClickListener {
            val intent = Intent(this, FormsScreen::class.java)
            intent.putExtra("autoCheckCourse1", true)
            startActivity(intent)
        }
        val backButton1 = findViewById<Button>(R.id.backButton1)
        backButton1.setOnClickListener {
            val intent = Intent(this, SixMonthsCourseScreen::class.java)
            startActivity(intent)
        }
        val bulletList = buildString {
            append("\u2022 Wounds and bleeding\n")
            append("\u2022 Types of protein, carbohydrates and vegetables\n")
            append("\u2022 Planning meals\n")
            append("\u2022 Preparation and cooking of meals\n")
            append("\u2022 Respiratory distress e.g., choking, blocked airway\n")
        }
        firstAidTextView.text = bulletList.trim()
    }
}