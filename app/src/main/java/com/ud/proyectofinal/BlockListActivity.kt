package com.ud.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BlockListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block_list)

        val blocksContainer: LinearLayout = findViewById(R.id.blocksContainer)

        // Usamos los recursos de cadenas para los nombres de los bloques
        val blocks = listOf(
            Block(getString(R.string.block_1_2), R.drawable.bloque1_2),
            Block(getString(R.string.block_3_4), R.drawable.bloque3_4),
            Block(getString(R.string.block_5), R.drawable.bloque5),
            Block(getString(R.string.block_6), R.drawable.bloque6),
            Block(getString(R.string.block_7_8), R.drawable.bloque7_8),
            Block(getString(R.string.block_9), R.drawable.bloque9),
            Block(getString(R.string.block_11_12), R.drawable.bloque11_12),
            Block(getString(R.string.block_13), R.drawable.bloque13),
            Block(getString(R.string.techne), R.drawable.techne)
        )

        blocks.forEach { block ->
            val blockView = layoutInflater.inflate(R.layout.block_button_layout, blocksContainer, false)
            val blockImageButton: ImageButton = blockView.findViewById(R.id.blockImageButton)
            val blockNameTextView: TextView = blockView.findViewById(R.id.blockNameTextView)

            blockImageButton.setImageResource(block.imageResId)
            blockNameTextView.text = block.name

            // Acción cuando se hace clic en la imagen del bloque
            blockImageButton.setOnClickListener {
                val intent = Intent(this, FullscreenImageActivity::class.java)
                intent.putExtra(FullscreenImageActivity.EXTRA_IMAGE_RES_ID, block.imageResId)
                startActivity(intent)
            }

            // Acción cuando se hace clic en el nombre del bloque
            blockNameTextView.setOnClickListener {
                val intent = Intent(this, ClassroomListActivity::class.java)
                intent.putExtra(ClassroomListActivity.EXTRA_BLOCK_NAME, block.name)
                startActivity(intent)
            }

            blocksContainer.addView(blockView)
        }
    }
}

data class Block(val name: String, val imageResId: Int)
