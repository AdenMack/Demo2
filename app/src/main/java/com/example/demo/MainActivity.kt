package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible

private lateinit var greeting: TextView
private lateinit var goodbyeButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goodbyeButton = findViewById(R.id.goodbye_button)
        greeting = findViewById(R.id.greeting)

        goodbyeButton.setOnClickListener {
            goodbyeButton.isInvisible
            greeting.isInvisible
        }
    }
}