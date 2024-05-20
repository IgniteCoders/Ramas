package com.example.ramas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var optionsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        optionsButton = findViewById(R.id.options)

        optionsButton.setOnClickListener {
            var intent: Intent = Intent(this, OptionsActivity::class.java)
            startActivity(intent)
        }
    }
}