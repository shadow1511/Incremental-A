package com.example.incrementala

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var clickCount = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterText = findViewById<TextView>(R.id.counterText)
        val clickButton = findViewById<Button>(R.id.clickButton)

        clickButton.setOnClickListener {
            clickCount++
            counterText.text = "Clicks: $clickCount"
        }
    }
}