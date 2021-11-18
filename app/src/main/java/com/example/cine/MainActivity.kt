package com.example.cine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Kotlin = findViewById<Button>(R.id.btn2)
        Kotlin.setOnClickListener {
            val Kotlin = Intent(this, MainActivity2::class.java)
            startActivity(Kotlin)
        }
        val VIDEO2 = findViewById<Button>(R.id.btnc)
        VIDEO2.setOnClickListener {
            val VIDEO2 = Intent(this, MainActivity3::class.java)
            startActivity(VIDEO2)
        }

    }
}