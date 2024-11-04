package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val second = findViewById<ImageButton>(R.id.scan_button)
        second.setOnClickListener {
            val intent1 = Intent(this, MainActivity4::class.java)
            startActivity(intent1)
        }
        val third = findViewById<ImageButton>(R.id.tools_button)
        third.setOnClickListener {
            val intent2 = Intent(this, MainActivity8::class.java)
            startActivity(intent2)
        }
        val fourth=findViewById<Button>(R.id.settings_button)
        fourth.setOnClickListener {
            val intent=Intent(this,MainActivity7::class.java)
            startActivity(intent)

        }
    }
}