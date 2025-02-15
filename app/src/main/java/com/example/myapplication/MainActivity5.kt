package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val fifth=findViewById<ImageButton>(R.id.model_button)
        fifth.setOnClickListener{
            val intent= Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
        val sixth=findViewById<Button>(R.id.home_button)
        sixth.setOnClickListener{
            val intent2=Intent(this,MainActivity4::class.java)
            startActivity(intent2)
        }
        val seventh=findViewById<ImageButton>(R.id.place_button)
        seventh.setOnClickListener{
            val intent3=Intent(this,MainActivity2::class.java)
            startActivity(intent3)
        }
        val fourth=findViewById<Button>(R.id.settings_button)
        fourth.setOnClickListener {
            val intent=Intent(this,MainActivity7::class.java)
            startActivity(intent)

        }

    }
}