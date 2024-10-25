package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixWeeksCourseScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_weeks_course_screen)
        val childMindingButton = findViewById<Button>(R.id.childMindingButton)
        childMindingButton.setOnClickListener {
            val intent = Intent(this, ChildMindingScreen::class.java)
            startActivity(intent)
        }
        val cookingButton = findViewById<Button>(R.id.cookingButton)
        cookingButton.setOnClickListener {
            val intent = Intent(this, CookingScreen::class.java)
            startActivity(intent)
        }
        val gardenMaintenanceButton = findViewById<Button>(R.id.gardenMaintenanceButton)
        gardenMaintenanceButton.setOnClickListener {
            val intent = Intent(this, GardenMaintenanceScreen::class.java)
            startActivity(intent)
        }
        val homePageButton2 = findViewById<Button>(R.id.homePageButton2)
        homePageButton2.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
        val sixMonthsCourseButton = findViewById<Button>(R.id.sixMonthsCourseButton)
        sixMonthsCourseButton.setOnClickListener {
            val intent = Intent(this, SixMonthsCourseScreen::class.java)
            startActivity(intent)
        }
    }
}