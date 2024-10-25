package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SewingScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing_screen)

        val sewingTextView: TextView = findViewById(R.id.sewingTextView)
        val sButton: Button = findViewById(R.id.sButton)
        sButton.setOnClickListener {
            val intent = Intent(this, FormsScreen::class.java)
            intent.putExtra("autoCheckCourse2", true)
            startActivity(intent)
        }
        val backButton2 = findViewById<Button>(R.id.backButton2)
        backButton2.setOnClickListener {
            val intent = Intent(this, SixMonthsCourseScreen::class.java)
            startActivity(intent)
        }
        val bulletList = buildString {
            append("\u2022 Types of stitches\n")
            append("\u2022 Threading a sewing machine\n")
            append("\u2022 Sewing buttons, zips, hems and seams\n")
            append("\u2022 Alterations\n")
            append("\u2022 Designing and sewing new garments\n")
        }
        sewingTextView.text = bulletList.trim()
    }
}