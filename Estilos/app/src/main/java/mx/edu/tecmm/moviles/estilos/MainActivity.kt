package mx.edu.tecmm.moviles.estilos

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var txtCursiva:CheckBox
    lateinit var txtNegrita:CheckBox
    lateinit var txtNombre:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCursiva=findViewById(R.id.chckCursivas)
        txtNegrita=findViewById(R.id.chckNegritas)
        txtNombre=findViewById(R.id.edNombre)
    }

    fun clickCheck(view:View){

txtNombre.typeface= Typeface.DEFAULT

        if(txtCursiva.isChecked&&txtNegrita.isChecked){

            txtNombre.typeface=Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)

        } else if (txtNegrita.isChecked){
            txtNombre.typeface = Typeface.defaultFromStyle(Typeface.BOLD)

        } else if (txtCursiva.isChecked){

            txtNombre.typeface= Typeface.defaultFromStyle(Typeface.ITALIC)
        }

    }


}