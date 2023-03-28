package com.example.lenguaje05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {


    lateinit var txtTitulo: TextView
    lateinit var txtCaracteristicas: TextView
    lateinit var spLenguajes: Spinner
    var lenguajes = arrayOf("Java","Kotlin","PHP", "SWIFT", "C#", "C++","DART","JS")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inicializar
        txtTitulo = findViewById(R.id.tituloVentana)
        txtCaracteristicas = findViewById(R.id.txtCaracteristica)
        spLenguajes= findViewById(R.id.sp_lenguaje)
        //adaptador
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lenguajes)
        //como se comporta
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spLenguajes.adapter = adaptador
        spLenguajes.onItemSelectedListener = this


    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, posicion: Int, p3: Long) {
        val valorSeleccionado = lenguajes[posicion]
        Toast.makeText(this, "Selecciono $valorSeleccionado",Toast.LENGTH_LONG).show()
        when (posicion){
            0 ->{
                txtTitulo.setText("Java")
                txtCaracteristicas.setText("Descripcion Java")
            }
            1 ->{
                txtTitulo.setText("Kotlin")
                txtCaracteristicas.setText("Descripcion Kotlin")

            }
            2 ->{
                txtTitulo.setText("PHP")
                txtCaracteristicas.setText("Descripcion PHP")

            }
            3 ->{
                txtTitulo.setText("SWIFT")
                txtCaracteristicas.setText("Descripcion Swift")

            }
            4 ->{
                txtTitulo.setText("C#")
                txtCaracteristicas.setText("Descripcion c#")

            }
            5 ->{
                txtTitulo.setText("C++")
                txtCaracteristicas.setText("Descripcion c++")

            }
            6 ->{
                txtTitulo.setText("DART")
                txtCaracteristicas.setText("Descripcion dart")

            }
            7 ->{
                txtTitulo.setText("JAVA SCRIPT")
                txtCaracteristicas.setText("Descripcion java script")

            }

        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}