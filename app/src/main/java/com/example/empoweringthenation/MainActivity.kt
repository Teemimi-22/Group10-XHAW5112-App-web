package com.example.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logInButton = findViewById<Button>(R.id.logInButton)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)

        logInButton.setOnClickListener {
            val email = editTextEmail.text.toString().trim()
            val password = editTextPassword.text.toString().trim()

            if (email.isEmpty()) {
                // Show a toast if the email field is empty
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            } else if (password.isEmpty()) {
                // Show a toast if the password field is empty
                Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show()
            } else {
                // If both fields are filled, navigate to HomeScreen
                val intent = Intent(this, HomeScreen::class.java)
                startActivity(intent)
            }
        }
    }
}
