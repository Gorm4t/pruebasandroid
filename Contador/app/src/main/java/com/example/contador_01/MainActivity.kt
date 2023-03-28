package com.example.contador_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contador = 0


        val txtValor = findViewById<TextView>(R.id.txtContar)
        val btnContador = findViewById<Button>(R.id.btnContar)

        btnContador.setOnClickListener{
            contador = contador.inc()
            txtValor.text = "$contador"


        }

    }
}