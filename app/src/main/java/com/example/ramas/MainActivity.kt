package com.example.ramas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var navigationButton1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationButton1 = findViewById(R.id.button1)

        navigationButton1.setOnClickListener {
            var intent: Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}