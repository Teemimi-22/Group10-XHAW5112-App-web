package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeesScreen : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var phoneEditText: EditText
    private lateinit var emailEditText: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fees_screen)

        nameEditText = findViewById(R.id.namesEditText)
        phoneEditText = findViewById(R.id.phoneEditText)
        emailEditText = findViewById(R.id.emailsEditText)

        val finalTotal = intent.getDoubleExtra("finalTotal", 0.0)
        val discountAmount = intent.getDoubleExtra("discountAmount", 0.0)
        val discountPercentage = intent.getIntExtra("discountPercentage", 0)
        val selectedCourses = intent.getStringArrayExtra("selectedCourses")

        val totalTextView: TextView = findViewById(R.id.totalTextView)
        val discountTextView: TextView = findViewById(R.id.discountTextView)
        val coursesTextView: TextView = findViewById(R.id.coursesTextView)
        val requestQuoteButton = findViewById<Button>(R.id.requestQuoteButton)

        totalTextView.text = "Total Fee (including 15% VAT): R$finalTotal"
        discountTextView.text = "Discount Applied: $discountPercentage%"
        coursesTextView.text = "Courses Selected: (${selectedCourses?.size ?: 0}): ${selectedCourses?.joinToString(", ")}"

        // Error handling for empty fields
        requestQuoteButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()
            val phone = phoneEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()

            // Check if any field is empty
            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter your name.", Toast.LENGTH_SHORT).show()
            } else if (phone.isEmpty()) {
                Toast.makeText(this, "Please enter your phone number.", Toast.LENGTH_SHORT).show()
            } else if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your email address.", Toast.LENGTH_SHORT).show()
            } else {
                // If all fields are filled, proceed to the next screen
                val intent = Intent(this, QuoteScreen::class.java)
                startActivity(intent)
            }
        }
    }
}
