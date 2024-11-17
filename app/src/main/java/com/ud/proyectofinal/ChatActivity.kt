package com.ud.proyectofinal

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {

    private lateinit var messagesTextView: TextView
    private lateinit var messageEditText: EditText
    private lateinit var sendButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        messagesTextView = findViewById(R.id.messagesTextView)
        messageEditText = findViewById(R.id.messageEditText)
        sendButton = findViewById(R.id.sendButton)

        // Implementa la lógica para enviar mensajes
        sendButton.setOnClickListener {
            val message = messageEditText.text.toString()
            if (message.isNotEmpty()) {
                // Agrega el mensaje a la vista de mensajes
                messagesTextView.append(message + "\n")
                messageEditText.text.clear()
            }
        }
    }
}