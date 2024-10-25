package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Contact : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        val contactTextView: TextView = findViewById(R.id.contactTextView)
        contactTextView.text = "Phone number: +27720984732\n" + "Email: impowerthenationsa@gmail.com\n" +"\n"+"First branch:\n" +"Smit Service Road\n" +"Braamfontein 2210\n" +"Johannesburg\n" +"\n" +"Second branch:\n" +"36 Olympia Street\n" +"Kensington 5510\n" +"Johannesburg\n" + "\n" + "Third branch:\n" + "05 Millar Street\n" + "Sophiatown\n" + "Johannesburg"
        val phoneButton = findViewById<Button>(R.id.phoneButton)
        phoneButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }

}