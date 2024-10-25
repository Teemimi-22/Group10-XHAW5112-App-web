package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val monthsButton = findViewById<Button>(R.id.monthsButton)
        monthsButton.setOnClickListener {
            val intent = Intent(this, SixMonthsCourseScreen::class.java)
            startActivity(intent)
        }
        val weeksButton = findViewById<Button>(R.id.weeksButton)
        weeksButton.setOnClickListener {
            val intent = Intent(this, SixWeeksCourseScreen::class.java)
            startActivity(intent)
        }
        val aboutButton = findViewById<Button>(R.id.aboutButton)
        aboutButton.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
        val contactButton = findViewById<Button>(R.id.contactButton)
        contactButton.setOnClickListener {
            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
        }

        val formsScreenButton = findViewById<Button>(R.id.formsScreenButton)
        formsScreenButton.setOnClickListener {
            val intent = Intent(this, FormsScreen::class.java)
            startActivity(intent)
        }
    }
}