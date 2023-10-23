package com.example.musicfans

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.musicfans.R.id


class screen1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_screen1)

            val btn: Button = findViewById(id.butoon)
            val intent = Intent(this, screen3::class.java)
            startActivity(intent)

    }
}

