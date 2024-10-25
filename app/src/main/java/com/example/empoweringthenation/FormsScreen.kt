package com.example.empoweringthenation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class FormsScreen : AppCompatActivity() {


    private lateinit var course1: CheckBox
    private lateinit var course2: CheckBox
    private lateinit var course3: CheckBox
    private lateinit var course4: CheckBox
    private lateinit var course5: CheckBox
    private lateinit var course6: CheckBox
    private lateinit var course7: CheckBox

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forms_screen)


        val calculateButton: Button = findViewById(R.id.calculateButton)
        course1 = findViewById(R.id.course1)
        course2 = findViewById(R.id.course2)
        course3 = findViewById(R.id.course3)
        course4 = findViewById(R.id.course4)
        course5 = findViewById(R.id.course5)
        course6 = findViewById(R.id.course6)
        course7 = findViewById(R.id.course7)

        val autoCheckCourse1 = intent.getBooleanExtra("autoCheckCourse1", false)
        if (autoCheckCourse1) {
            course1.isChecked = true
        }
        val autoCheckCourse2 = intent.getBooleanExtra("autoCheckCourse2", false)
        if (autoCheckCourse2) {
            course2.isChecked = true
        }
        val autoCheckCourse3 = intent.getBooleanExtra("autoCheckCourse3", false)
        if (autoCheckCourse3) {
            course3.isChecked = true
        }
        val autoCheckCourse4 = intent.getBooleanExtra("autoCheckCourse4", false)
        if (autoCheckCourse4) {
            course4.isChecked = true
        }
        val autoCheckCourse5 = intent.getBooleanExtra("autoCheckCourse5", false)
        if (autoCheckCourse5) {
            course5.isChecked = true
        }
        val autoCheckCourse6 = intent.getBooleanExtra("autoCheckCourse6", false)
        if (autoCheckCourse6) {
            course6.isChecked = true
        }
        val autoCheckCourse7 = intent.getBooleanExtra("autoCheckCourse7", false)
        if (autoCheckCourse7) {
            course7.isChecked = true
        }

        calculateButton.setOnClickListener { calculateTotal() }
    }

    private fun calculateTotal() {
        var total = 0
        val selectedCourses = mutableListOf<String>()

        if (course1.isChecked) {
            total += 1500
            selectedCourses.add("First Aid")
        }
        if (course2.isChecked) {
            total += 1500
            selectedCourses.add("Sewing")
        }
        if (course3.isChecked) {
            total += 1500
            selectedCourses.add("Landscaping")
        }
        if (course4.isChecked) {
            total += 1500
            selectedCourses.add("Life Skills")
        }
        if (course5.isChecked) {
            total += 750
            selectedCourses.add("Child Minding")
        }
        if (course6.isChecked) {
            total += 750
            selectedCourses.add("Cooking")
        }
        if (course7.isChecked) {
            total += 750
            selectedCourses.add("Garden Maintenance")
        }

        // Calculate the discount based on the number of selected courses
        val (discountAmount, discountPercentage) = calculateDiscount(selectedCourses.size, total)

        // Calculate the amount after discount
        val discountedTotal = total - discountAmount

        // Apply VAT to the discounted total
        val vat = discountedTotal * 0.15

        // Calculate the final total (discounted total + VAT)
        val finalTotal = discountedTotal + vat

        // Pass data to the next activity (FeesScreen)
        val intent = Intent(this, FeesScreen::class.java).apply {
            putExtra("finalTotal", finalTotal)
            putExtra("discountPercentage", discountPercentage)
            putExtra("selectedCourses", selectedCourses.toTypedArray())
        }
        startActivity(intent)
    }

    private fun calculateDiscount(courseCount: Int, total: Int): Pair<Int, Int> {
        val discountPercentage = when {
            courseCount == 2 -> 5
            courseCount == 3 -> 10
            courseCount > 3 -> 15
            else -> 0
        }
        val discountAmount = (total * discountPercentage / 100)
        return Pair(discountAmount, discountPercentage)
    }


}
