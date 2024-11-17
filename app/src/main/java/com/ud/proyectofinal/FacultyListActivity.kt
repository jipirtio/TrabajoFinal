package com.ud.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView

class FacultyListActivity : AppCompatActivity() {

    private lateinit var facultyListView: ListView
    private lateinit var searchView: SearchView

    private val faculties = listOf(
        Faculty(
            "Facultad de Artes - ASAB",
            "Santiago Niño Morales",
            "Carrera 13 # 14 - 69 Piso 2",
            "decanatura_artes@udistrital.edu.co",
            "PBX: (+57) 6013239300 Ext(s): 6616",
            "Lunes a viernes de 8:00 a.m. a 5:00 p.m.",
            R.drawable.asab // Reemplaza con el nombre de tu imagen
        ),
        Faculty(
            "Facultad de Ciencias de la Salud",
            "María del Pilar Jimenez Márquez",
            "Calle 52 Sur # 93D - 97 Bosa El Porvenir",
            "deccienciassalud@udistrital.edu.co",
            "PBX: (+57) 6013239300 Ext(s): 4256",
            "lunes a viernes de 8:00 a.m. a 5:00 p.m.",
            R.drawable.ciencias_salud // Reemplaza con el nombre de tu imagen
        ),
        Faculty(
            "Facultad de Ciencias Matemáticas y Naturales",
            "Wilson Jairo Pinzón Casallas",
            "Carrera 4 # 26 D - 31",
            "deccienciasmatynat@udistrital.edu.co",
            "PBX: (+57) 6013239300 Ext(s): 3803",
            "Lunes a viernes 9:00 a.m. a 4:00 p.m.",
            R.drawable.matematicas // Reemplaza con el nombre de tu imagen
        ),
        Faculty(
            "Facultad de Ciencias y Educación",
            "Esperanza del Pilar Infante Luna",
            "Carrera 3 # 26A - 40 Piso 2",
            "dciencia@udistrital.edu.co",
            "PBX: (+57) 6013239300 Ext(s): 3030",
            "Lunes a viernes de 8 a.m a 5 p.m.",
            R.drawable.ciencias_educacion // Reemplaza con el nombre de tu imagen
        ),
        Faculty(
            "Facultad de Ingeniería",
            "José Ignacio Rodríguez Molano",
            "Carrera 7 # 40B - 53 Piso 10",
            "decano_ing@udistrital.edu.co",
            "PBX: (+57) 6013239300 Ext(s): 1502",
            "Lunes a viernes de 8:00 a.m. a 5:00 p.m.",
            R.drawable.ingenieria // Reemplaza con el nombre de tu imagen
        ),
        Faculty(
            "Facultad del Medio Ambiente y Recursos Naturales",
            "Wilmar Darío Fernández Gómez",
            "Carrera 5 Este # 15-82 Piso 2",
            "dmedioa@udistrital.edu.co",
            "PBX: (+57) 6013239300 Ext(s): 4033",
            "Lunes a viernes de 8 a.m a 5 p.m.",
            R.drawable.medio_ambiente // Reemplaza con el nombre de tu imagen
        ),
        Faculty(
            "Facultad Tecnológica",
            "Henry Montaña Quintero",
            "Calle 68D Bis A Sur # 49F - 70 Bloque 6, piso 1",
            "dectecnologica@udistrital.edu.co",
            "PBX: (+57) 6013239300 Ext(s): 5003",
            "Lunes a viernes de 8:00 a.m. a 5:00 p.m.",
            R.drawable.tecnologica // Reemplaza con el nombre de tu imagen
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculty_list)

        facultyListView = findViewById(R.id.facultyListView)
        searchView = findViewById(R.id.searchView)

        val adapter = FacultyAdapter(this, faculties)
        facultyListView.adapter = adapter

        // Navegación a SearchActivity al hacer clic en una facultad
        facultyListView.setOnItemClickListener { _, _, position, _ ->
            val faculty = faculties[position]
            val intent = Intent(this, SearchActivity::class.java)
            intent.putExtra("FACULTY_NAME", faculty.name)
            startActivity(intent)
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        })
    }
}