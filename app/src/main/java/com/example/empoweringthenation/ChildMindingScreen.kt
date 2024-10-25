package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.empoweringthenation.R.id.cMButton
import com.example.empoweringthenation.R.id.childMindingTextView

class ChildMindingScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_minding_screen)

        val childMindingTextView: TextView = findViewById(childMindingTextView)
        val cMButton: Button = findViewById(cMButton)
        cMButton.setOnClickListener {
            val intent = Intent(this, FormsScreen::class.java)
            intent.putExtra("autoCheckCourse5", true)
            startActivity(intent)
        }
        val backButton5 = findViewById<Button>(R.id.backButton5)
        backButton5.setOnClickListener {
            val intent = Intent(this, SixWeeksCourseScreen::class.java)
            startActivity(intent)
        }

        val bulletList = buildString {
            append("\u2022 Birth to six-month old baby needs\n")
            append("\u2022 Seven-months to one year old needs\n")
            append("\u2022 Toddler needs\n")
            append("\u2022 Educational toys\n")
        }
        childMindingTextView.text = bulletList.trim()
    }
}