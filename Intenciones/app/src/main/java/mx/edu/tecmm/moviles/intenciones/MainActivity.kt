package mx.edu.tecmm.moviles.intenciones

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPantallita:Button
    lateinit var btnPaginita:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPaginita=findViewById(R.id.btnPagina)
        btnPantallita=findViewById(R.id.btnaPantalla)



        btnPaginita.setOnClickListener{
            val aPagina  = Intent(Intent.ACTION_VIEW)
            aPagina.data = Uri.parse("https://google.com.mx")
            startActivity(aPagina)
        }
    }
}