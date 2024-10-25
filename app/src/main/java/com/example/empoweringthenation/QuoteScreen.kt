package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ActionMenuView
import android.widget.Button

class QuoteScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote_screen)
        val eButton = findViewById<Button>(R.id.eButton)
        eButton.setOnClickListener {
            val intent = Intent(this, FeesScreen::class.java)
            startActivity(intent)
        }
        val tButton = findViewById<Button>(R.id.tButton)
        tButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }
}
