package com.ud.proyectofinal

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class SearchActivity : AppCompatActivity() {

    private lateinit var facultyNameTextView: TextView
    private lateinit var findBlockButton: Button
    private lateinit var chatButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        facultyNameTextView = findViewById(R.id.facultyNameTextView)
        findBlockButton = findViewById(R.id.findBlockButton)
        chatButton = findViewById(R.id.chatButton)

        val facultyName = intent.getStringExtra("FACULTY_NAME")
        facultyNameTextView.text = facultyName

        // Implementa la lógica para los botones
        findBlockButton.setOnClickListener {
            // Lógica para encontrar bloque
        }

        chatButton.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }
    }
}