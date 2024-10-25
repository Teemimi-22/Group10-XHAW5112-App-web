package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixMonthsCourseScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_months_course_screen)
        val firstAidButton = findViewById<Button>(R.id.firstAidButton)
        firstAidButton.setOnClickListener {
            val intent = Intent(this, FirstAidScreen::class.java)
            startActivity(intent)
        }
        val sewingButton = findViewById<Button>(R.id.sewingButton)
        sewingButton.setOnClickListener {
            val intent = Intent(this, SewingScreen::class.java)
            startActivity(intent)
        }
        val landscapingButton = findViewById<Button>(R.id.landscapingButton)
        landscapingButton.setOnClickListener {
            val intent = Intent(this, LandScapingScreen::class.java)
            startActivity(intent)
        }
        val lifeSkillsButton = findViewById<Button>(R.id.lifeSkillsButton)
        lifeSkillsButton.setOnClickListener {
            val intent = Intent(this, LifeSkillsScreen::class.java)
            startActivity(intent)
        }
        val homePageButton1 = findViewById<Button>(R.id.homePageButton1)
        homePageButton1.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
        val sixWeeksCoursesButton1 = findViewById<Button>(R.id.sixWeeksCoursesButton)
        sixWeeksCoursesButton1.setOnClickListener {
            val intent = Intent(this, SixWeeksCourseScreen::class.java)
            startActivity(intent)
        }
    }
}