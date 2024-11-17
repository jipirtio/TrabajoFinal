package com.ud.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findFacultyButton: Button = findViewById(R.id.findFacultyButton)
        val loginButton: Button = findViewById(R.id.loginButton)

        findFacultyButton.setOnClickListener {
            val intent = Intent(this, FacultyListActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}