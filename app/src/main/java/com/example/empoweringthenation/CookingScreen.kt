package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CookingScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking_screen)

        val cookingTextView:TextView= findViewById(R.id.cookingTextView)
        val cButton: Button = findViewById(R.id.cButton)
        cButton.setOnClickListener {
            val intent = Intent(this, FormsScreen::class.java)
            intent.putExtra("autoCheckCourse6", true)
            startActivity(intent)
        }
        val backButton6 = findViewById<Button>(R.id.backButton6)
        backButton6.setOnClickListener {
            val intent = Intent(this, SixWeeksCourseScreen::class.java)
            startActivity(intent)
        }

        val bulletList = buildString {
            append("\u2022 Nutritional requirements for a healthy body\n")
            append("\u2022 Types of protein, carbohydrates and vegetables\n")
            append("\u2022 Planning meals\n")
            append("\u2022 Preparation and cooking of meals\n")
        }
        cookingTextView.text = bulletList.trim()
    }

}