package com.ammar.veterinariansapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val btnGo : ImageButton = findViewById(R.id.go)

        btnGo.setOnClickListener {
            startActivity(Intent(this, ListVeterinarians::class.java))
            finish()
        }
    }
}