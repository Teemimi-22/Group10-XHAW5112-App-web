package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LifeSkillsScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills_screen)

        val lifeSkillsTextView: TextView = findViewById(R.id.lifeSkillsTextView)
        val lSButton: Button = findViewById(R.id.lSButton)
        lSButton.setOnClickListener {
            val intent = Intent(this, FormsScreen::class.java)
            intent.putExtra("autoCheckCourse4", true)
            startActivity(intent)
        }
        val backButton4 = findViewById<Button>(R.id.backButton4)
        backButton4.setOnClickListener {
            val intent = Intent(this, SixMonthsCourseScreen::class.java)
            startActivity(intent)
        }

        val bulletList = buildString {
            append("\u2022 Opening a bank account\n")
            append("\u2022 Basic labour law (know your rights)\n")
            append("\u2022 Basic reading and writing literacy\n")
            append("\u2022 Basic numeric literacy\n")
        }
        lifeSkillsTextView.text = bulletList.trim()
    }
}