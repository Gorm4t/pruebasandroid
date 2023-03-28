package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtResultado:TextView
    lateinit var rdSumis: RadioButton
    lateinit var rdRestis: RadioButton
    lateinit var rdDivis : RadioButton
    lateinit var rdMultis: RadioButton
    lateinit var num1: EditText
    lateinit var num2: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Inicializando
        txtResultado = findViewById(R.id.tvResultado)
        rdSumis = findViewById(R.id.rdSuma)
        rdRestis = findViewById(R.id.rdResta)
        rdMultis = findViewById(R.id.rdMulti)
        rdDivis = findViewById(R.id.rdDiv)
        num1 = findViewById(R.id.edNum1)
        num2 = findViewById(R.id.edNum2)


    }
    fun accionBoton(v: View){
       val numerito1 = num1.text.toString().toInt()
       val numerito2 = num2.text.toString().toInt()
       var resultado = 0
       if(rdSumis.isChecked){

           resultado = numerito1 + numerito2
       } else if(rdRestis.isChecked){
           resultado= numerito1 - numerito2

       } else if (rdMultis.isChecked){
           resultado = numerito1 * numerito2

       }else if (rdDivis.isChecked){
           resultado = numerito1 / numerito2
       }

        txtResultado.text="$resultado"


    }
}