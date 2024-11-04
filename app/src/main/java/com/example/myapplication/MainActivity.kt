package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val second=findViewById<ImageButton>(R.id.button)
        second.setOnClickListener{
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }

    }
}