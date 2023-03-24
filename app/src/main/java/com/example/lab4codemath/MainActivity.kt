package com.example.lab4codemath

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var editPounds: EditText
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPounds = findViewById(R.id.editPounds)
        result = findViewById(R.id.result)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var pounds = editPounds.text.toString().toDouble()
            val kilograms = getConversion(pounds)
            result.text = kilograms.toString().plus(" kilograms")
        }

    }

    private fun getConversion(editPounds: Double): Double {
        return editPounds*0.454
    }
}
