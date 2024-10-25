package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class About : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val aboutTextView: TextView = findViewById(R.id.aboutTextView)
        aboutTextView.text =
                "Empowering the Nation is an initiative by Precious Radebe to provide skills training for domestic workers and gardeners." +
                "It was established in 2018 and offers courses in Johannesburg. Our small- to mid-size enterprise has trained over hundreds of domestic workers and gardeners on both the six-month long Learnerships and six-week Short Training Programmes to empower themselves and can provide more marketable skills. "
        val AbButton = findViewById<Button>(R.id.AbButton)
        AbButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }
}