package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity6 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val sixth=findViewById<Button>(R.id.home_button)
        sixth.setOnClickListener{
            val intent2= Intent(this,MainActivity5::class.java)
            startActivity(intent2)
        }
        val fourth=findViewById<Button>(R.id.settings_button)
        fourth.setOnClickListener {
            val intent=Intent(this,MainActivity7::class.java)
            startActivity(intent)

        }

    }
}