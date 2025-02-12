package com.ud.proyectofinal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ClassroomListActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_BLOCK_NAME = "blockName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classroom_list)

        val floorContainer: LinearLayout = findViewById(R.id.floorContainer)
        val blockName = intent.getStringExtra(EXTRA_BLOCK_NAME) ?: ""

        val floors = when (blockName) {
            getString(R.string.block_1_2) -> listOf(
                Floor(
                    getString(R.string.floor_1),
                    R.drawable.bloque1piso1,
                    listOf("2-101", "3-101", "3-102", "3-103", "3-104", "2-103", "2-102", "1-103", "1-02", "1-101"),
                    "https://maps.app.goo.gl/UVhahgjHKBGkZzo26"
                ),
                Floor(getString(R.string.floor_2), R.drawable.bloque1piso2, listOf("1-203", "1-202", "1-201", "2-202", "2-203", "2-201", "3-201", "3-202", "3-203", "3-204")),
                Floor(getString(R.string.floor_3), R.drawable.bloque1piso3, listOf("1-303", "1-302", "2-303", "2-302", "1-301", "3-304", "3-303", "3-302", "3-301", "2-301")),
                Floor(getString(R.string.floor_4), R.drawable.bloque1piso4, listOf("2-402", "2-403", "2-401")),
                Floor(getString(R.string.floor_5), R.drawable.bloque1piso5, listOf("2-502", "2-503", "2-501"))
            )
            getString(R.string.block_5) -> listOf(
                Floor(getString(R.string.floor_1), R.drawable.bloque5_1, listOf("Laboratorio Estructuras Hidraulica", "Laboratorio de suelos concretos pavimentos", "Laboratorio especializado de alta tension"), "https://maps.app.goo.gl/gVHwfRNp8RscJJGPA"),
                Floor(getString(R.string.floor_2), R.drawable.bloque5_2, listOf("5-205", "5-204", "5-203", "5-201", "5-202")),
                Floor(getString(R.string.floor_3), R.drawable.bloque5_3, listOf("5-305", "5-304", "5-404", "5-301", "5-302"))
            )
            getString(R.string.block_6) -> listOf(
                Floor(getString(R.string.floor_1), R.drawable.bloque6_1, listOf("Decanatura"), "https://maps.app.goo.gl/jY9gLLDVPeX4PbaD8"),
                Floor(getString(R.string.floor_2), R.drawable.bloque6_2, listOf("Coordinacion"))
            )
            getString(R.string.block_7_8) -> listOf(
                Floor(getString(R.string.floor_1), R.drawable.bloque7_1, listOf("bloque 7 y 8 (antigua biblioteca)"), "https://maps.app.goo.gl/LroobyXe946EsQtaA")
            )
            getString(R.string.block_9) -> listOf(
                Floor(getString(R.string.floor_1), R.drawable.bloque9_1, listOf("9-106", "9-105", "9-104", "9-101", "9-102", "9-103"), "https://maps.app.goo.gl/GzAWm7FAL8cpMaiNA"),
                Floor(getString(R.string.floor_2), R.drawable.bloque92, listOf("9-206", "9-205", "9-204", "9-201", "9-202", "9-203"))
            )
            getString(R.string.block_11_12) -> listOf(
                Floor(getString(R.string.floor_1), R.drawable.bloque111, listOf("Taller de soldadura", "taller de mercanica"), "https://maps.app.goo.gl/kkQq4DiyUtPMw5Mw8"),
                Floor(getString(R.string.floor_2), R.drawable.bloque112, listOf("aula multiple 1", "aula multiple 2", "I.L.U.D", "11-202", "11-201", "12-202", "12-203", "12-204", "Taller de electronica y electrica"))
            )
            getString(R.string.block_13) -> listOf(
                Floor(getString(R.string.floor_1), R.drawable.bloque131, listOf("unidad de investigaciones, extension"), "https://maps.app.goo.gl/EgKqKpLsfjjKSWBK6"),
                Floor(getString(R.string.floor_2), R.drawable.bloque132, listOf("oficina", "4", "5", "6", "7", "8")),
                Floor(getString(R.string.floor_3), R.drawable.bloque133, listOf("Sala de profesores"))
            )
            getString(R.string.techne) -> listOf(
                Floor(getString(R.string.floor_1), R.drawable.tech1, listOf(""), "https://maps.app.goo.gl/rddcbxKV5bM6HEo27"),
                Floor(getString(R.string.floor_2), R.drawable.tech2, listOf(
                    "cuarto de equipos",
                    "laboratorio de mecanica de fluidos y bombas hidraulicas",
                    "diseño y desarrollo tecnologico-plasticos",
                    "oficina laboratorios",
                    "laboratorio de automatizacion y control neumatica",
                    "laboratorio de metrologia",
                    "laboratorio de cienci as termicas",
                    "laboratorio de tratamientos termicos",
                    "laboratorio de automatizacion y control hidraulica"
                )),
                Floor(getString(R.string.floor_3), R.drawable.tech3, listOf(
                    "laboratorio aplicado circuitosm electronica y control",
                    "laboratorio especializado de sistemas electricos",
                    "laboratorio aplicado maquinas electricas",
                    "equipos y servicios",
                    "laboratorio especializado de sistemas de potencia y smart grid",
                    "laboratorio G.E.I.O innovacion y desarrollo SISO",
                    "laboratorio F.M.S",
                    "oficina ing-industrial y almacen",
                    "diseño de producto",
                    "laboratorio H.A.S"
                )),
                Floor(getString(R.string.floor_4), R.drawable.tech4, listOf(
                    "Sala de software de ingenieria electrica",
                    "sala software de ingenieria civil",
                    "sala software de ingenieria mecanica I",
                    "sala software de ciencias basicas",
                    "sala software de ingenieria mecanica II",
                    "sala software e de ingenieria electronica I",
                    "sala software e de ingenieria electronica II",
                    "sala de software de ingenieria industrial I",
                    "sala de software de ingenieria industrial II"
                )),
                Floor(getString(R.string.floor_5), R.drawable.tech5, listOf(
                    "oficina sistemas",
                    "laboratorio redes y telematica",
                    "laboratorio redes inalambricas y desarrollo movil",
                    "laboratorio de simulacion y desarrollo de software",
                    "laboratorio software libre",
                    "desarrollo de software y realidad aumentada",
                    "inteligencia artificial y telepresencia",
                    "multimedia computacional y grafica",
                    "laboratorio de bases de datos y sistemas distribuidos",
                    "laboratorio ing en software"
                )),
                Floor(getString(R.string.floor_6), R.drawable.tech6, listOf(
                    "Laboratorio de circuitos impresos",
                    "laboratorio de electromecanica basica",
                    "laboratorio de telecomunicaciones",
                    "laboratorio especializado de control",
                    "practicas libres electronica",
                    "laboratorio aplicado de electronica",
                    "laboratorio de circuitos electricos",
                    "laboratorio de electromagnetismo"
                )),
                Floor(getString(R.string.floor_7), R.drawable.tech7, listOf("unidad de investigaciones, extension")),
                Floor(getString(R.string.floor_8), R.drawable.tech8, listOf("801", "802", "803", "804", "805", "806", "807", "808"))
            )
            else -> emptyList() // Agrega más bloques según sea necesario
        }

        floors.forEach { floor ->
            val floorView = layoutInflater.inflate(R.layout.floor_layout, floorContainer, false)
            val floorImageView: ImageView = floorView.findViewById(R.id.floorImageView)
            val floorNameTextView: TextView = floorView.findViewById(R.id.floorNameTextView)
            val floorMapLinkTextView: TextView = floorView.findViewById(R.id.floorMapLinkTextView)
            val classroomsContainer: LinearLayout = floorView.findViewById(R.id.classroomsContainer)

            // Configurar la imagen y el nombre del piso
            floorImageView.setImageResource(floor.imageResId)
            floorNameTextView.text = floor.name

            // Configurar el clic en la imagen para abrirla en pantalla completa
            floorImageView.setOnClickListener {
                val intent = Intent(this, FullscreenImageActivity::class.java)
                intent.putExtra(FullscreenImageActivity.EXTRA_IMAGE_RES_ID, floor.imageResId)
                startActivity(intent)
            }

            // Configurar el enlace de Maps
            if (floor.mapLink != null) {
                floorMapLinkTextView.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(floor.mapLink))
                    startActivity(intent)
                }
            } else {
                floorMapLinkTextView.visibility = View.GONE
            }

            // Añadir las aulas al contenedor
            floor.classrooms.forEach { classroom ->
                val classroomTextView = TextView(this)
                classroomTextView.text = classroom
                classroomTextView.textSize = 16f
                classroomsContainer.addView(classroomTextView)
            }

            floorContainer.addView(floorView)
        }
    }
}

data class Floor(val name: String, val imageResId: Int, val classrooms: List<String>, val mapLink: String? = null)
