package com.example.checkbox_04

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var txtNombre:EditText
    lateinit var chckNegrita:CheckBox
    lateinit var chckCursiva:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtNombre = findViewById(R.id.txtNombre)
        chckCursiva = findViewById(R.id.checkCursiva)
        chckNegrita = findViewById(R.id.checkNegrita)

    }
    fun clickCheck(view : View){
        txtNombre.typeface = Typeface.DEFAULT
        val presionado : CheckBox=view as CheckBox

        if (chckNegrita.isChecked && chckCursiva.isChecked){
            txtNombre.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        }else if (chckNegrita.isChecked){
            txtNombre.typeface = Typeface.defaultFromStyle(Typeface.BOLD)

        }else if(chckCursiva.isChecked){
            txtNombre.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        }else {

            txtNombre.typeface = Typeface.defaultFromStyle(Typeface.NORMAL)
        }


    }

}