package com.example.agenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast


class Editar : AppCompatActivity() {
    lateinit var txtNombre : TextView
    lateinit var txtApellido : TextView
    lateinit var txtEdad : TextView

    var id1 = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar)
        txtNombre = findViewById(R.id.txtNombre)
        txtApellido = findViewById(R.id.txtApellido)
        txtEdad = findViewById(R.id.txtEdad)


        val nombre = intent.getStringExtra("nombre")
        val apellido = intent.getStringExtra("apellido")
        val edad = intent.getStringExtra("edad")
        val id = intent.getStringExtra("id")
        id1 = Integer.parseInt(id)


        txtNombre.setText(nombre)
        txtApellido.setText(apellido)
        txtEdad.setText(edad)


    }
    fun guardar(v: View){
        val nombre = txtNombre.text.toString()
        val apellido = txtApellido.text.toString()
        val edad = txtEdad.text.toString()
        val persona = Persona(nombre,apellido,edad,id1.toString())
        Auxiliar.listPersona[id1] = persona
        Toast.makeText( this, "Usuario editado" , Toast.LENGTH_SHORT).show()


        finish()
    }
}