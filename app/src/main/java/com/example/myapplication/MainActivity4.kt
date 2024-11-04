package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val fourth=findViewById<ImageButton>(R.id.some_button)
        fourth.setOnClickListener{
            val intent1= Intent(this,MainActivity5::class.java)
            startActivity(intent1)
        }
        val fifth=findViewById<Button>(R.id.back_button)
        fifth.setOnClickListener{
            val intent2=Intent(this,MainActivity3::class.java)
            startActivity(intent2)
        }
        val fourthw=findViewById<Button>(R.id.settings_button)
        fourthw.setOnClickListener {
            val intent=Intent(this,MainActivity7::class.java)
            startActivity(intent)

        }

    }
}