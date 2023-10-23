package com.example.musicfans

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.button1)
        btn.setOnClickListener{
            val intent:Intent = Intent(this, screen1::class.java)
            startActivity(intent)
        }
    }
    }
