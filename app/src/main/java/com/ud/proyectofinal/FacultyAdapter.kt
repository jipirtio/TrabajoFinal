package com.ud.proyectofinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class FacultyAdapter(context: Context, faculties: List<Faculty>) : ArrayAdapter<Faculty>(context, 0, faculties) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.faculty_list_item, parent, false)

        val faculty = getItem(position)

        val nameTextView: TextView = view.findViewById(R.id.facultyNameTextView)
        val deanTextView: TextView = view.findViewById(R.id.facultyDeanTextView)
        val addressTextView: TextView = view.findViewById(R.id.facultyAddressTextView)
        val emailTextView: TextView = view.findViewById(R.id.facultyEmailTextView)
        val phoneTextView: TextView = view.findViewById(R.id.facultyPhoneTextView)
        val scheduleTextView: TextView = view.findViewById(R.id.facultyScheduleTextView)
        val imageView: ImageView = view.findViewById(R.id.facultyImageView)

        nameTextView.text = faculty?.name
        deanTextView.text = "Decano: ${faculty?.dean}"
        addressTextView.text = "Dirección: ${faculty?.address}"
        emailTextView.text = "Email: ${faculty?.email}"
        phoneTextView.text = "Teléfono: ${faculty?.phone}"
        scheduleTextView.text = "Horario: ${faculty?.schedule}"
        imageView.setImageResource(faculty?.imageResId ?: 0)

        return view
    }
}