package com.ud.proyectofinal

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FullscreenImageActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGE_RES_ID = "imageResId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen_image)

        val imageResId = intent.getIntExtra(EXTRA_IMAGE_RES_ID, 0)
        val fullscreenImageView: ImageView = findViewById(R.id.fullscreenImageView)

        fullscreenImageView.setImageResource(imageResId)
    }
}