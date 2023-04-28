package mx.edu.tecmm.moviles.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textito:TextView
    lateinit var botoncito:Button
    lateinit var btnReset :Button

     private var contador:Int = 0
     private var conteoArriba = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
btnReset=findViewById(R.id.btnReset)
        textito = findViewById(R.id.tvContador)
        botoncito = findViewById(R.id.btnContador)


        btnReset.setOnClickListener {
            conteoArriba=true
            contador=0
            textito.text=contador.toString()
        }

botoncito.setOnClickListener{

    conteo()
Log.i("Conteo","Se ha pulsado $contador veces")
}



    }



    fun conteo(){

        if(conteoArriba){
            contador = contador.inc()
            if(contador==10){
                conteoArriba=false
            }

            }else{
                contador=contador.dec()
            if(contador==0){
                conteoArriba=true
            }
            }










        textito.text= contador.toString()

    }
}